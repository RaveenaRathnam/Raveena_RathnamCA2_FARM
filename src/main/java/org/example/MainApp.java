package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MainApp {

    public Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("FARM SIMULATOR");
        MainApp app = new MainApp();
        app.start();
    }

    public void start() {


//==========================================COW SHED============================================
        MilkTank milkTank1 = new MilkTank("DairyCowTank", 1500);
        MilkingMachine milkingMachine1 = new MilkingMachine();

        Shed shed1 = new Shed("CowShed",milkTank1);
        shed1.installMilkingMachine(milkingMachine1);
        loadCowShed(shed1,"Cows.txt");
//        DairyCow DC1 = new DairyCow("kosy");
//        DairyCow DC2 = new DairyCow();
//        DairyCow DC3 = new DairyCow();
//        BeefCow BC1 = new BeefCow(700, 12,Pedigree.DOMINANT);
//        BeefCow BC2 = new BeefCow(955, 10,Pedigree.RECESSIVE);
//        BeefCow BC3 = new BeefCow("mag", 850, 8,Pedigree.AUTOSOMAL);
//        shed1.addAnimal(DC1);
//        shed1.addAnimal(DC2);
//        shed1.addAnimal(DC3);
//        shed1.addAnimal(BC1);
//        shed1.addAnimal(BC2);
//        shed1.addAnimal(BC3);

        System.out.println(shed1.toString());
        //=======================================GOAT SHED=================================================
        MilkTank milkTank2 = new MilkTank("GoatTank", 1500);
        MilkingMachine milkingMachine2 = new MilkingMachine();
        Shed shed2 = new Shed("GoatShed",milkTank2);
        shed2.installMilkingMachine(milkingMachine2);

        Goat G1 = new Goat("kosy");
        Goat G2 = new Goat();
        Goat G3 = new Goat();

        shed2.addAnimal(G1);
        shed2.addAnimal(G2);
        shed2.addAnimal(G3);


        System.out.println(shed2.toString());
        //=======================================SHEEP SHED=================================================
        Shed shed3 = new Shed("SheepShed");


        Sheep S1 = new Sheep("kosy", 540, 10, Pedigree.SEX_LINKED);
        Sheep S2 = new Sheep(200, 8, Pedigree.DOMINANT);
        Sheep S3 = new Sheep(460, 15, Pedigree.RECESSIVE);

        shed3.addAnimal(S1);
        shed3.addAnimal(S2);
        shed3.addAnimal(S3);


        System.out.println(shed3.toString());


//===========================================MENU====================================
        System.out.println("================== FARM SIMULATOR ===============");
        System.out.println("");
        int choice=0;

do {


    System.out.println("\n\n0-EXIT");
    System.out.println("1-Add an Animal to a Shed.");
    System.out.println("2-Milk all the animals in a Shed.");
    System.out.println("3-Milk an animal in a Shed.");
    System.out.println("4-Collect certain amount of Milk in a shed.");
    System.out.println("5-Collect all the Milk in a shed.");
    System.out.println("6-Search an Animal in a Shed.");
    System.out.println("7-Remove an Animal in a Shed.");
    System.out.println("8-Edit an Animal in a Shed.");
    System.out.println("9-Sort Animals in a Shed.");
    System.out.println("10-Print all Animals in a Shed.");
    System.out.println("11-Sort Milkable Animals with udder Capacity");
    System.out.println("12-Sort Non-Milkable Animals with weight.");
    System.out.println("Please enter your choice:");
    choice = sc.nextInt();

    switch (choice) {
        case 0:
            System.out.println("=============");
            System.out.println("| Thank you |");
            System.out.println("=============");
            break;
        case 1:
            addAnimalToShed(shed1, shed2, shed3);
            break;
        case 2:
            milkAllAnimalsInShed(shed1, shed2);
            break;
        case 3:
            milkAnAnimalInShed(shed1, shed2);
            break;
        case 4:
            getCertainAmtMilkInShed(shed1, shed2);
            break;
        case 5:
            getAllMilkInShed(shed1,shed2);
            break;
        case 6:
            getAnimalInShedByID(shed1,shed2,shed3);
            break;
        case 7:
            removeAnimalInShedByID(shed1,shed2,shed3);
            break;
        case 8:
            editAnimalInShedByID(shed1,shed2,shed3);
            break;
        case 9:
            sortAnimalsInShedByName(shed1);
            sortAnimalsInShedByName(shed2);
            sortAnimalsInShedByName(shed3);
            break;
        case 10:
            printAllAnimalsInShed(shed1);
            printAllAnimalsInShed(shed2);
            printAllAnimalsInShed(shed3);
            break;
        case 11:
            SortAnimalUdderCapacity(shed1,shed2);
            break;
        case 12:
            SortAnimalWeight(shed1,shed3);
            break;
        default:
            System.out.println("Invalid input!!");
    }
}
        while (choice!=0);


    }




    public void addAnimalToShed(Shed shed1,Shed shed2,Shed shed3)
    {
        char ch;
        Pedigree p = null;
        double weight;
        int option;
        int age;
        System.out.println("Please enter your choice of animal you would like to add:");
        System.out.println("1-DairyCow");
        System.out.println("2-BeefCow");
        System.out.println("3-Goat");
        System.out.println("4-sheep");
        int choice= sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Please enter your choice to have a customised name: ");
                System.out.println("'N' for No");
                System.out.println("'Y' for Yes");
                 ch=Character.toUpperCase(sc.next().charAt(0));
                if(ch=='Y')
                {
                    System.out.println("Please enter the name:");
                    sc.nextLine();
                    String name=sc.nextLine();
                    shed1.addAnimal(new DairyCow(name));
                    System.out.println("DairyCow with name '"+name+"' has been added");
                }
                else
                {
                    shed1.addAnimal(new DairyCow());
                    System.out.println("DairyCow with Random name has been added");
                }
                break;
            case 2:
              System.out.println("Please enter the weight:");
              weight=sc.nextDouble();
              System.out.println("Please enter the age:");
              age=sc.nextInt();
              System.out.println("Please enter the option for pedigree:");
              System.out.println("1-DOMINANT");
              System.out.println("2-RECESSIVE");
              System.out.println("3-AUTOSOMAL");
              System.out.println("4-SEX_LINKED");
              option= sc.nextInt();
              switch (option){
                  case 1:
                      p=Pedigree.DOMINANT;
                      break;
                  case 2:
                      p=Pedigree.RECESSIVE;
                      break;
                  case 3:
                      p=Pedigree.AUTOSOMAL;
                      break;
                  case 4:
                      p=Pedigree.SEX_LINKED;

                  default:
                      System.out.println("Invalid input");
              }
                System.out.println("Please enter your choice to have a customised name: ");
                System.out.println("'N' for No");
                System.out.println("'Y' for Yes");
                ch=Character.toUpperCase(sc.next().charAt(0));
                if(ch=='Y')
                {
                    System.out.println("Please enter the name:");
                    sc.nextLine();
                    String name=sc.nextLine();
                    shed1.addAnimal(new BeefCow(name,weight,age,p));
                    System.out.println("BeefCow with name "+name+" has been added");
                }
                else if(ch=='N')
                {
                    shed1.addAnimal(new BeefCow(weight,age,p));
                    System.out.println("BeefCow with Random name has been added");
                }
                 else
            {
                System.out.println("Invalid input");
            }
                break;
            case 3:
                System.out.println("Please enter your choice to have a customised name: ");
                System.out.println("'N' for No");
                System.out.println("'Y' for Yes");
                 ch =Character.toUpperCase(sc.next().charAt(0));
                if(ch =='Y')
                {
                    System.out.println("Please enter the name:");
                    sc.nextLine();
                    String name=sc.nextLine();
                    shed2.addAnimal(new Goat(name) );
                    System.out.println("Goat with name '"+name+"' has been added");
               }
                else if(ch=='N')
                {
                    shed2.addAnimal(new Goat());
                    System.out.println("Goat with Random name has been added");
                }
                else
                {
                    System.out.println("Invalid input");
                }
                break;
            case 4:
                System.out.println("Please enter the weight:");
                weight=sc.nextDouble();
                System.out.println("Please enter the age:");
                age=sc.nextInt();
                System.out.println("Please enter the option for pedigree:");
                System.out.println("1-DOMINANT");
                System.out.println("2-RECESSIVE");
                System.out.println("3-AUTOSOMAL");
                System.out.println("4-SEX_LINKED");
                option= sc.nextInt();
                switch (option){
                    case 1:
                        p=Pedigree.DOMINANT;
                        break;
                    case 2:
                        p=Pedigree.RECESSIVE;
                        break;
                    case 3:
                        p=Pedigree.AUTOSOMAL;
                        break;
                    case 4:
                        p=Pedigree.SEX_LINKED;
                        break;
                    default:
                        System.out.println("Invalid input");
                }
                System.out.println("Please enter your choice to have a customised name: ");
                System.out.println("'N' for No");
                System.out.println("'Y' for Yes");
                ch=Character.toUpperCase(sc.next().charAt(0));
                if(ch=='Y')
                {
                    System.out.println("Please enter the name:");
                    sc.nextLine();
                    String name=sc.nextLine();
                    shed3.addAnimal(new Sheep(name,weight,age,p));
                    System.out.println("Sheep with name "+name+" has been added");
                }
                else if(ch=='N')
                {
                    shed3.addAnimal(new Sheep(weight,age,p));
                    System.out.println("Sheep with Random name has been added");
                }
                else
                {
                    System.out.println("Invalid input");
                }
                break;
            default:
                System.out.println("Invalid input!");


        }
    }
    private void milkAllAnimalsInShed(Shed shed1, Shed shed2) {
        System.out.println("Please enter your choice for milking all the animals in:");
        System.out.println("C-Cow Shed");
        System.out.println("G-Goat Shed");
        char ch =Character.toUpperCase(sc.next().charAt(0));
        if(ch=='C')
        {
            shed1.milkAllAnimal();
        }
        else if(ch=='G')
        {
            shed2.milkAllAnimal();
        }
        else
        {
            System.out.println("Invalid input!");
        }
    }
    private void milkAnAnimalInShed(Shed shed1, Shed shed2) {
        System.out.println("Please enter your choice for milking an animals in:");
        System.out.println("C-Cow Shed");
        System.out.println("G-Goat Shed");
        char ch =Character.toUpperCase(sc.next().charAt(0));
        if(ch=='C') {
            System.out.println("Please enter the id of the cow to milk it");
            int cID = sc.nextInt();
            boolean idFound=false;
            for (int i = 0; i < shed1.getAnimalList().size(); i++) {
                if(shed1.getAnimalList().get(i).getID()==cID) {
                    idFound=true;
                    shed1.milkAnimal(shed1.getAnimalList().get(i));
                    break;
                }
            }
          if(!idFound)
          {
              System.out.println("Id not found");
          }
        }
        else if(ch=='G') {
            System.out.println("Please enter the id of the goat to milk it");
            int gID = sc.nextInt();
            boolean idFound=false;
            for (int i = 0  ; i < shed2.getAnimalList().size(); i++) {
                 if(shed2.getAnimalList().get(i).getID()==gID){
                    idFound=true;
                    shed2.milkAnimal(shed2.getAnimalList().get(i));
                    break;
                }
            }
            if(!idFound)
            {
                System.out.println("Id not found");
            }
        }
        else
        {
            System.out.println("Invalid input!");
        }
    }
    private void getCertainAmtMilkInShed(Shed shed1, Shed shed2) {
        System.out.println("Please enter your choice to get a certain amount of milk in the shed:");
        System.out.println("C-Cow Shed");
        System.out.println("G-Goat Shed");
        char ch =Character.toUpperCase(sc.next().charAt(0));
        if(ch=='C') {
            System.out.println("Please enter the amount of milk you would like to get from the Cow Shed:");
            int cAmt = sc.nextInt();
            System.out.println("Amount Taken is:"+shed1.getMilkTank().getFromTank(cAmt));
        }
        else if(ch=='G') {
            System.out.println("Please enter the amount of milk you would like to get from The Goat Shed:");
            int gAmt = sc.nextInt();
            System.out.println("Amount Taken is:"+shed2.getMilkTank().getFromTank(gAmt));
        }
        else
        {
            System.out.println("Invalid input!");
        }

    }
    private void getAllMilkInShed(Shed shed1, Shed shed2) {
        System.out.println("Please enter your choice to get a certain amount of milk in the shed:");
        System.out.println("C-Cow Shed");
        System.out.println("G-Goat Shed");
        char ch =Character.toUpperCase(sc.next().charAt(0));
        if(ch=='C') {
            double cAmt=shed1.getMilkTank().getCurrentAmount();
            System.out.println("Amount Taken is:"+shed1.getMilkTank().getFromTank(cAmt)+" liters");
        }
        else if(ch=='G') {
            double gAmt=shed2.getMilkTank().getCurrentAmount();
            System.out.println("Amount Taken is:"+shed2.getMilkTank().getFromTank(gAmt)+" liters");
        }
        else
        {
            System.out.println("Invalid input!");
        }
    }
    private void getAnimalInShedByID(Shed shed1, Shed shed2, Shed shed3) {
        System.out.println("Please enter your choice for searching for an animal in :");
        System.out.println("C-Cow Shed");
        System.out.println("G-Goat Shed");
        System.out.println("S-Sheep Shed");
        char ch =Character.toUpperCase(sc.next().charAt(0));
        if(ch=='C') {
            System.out.println("Please enter the id of the cow to search for it:");
            int cID = sc.nextInt();
            boolean idFound=false;
            for (int i = 0; i < shed1.getAnimalList().size(); i++) {
                if(shed1.getAnimalList().get(i).getID()==cID) {
                    idFound=true;
                    System.out.println(shed1.getAnimalList().get(i).toString());
                    break;
                }
            }
            if(!idFound)
            {
                System.out.println("Id not found");
            }
        }
        else if(ch=='G') {
            System.out.println("Please enter the id of the goat to search for it:");
            int gID = sc.nextInt();
            boolean idFound=false;
            for (int i = 0; i < shed2.getAnimalList().size(); i++) {
                if(shed2.getAnimalList().get(i).getID()==gID) {
                    idFound=true;
                    System.out.println(shed2.getAnimalList().get(i).toString());
                    break;
                }
            }
            if(!idFound)
            {
                System.out.println("Id not found");
            }
        }
        else if(ch=='S') {
            System.out.println("Please enter the id of the sheep to search for it:");
            int sID = sc.nextInt();
            boolean idFound=false;
            for (int i = 0; i < shed3.getAnimalList().size(); i++) {
                if(shed3.getAnimalList().get(i).getID()==sID) {
                    idFound=true;
                    System.out.println(shed3.getAnimalList().get(i).toString());
                    break;
                }
            }
            if(!idFound)
            {
                System.out.println("Id not found");
            }
        }
        else
        {
            System.out.println("Invalid input!");
        }
    }
    private void removeAnimalInShedByID(Shed shed1, Shed shed2, Shed shed3) {
        System.out.println("Please enter your choice for removing for an animal in :");
        System.out.println("C-Cow Shed");
        System.out.println("G-Goat Shed");
        System.out.println("S-Sheep Shed");
        char ch =Character.toUpperCase(sc.next().charAt(0));
        if(ch=='C') {
            System.out.println("Please enter the id of the cow to remove it:");
            int cID = sc.nextInt();
            boolean idFound=false;
            for (int i = 0; i < shed1.getAnimalList().size(); i++) {
                if(shed1.getAnimalList().get(i).getID()==cID) {
                    idFound=true;
                    shed1.getAnimalList().remove(i);
                    break;
                }
            }

            if(!idFound)
            {
                System.out.println("Id not found");
            }
            else {
                System.out.println("The cow with id "+cID+" has been removed.");
            }
        }
        else if(ch=='G') {
            System.out.println("Please enter the id of the goat to remove it:");
            int gID = sc.nextInt();
            boolean idFound=false;
            for (int i = 0; i < shed2.getAnimalList().size(); i++) {
                if(shed2.getAnimalList().get(i).getID()==gID) {
                    idFound=true;
                    shed2.getAnimalList().remove(i);
                    break;
                }
            }

            if(!idFound)
            {
                System.out.println("Id not found");
            }
            else
            {
                System.out.println("The goat with id "+gID+" has been removed.");
            }
        }
        else if(ch=='S') {
            System.out.println("Please enter the id of the sheep to remove it:");
            int sID = sc.nextInt();
            boolean idFound=false;
            for (int i = 0; i < shed3.getAnimalList().size(); i++) {
                if(shed3.getAnimalList().get(i).getID()==sID) {
                    idFound=true;
                    shed3.getAnimalList().remove(i);
                    break;
                }
            }

            if(!idFound)
            {
                System.out.println("Id not found");
            }
            else{
                System.out.println("The sheep with id "+sID+" has been removed.");
            }
        }
        else
        {
            System.out.println("Invalid input!");
        }
    }
    private void editAnimalInShedByID(Shed shed1, Shed shed2, Shed shed3) {
        char option;
        System.out.println("Please enter your choice for editing for an animal in :");
        System.out.println("C-Cow Shed");
        System.out.println("G-Goat Shed");
        System.out.println("S-Sheep Shed");
        char ch =Character.toUpperCase(sc.next().charAt(0));
        if(ch=='C') {
            System.out.println("Please enter the id of the cow to edit it:");
            int cID = sc.nextInt();
            boolean idFound = false;
            for (int i = 0; i < shed1.getAnimalList().size(); i++) {
                if (shed1.getAnimalList().get(i).getID() == cID) {
                    idFound = true;
                    if (shed1.getAnimalList().get(i) instanceof DairyCow) {
                        System.out.println("Enter new name:");
                        sc.nextLine();
                        String editedName = sc.nextLine();
                        shed1.getAnimalList().get(i).setName(editedName);
                    } else {
                        do{
                        System.out.println("Please enter your option to edit:");
                        System.out.println("1-Name");
                        System.out.println("2-weight");
                        System.out.println("3-age");
                        System.out.println("4-exit");
                         option = sc.next().charAt(0);
                        BeefCow bc = (BeefCow) shed1.getAnimalList().get(i);

                            switch (option) {
                                case '1':
                                    System.out.println("Enter new name:");
                                    sc.nextLine();
                                    String editedName = sc.nextLine();
                                    bc.setName(editedName);
                                    break;
                                case '2':
                                    System.out.println("Enter new weight:");
                                    double editedweight = sc.nextDouble();
                                    bc.setWeight(editedweight);
                                    break;
                                case '3':
                                    System.out.println("Enter new age;");
                                    int editedage = sc.nextInt();
                                    bc.setAge(editedage);
                                    break;
                                case '4':
                                    System.out.println("Exiting..");
                                    break;
                                default:
                                    System.out.println("invalid choice!");
                            }

                        } while (option != '4');
                    }
                        break;
                }
            }

            if(!idFound)
            {
                System.out.println("Id not found");
            }
            else {
                System.out.println("The cow with id "+cID+" has been edited.");
            }
        }
        else if(ch=='G') {
            System.out.println("Please enter the id of the goat to edit it:");
            int gID = sc.nextInt();
            boolean idFound=false;
            for (int i = 0; i < shed2.getAnimalList().size(); i++) {
                if(shed2.getAnimalList().get(i).getID()==gID) {
                    idFound=true;
                    System.out.println("Enter new name:");
                    sc.nextLine();
                    String editedName=sc.nextLine();
                    shed2.getAnimalList().get(i).setName(editedName);
                    break;
                }
            }

            if(!idFound)
            {
                System.out.println("Id not found");
            }
            else {
                System.out.println("The goat with id "+gID+" has been edited.");
            }
        }
        else if(ch=='S') {
            System.out.println("Please enter the id of the sheep to edit it:");
            int sID = sc.nextInt();
            boolean idFound=false;
            for (int i = 0; i < shed3.getAnimalList().size(); i++) {
                if(shed3.getAnimalList().get(i).getID()==sID) {
                    idFound=true;
                    do{
                    System.out.println("Please enter your option to edit:");
                    System.out.println("1-Name");
                    System.out.println("2-weight");
                    System.out.println("3-age");
                    System.out.println("4-exit");
                     option=sc.next().charAt(0);
                    Sheep s= (Sheep) shed1.getAnimalList().get(i);

                        switch (option) {
                            case '1':
                                System.out.println("Enter new name:");
                                sc.nextLine();
                                String editedName = sc.nextLine();
                                 s.setName(editedName);
                                break;
                            case '2':
                                System.out.println("Enter new weight:");
                                double editedweight = sc.nextDouble();
                                 s.setWeight(editedweight);
                                 break;
                            case '3':
                                System.out.println("Enter new age;");
                                int editedage=sc.nextInt();
                                s.setAge(editedage);
                                break;
                            case '4':
                                System.out.println("Exiting..");
                                break;
                            default:
                                System.out.println("invalid choice!");
                        }
                    }while(option!='4');

                    break;
                }
            }

            if(!idFound)
            {
                System.out.println("Id not found");
            }
            else {
                System.out.println("The sheep with id "+sID+" has been edited.");
            }
        }
        else
        {
            System.out.println("Invalid input!");
        }
    }
    private ArrayList<Animal> sortAnimalsInShedByName(Shed shed) {
        ArrayList<Animal> a=shed.getAnimalList();
        Collections.sort(a);
        return a;
    }
    private void printAllAnimalsInShed(Shed shed) {

            System.out.println(shed.toString());

    }

    private void SortAnimalUdderCapacity(Shed shed1,Shed shed2) {
        UdderCapacityComparator udderCapacityComparator= new UdderCapacityComparator();
        System.out.println("Please enter your choice for sorting animals according to udder capacity in:");
        System.out.println("C-Cow Shed");
        System.out.println("G-Goat Shed");
        char ch =Character.toUpperCase(sc.next().charAt(0));
        if(ch=='C') {
            Collections.sort( shed1.getAnimalList(), udderCapacityComparator);
        }
        else if(ch=='G') {
            Collections.sort( shed2.getAnimalList(), udderCapacityComparator);
        }
        else
        {
            System.out.println("Invalid input!");
        }
    }
    private void SortAnimalWeight(Shed shed1,Shed shed3) {
        WeightComparator weightComparator= new WeightComparator();
        System.out.println("Please enter your choice for sorting animals according to weight in:");
        System.out.println("C-Cow Shed");
        System.out.println("G-Goat Shed");
        char ch =Character.toUpperCase(sc.next().charAt(0));
        if(ch=='C') {
            Collections.sort( shed1.getAnimalList(),weightComparator);
        }
        else if(ch=='G') {
            Collections.sort( shed3.getAnimalList(),weightComparator);
        }
        else
        {
            System.out.println("Invalid input!");
        }
    }
    private void loadCowShed(Shed shed,String filename) {
        System.out.println("In loadCowShed() - Loading  Cow data records from the text file");
        File input=new File(filename);
        try (Scanner scanner = new Scanner(input))  // try-with-resources style
        {
            scanner.useDelimiter("[,\r\n]+");     // set comma and newline as the delimiters

            while (scanner.hasNext())
            {
                String  type = scanner.next();
                 if(type.equalsIgnoreCase("DairyCow"))
                 {
                      String name=scanner.next();

                           shed.addAnimal(new DairyCow(name));

                 }
                  if(type.equalsIgnoreCase("BeefCow"))
                  {
                      String name=scanner.next();
                      double weight=scanner.nextDouble();
                      int age=scanner.nextInt();
                      String pedigree=scanner.next();
                      Pedigree p;
                      if(pedigree.equalsIgnoreCase(String.valueOf(Pedigree.DOMINANT)))
                      {
                           p=Pedigree.DOMINANT;
                      }else if (pedigree.equalsIgnoreCase(String.valueOf(Pedigree.RECESSIVE))) {
                           p=Pedigree.RECESSIVE;
                      }else if (pedigree.equalsIgnoreCase(String.valueOf(Pedigree.AUTOSOMAL))) {
                           p=Pedigree.AUTOSOMAL;
                      }else if (pedigree.equalsIgnoreCase(String.valueOf(Pedigree.SEX_LINKED))) {
                           p=Pedigree.SEX_LINKED;
                      }
                      else
                      {
                          p = null;
                      }

                          shed.addAnimal(new BeefCow(name,weight,age,p));

                  }


            }

        } catch (FileNotFoundException exception) {
            System.out.println("FileNotFoundException caught." + exception);
        } catch (InputMismatchException exception) {
            System.out.println("InputMismatchException caught." + exception);
        }
    }

}

