package FileAndProgram_ProgrammingLang;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ProlangOperations {
    ArrayList<ProgrammingLanguage_1> proLangs= new ArrayList<ProgrammingLanguage_1>();
    ArrayList <String>  proLangsName= new ArrayList<String>();
    public void addProlang(){

        Scanner sc = new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter how many elements you wanted to insert:  ");
        int limit=sc2.nextInt();
        int id=1;
        for(int i=0; i<limit; i++) {
            //System.out.println("Enter the Id ");
           // String id = sc.nextLine();
            System.out.println("Enter the Programming name ");
            String name = sc.nextLine();
            System.out.println("Enter the author ");
            String author = sc.nextLine();
            ProgrammingLanguage_1 prolang = new ProgrammingLanguage_1(id, name, author);
            proLangs.add(prolang);
            proLangsName.add(prolang.name);
            id++;
                try {
                    FileWriter myWriter = new FileWriter("programmingLanguages.txt",true);
                    myWriter.write(prolang.name + " " +  prolang.author +" \n");
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                  } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }

        }
             System.out.println("New Programmingy  languages added Succesfully to the list.... ");
        System.out.println(proLangs);
        System.out.println(proLangsName);

    }

    public void deleteProlang(){
        Iterator it1= proLangsName.iterator();
        System.out.println(" Please select which Programming language to remove.\n");
        int i=1;
        while(it1.hasNext()){
            System.out.println(i+ ", "+it1.next());
            i++;
        }
        Scanner sc5=new Scanner(System.in);
        int DltedProlang= sc5.nextInt();
        System.out.println("Here we are deleting the " +( DltedProlang-1) + "element " );
        proLangs.remove(DltedProlang-1);
        proLangsName.remove(DltedProlang-1);
        System.out.println("finally succeeded to delete the element.");
        System.out.println(proLangs);
        //System.out.println(proLangsName);
        for (ProgrammingLanguage_1 pro : proLangs) {
            System.out.println(" --- " + pro.name);
        }
    }
    public void sortProLangs(){
        Collections.sort(proLangs, new NameComparator());
        for (ProgrammingLanguage_1 pro : proLangs) {
            System.out.println(" --- " + pro.name);
        }
        Collections.sort(proLangsName);
            }
    public void displayProLangs(){
        System.out.println(proLangs);
        System.out.println(proLangsName);
    }
    public void searchProLangs(){
        System.out.println("Enter the ID: /n");
        Scanner sc5=new Scanner(System.in);
        int SearchedProlang= sc5.nextInt();
        for(int i=1;i<proLangs.size();i++){
               if(SearchedProlang==i){
                   System.out.println("ID: " + proLangs.get(i).id+ "    \n " +" Name : " + proLangs.get(i).name +" \n " + "Author: " + proLangs.get(i).author);
               
        }
    }
    }
    public void modifyProLangs(){
        Iterator it1= proLangsName.iterator();
        System.out.println(" Please select which Programming language to Modify.\n");
        int i=1;
        while(it1.hasNext()){
            System.out.println(i+ ", "+it1.next());
            i++;
        }
        Scanner sc5=new Scanner(System.in);
        Scanner sc6=new Scanner(System.in);
        int modifiedProlang= sc5.nextInt();
        for(int j=1;j<proLangs.size();j++){
               if(modifiedProlang-1==j){
                   System.out.println("ID: " + proLangs.get(j).id+ "    \n " +" Name : " + proLangs.get(j).name +" \n " + "Author: " + proLangs.get(j).author);
               
        }
            
    }
        System.out.println("Enter The Modification Values ");
        System.out.println("Enter the Modified Name : ");
         String ModifName=sc6.nextLine();
        System.out.println("Enter the Modified Author : ");
         String ModifAuthor=sc6.nextLine();
         ProgrammingLanguage_1 ModifiedProLanguage = new ProgrammingLanguage_1(modifiedProlang-1, ModifName, ModifAuthor); 
         proLangs.set(modifiedProlang-1, new ProgrammingLanguage_1(modifiedProlang-1, ModifName, ModifAuthor));
         proLangsName.set(modifiedProlang-1,ModifName);
         
         
    }

}
