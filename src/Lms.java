import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
public class Lms{
    public static void main(String []args)throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Librarian or Student");
            String a= sc.nextLine();
            if(a.equals("Student")|| a.equals("student")){
                System.out.println("Enter name");
                String n=sc.nextLine();
                System.out.println("Enter id no.");
                String id=sc.nextLine();
                System.out.println(studentcheck(id));
                if(studentcheck(id).equals("Allowed")){
                    Project pr= new Project();
                    pr.st();
                }
            }
            else if(a.equals("Librarian")|| a.equals("librarian")){
                System.out.println("Enter name");
                String n2= sc.nextLine();
                String we=check(n2);
                System.out.println(we);
                if(we=="Welcome!")
                {
                    System.out.println("1 for New Book");
                    System.out.println("2 for Report");
                    int y=sc.nextInt();
                    if(y==2)
                    {
                        // Java Program to illustrate reading from FileReader
                        File file = new File("C:\\Users\\ACER\\Desktop\\LMS\\Details.txt");
                        BufferedReader br = new BufferedReader(new FileReader(file));
                        String st;
                        while ((st = br.readLine()) != null)
                            System.out.println(st);
                    }
                    else if(y==1)
                    {
                        Library lol=new Library();
                        lol.detail();
                    }
                }
            }
    }

    public static String check(String n){ //to check password of librarian;
        String [] teach={"Rushna"};
        String p="Sunway12";
        String ch="";
        for(int i=0; i<teach.length;i++){
            if(n.equals(teach[i])){
                for (int passAttempts = 0; passAttempts < 3; passAttempts++)
                {
                    System.out.println("Enter Your Password: ");
                    Scanner input = new Scanner(System.in);
                    String inputPass = input.nextLine();
                    boolean f=true;
                    if (!(inputPass.equals(p)))
                    {
                        ch="Wrong password try again";
                    }
                    else
                    {
                        ch="Welcome!";
                        f=false;
                        break;
                    }
                }
            }
        }
        return ch;
    
    }
    public static String studentcheck(String id)throws IOException{ //to check password of student;
        BufferedReader fr=new BufferedReader(new FileReader("C:\\Users\\ACER\\Desktop\\LMS\\idd.txt"));
        String line=fr.readLine();
        boolean flag=true;
        int LineNum=1;
        String re;
        while(line!=null){
            if(id.equals(line)){
                flag=false;
                break;
            }
            line= fr.readLine();
            LineNum++;
        }
        if(flag==false){
            re="Allowed";
        }
        else{
            re="not allowed";
        }
        fr.close();
        return re;
    }
}
 
