package org.example;


public class Goat extends Animal implements IMilkable {


    private static final int MIN_CAPACITY=2;
    private static final int MAX_CAPACITY=3;
    private int udderCapacity;


    public Goat(){
        super();
        this.udderCapacity=RANDOM(MAX_CAPACITY,MIN_CAPACITY);
    }
    public Goat(String name){
        super(name);
        this.udderCapacity=RANDOM(MAX_CAPACITY,MIN_CAPACITY);
    }



    public double getCapacity() {
        return this.udderCapacity;
    }

    public double milk() {
        return RANDOM(this.udderCapacity,0);
    }
    @Override
    public String toString() {
        return super.toString() +","+
                "udderCapacity=" + udderCapacity+" liters\n" ;
    }


}

