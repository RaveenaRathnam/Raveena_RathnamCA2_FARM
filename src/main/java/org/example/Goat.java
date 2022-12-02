package org.example;


public class Goat extends Animal implements IMilkable {

    private static final int MIN_CAPACITY=10;
    private static final int MAX_CAPACITY=30;
    private int udderCapacity;

    public Goat(){
        super();
        this.udderCapacity=RANDOM(MAX_CAPACITY,MIN_CAPACITY);
    }
    public Goat(String name){
        super(name);
        this.udderCapacity=RANDOM(MAX_CAPACITY,MIN_CAPACITY);
    }

    public String getName() {
        return getName();
    }
    public double getCapacity() {
        return this.udderCapacity;
    }

    public double milk() {
        return RANDOM(this.udderCapacity,0);   /// return a random number betwee
    }
    @Override
    public String toString() {
        return super.toString() +","+
                "udderCapacity=" + udderCapacity+"\n" ;
    }


}

