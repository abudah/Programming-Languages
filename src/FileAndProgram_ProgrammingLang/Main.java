package FileAndProgram_ProgrammingLang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        
          try{
            Class.forName("com.mysql.cj.jdbc.Driver");
              
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
            System.out.println("Connection Created");
//            Statement stmnt= con.createStatement();
//            ResultSet rs=stmnt.executeQuery("select* from emp");
//            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
        ProlangOperations operations=new ProlangOperations();
        char c='Y';
        while(c=='Y' || c=='y'){
            System.out.println("welcome...........\n");
            System.out.println("===What Operation Do you wanted to perform: \n  ");
            Scanner sc3=new Scanner(System.in);
            Scanner sc4=new Scanner(System.in);
            System.out.println("1. Add new Programming language to the list");
            System.out.println("2. Delete the Programming language from the list");
            System.out.println("3. Sort the Programming languages in the list");
            System.out.println("4. Display the Programming languages in the list");
            System.out.println("5. Search the Programming languages in the list");
            System.out.println("6. Modify the Programming languages in the list");
            System.out.println("Please Enter your Choice: ");
            int choice=sc3.nextInt();
            switch (choice){
                case 1:
                    operations.addProlang();
                    break;
                case 2:
                    operations.deleteProlang();
                    break;
                case 3:
                    operations.sortProLangs();
                    break;
                case 4:
                    operations.displayProLangs();
                    break;
                case 5:
                    operations.searchProLangs();
                    break;
                case 6:
                    operations.modifyProLangs();
                    break;                    
                default:
                    System.out.println("You have entered the incorrect input. ");
                    break;
            }
            System.out.println("Do you want to continue the operation: (Y/N) \n");
            char l=sc4.next().charAt(0);
            c=l;
        }

       }


    }
