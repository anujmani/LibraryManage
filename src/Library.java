import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java .io.File;
import java.util.Scanner;
public class Library {
    static String str,date,date1; //static=to remember the last value;
    static  int id,numiss;
    void add()throws IOException
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Book Name");
 
        String str=sc.nextLine();
        System.out.println("Your submitted details are: "+ str );
        FileWriter fw=new FileWriter("Book.txt",true);
 
        fw.write("\n"+str);  
 
        fw.close();    
    }
 
    void iss()throws IOException
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Student_Name: ");
        String name=obj.nextLine();
        File file = new File("C:\\Users\\ACER\\Desktop\\LMS\\Book.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        System.out.println("Book Name: ");
        str=obj.nextLine();
        boolean flag=true;
        while ((st = br.readLine()) != null){
            //System.out.println(st);
            //st=br.readLine();
 
            // while(st!=null){
            if(str.equals(st)){
                flag=false;
                break;
            }
            st=br.readLine();
        }
 
            //}
            if(flag==false){
                System.out.println("Book ID: ");
                id=obj.nextInt();
                obj.nextLine();
                System.out.println("Issue Date: ");
                date=obj.nextLine();
                System.out.println("Total number of Book Issued: ");
                numiss=obj.nextInt();
                obj.nextLine();
                System.out.println("Return book date: ");
                date1=obj.nextLine();
 
                FileWriter fw=new FileWriter("Detail.txt",true);
                fw.write("\n Student_Name: "+name); 
                fw.write("\n Book Name: "+Library.str);  
                fw.write("\n Book ID: "+Library.id); 
                fw.write("\n Issue Date: "+Library.date); 
                fw.write("\n Total number of Book Issued: "+Library.numiss); 
                fw.write("\n Book Return Date: "+Library.date1); 
                fw.write("\n *****SAVED*****");
                fw.write("\n");
                fw.close();    
                System.out.println("You can check the data in Detail txt file"); 
                //br.close();
            }
            else{
                System.out.println("Book not available");
            }

    }
 
    int getid()
    {
        return id;
    }
 
    void ret()
    {
        System.out.println("Enter Student_Name and Book_ID");
        Scanner obj2=new Scanner(System.in);
        String name=obj2.nextLine();
        int bookid=obj2.nextInt();
        if(id==bookid)
        {
            System.out.println("Total Deatils");
            System.out.println("Student_Name: "+name);
            System.out.println("Book Name: "+Library.str);
            System.out.println("Book ID: "+Library.id);
            System.out.println("Issue Date: "+Library.date);
            System.out.println("Book Return Date: "+Library.date1);
            System.out.println("Total number of Book Issued: "+Library.numiss);
 
        }
        else
        {
            System.out.println("Wrong id, please enter correct id");
        }
 
    }
 
    void detail()
    {
        System.out.println("Book Name: "+Library.str);
        System.out.println("Book ID: "+Library.id);
        System.out.println("Issue Date: "+Library.date);
 
        System.out.println("Book Return Date: "+Library.date1);
        System.out.println("Total number of Book Issued: "+Library.numiss);
 
    }
 
    void exit()
    {
        System.exit(0);
    }
}  