package org.example;

import java.util.Random;

public abstract class Animal implements Comparable<Animal> {

    private int ID;
    private String name;

    private static int count=0;

    public Animal(){
        String [] name={"Tom","May","Kosy","Jakub","Anna","Criss","Tony","Maggi"};
        Random rand=new Random();
        this.name=name[rand.nextInt(name.length)];
        this.ID=this.count++;
    }

    public  Animal(String name){
        this.name=name;
       this.ID=this.count++;
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getCount() {
        return count;//count of all animals
    }
    public int RANDOM(int max,int min){
        Random rand=new Random();
        int x=rand.nextInt((max-min)+1) + min;
        return x;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() +
                "ID=" + ID +
                ", name='" + name + '\'' ;
    }
    @Override
    public int compareTo( Animal otherAnimal ) {
        if( this.name.compareToIgnoreCase(otherAnimal.name)<0)        // will result in ascending order
            return -1;
        else if(this.name.compareToIgnoreCase(otherAnimal.name)== 0)
            return 0;
        else
            return 1;


    }

}
