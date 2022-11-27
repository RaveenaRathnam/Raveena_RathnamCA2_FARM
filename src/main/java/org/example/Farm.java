package org.example;

import java.util.ArrayList;

public class Farm {
    private int farmID;
    private String owner;
    private ArrayList<Shed> shedList;



    public Farm(int farmID, String owner, ArrayList<Shed> shed) {
        this.farmID = farmID;
        this.owner = owner;
        this.shedList = shed;
    }
    public void add(Shed shed)
    {
        shedList.add(shed);
    }


}
