package org.example;

public class BeefCow extends Animal {


    private double weight;
    private int age;
    private Pedigree pedigree;


    public BeefCow(double weight,int age,Pedigree pedigree){
        super();

        this.weight=weight;
        this.age=age;
        this.pedigree=pedigree;
    }
    public BeefCow(String name, double weight,int age,Pedigree pedigree){
        super(name);

        this.weight=weight;
        this.age=age;
        this.pedigree=pedigree;
    }





    public double getWeight() {
        return weight;
    }

    public void  setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pedigree getPedigree() {
        return pedigree;
    }

    public void setPedigree(Pedigree pedigree) {
        this.pedigree = pedigree;
    }

    @Override
    public String toString() {
        return "\nBeefCow{" + super.toString() +
                ", weight=" + weight +
                ", age=" + age +
                ", pedigree='" + pedigree + '\'' +
                '}';
    }
}
