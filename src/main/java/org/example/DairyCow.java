package org.example;

public class DairyCow extends Animal implements IMilkable {


    private static final int MIN_CAPACITY=20;
    private static final int MAX_CAPACITY=40;
    private int udderCapacity;


    //milk method specific to cow
    public DairyCow(){
     super();
     this.udderCapacity=RANDOM(MAX_CAPACITY,MIN_CAPACITY);
    }
    public DairyCow(String name){
        super(name);
        this.udderCapacity=RANDOM(MAX_CAPACITY,MIN_CAPACITY);
    }


    public double getCapacity() {
        return this.udderCapacity;
    }

    public double milk() {
        return RANDOM(this.udderCapacity,0);   /// return a random number betwee
    }



    @Override
    public String toString() {
        return "\nDairyCow{" +super.toString() +
                "udderCapacity=" + udderCapacity +
                '}';
    }
}
