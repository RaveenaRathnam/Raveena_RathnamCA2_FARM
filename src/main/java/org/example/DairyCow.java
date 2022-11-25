package org.example;

import java.util.Random;

public class DairyCow {
    private  int cowID;
    private String name;
    private  int udders;
    private static int count=0;

    public DairyCow(){
        String [] name={"Tom","May","Kosy","Jakub","Anna","Criss","Tony"};
        Random rand=new Random();
        this.name=name[rand.nextInt(name.length)];
        this.cowID=count++;
    }
    public void Cow(String name){
        this.name=name;
        this.cowID=count++;
    }

    public String getName() {
        return name;
    }
    public int getCapacity() {
        this.udders=new Random().nextInt(21)+20;
        return udders;
    }
    @Override
    public String toString() {
        return "DairyCow{" +
                "cowID=" + cowID +
                ", name='" + name + '\'' +
                ", udders=" + udders +
                '}';
    }
}
