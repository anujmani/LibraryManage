import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Project {
    void st()throws IOException
 
    {
        char res;
            do{
            System.out.println("*****Library Management System*****");
            System.out.println("Press 1 to add Book in cart");
            System.out.println("Press 2 to issue a book");
            System.out.println("Press 3 to return a book");
            System.out.println("Press 4 to print complete issue detail");
            System.out.println("Press 5 to exit");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any Number: ");
            int a=sc.nextInt();
            switch(a)
            {
                case 1:
                    Library first=new Library();
                    first.add();
                    break;
                case 2:
                    Library second=new Library();
                    second.iss();
                    break;
                case 3:
                    Library third=new Library();
                    third.ret();
                    break;
                case 4:
                    Library fourth=new Library();
                    fourth.detail();
                    break;
                case 5:
                    Library fifth=new Library();
                    fifth.exit();
                    break;
                default:
                    System.out.println("Invalid Number");
            }
            System.out.println("Do you want to select next option: ");
            res=sc.next().charAt(0);
        }while(res=='Y'|| res=='y');
            if(res=='N'||res=='n')
            {
                Library z=new Library();
                z.exit();
            }
    }
}