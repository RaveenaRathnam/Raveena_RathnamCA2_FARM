package org.example;

public class DairyCow extends Animal implements IMilkable {

    private static  int MAX_CAPACITY=20;
    private static  int MIN_CAPACITY=40;
    private int udderCapacity;

    //random amt of milk in range min->max
    //min-20
    //max-40
    //Same for all the diary cow
    //make milk min and max udder in dairy cow and goat static
    //static-share one value amongst all objects(instances)(class variable field)
    //max_capacity(double)set in constructor random value-20-40

    //Dairycow(int id,name){
    // super(id,name);//calls animal constructor
    //this.udderCapacity=Random(MIN_CAPACITY,MAX_CAPACITY);--make MIN_CAPACITY=20;MAX_CAPACITY=40--make them static int//random could go to utility class
    //}
    //milk(){
    //code to milk an animal-how much the cow will give us
    //return-a number between 0 and max.i.e.udderCapacity
    //return Random(0,udderCapacity);
//}

    //milk method specific to cow
    public DairyCow(){
     super();
     this.udderCapacity=RANDOM(MAX_CAPACITY,MIN_CAPACITY);
    }
    public DairyCow(String name){
        super(name);
        this.udderCapacity=RANDOM(MAX_CAPACITY,MIN_CAPACITY);
    }

    public String getName() {
        return getName();
    }
    public double getCapacity() {
        return this.udderCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +","+
                "udderCapacity=" + udderCapacity ;
    }

    public double milk() {
        return RANDOM(0,this.udderCapacity);   /// return a random number betwee
    }
}
