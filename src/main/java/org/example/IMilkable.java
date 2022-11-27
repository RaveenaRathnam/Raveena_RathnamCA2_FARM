package org.example;

public interface IMilkable {

    //contract-if want your class to be milkable then your interface must implement milkable
    //should have a method for milk()-code to milk an animal
    String getName();
     void setName(String name);
    int getID();
    void setID(int ID);
     double getCapacity();
}
