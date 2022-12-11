package org.example;

import java.util.ArrayList;


public class Farm {
    private int farmID;
    private String owner;
    private ArrayList<Shed> shedList;

    private static int count=0;
    public Farm(String owner) {
        this.farmID = count++;
        this.owner = owner;
        this.shedList =new ArrayList<>();
    }
    public void addShed(Shed shed){
        shedList.add(shed);
    }

    public int getFarmID() {
        return farmID;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<Shed> getShedList() {
        return shedList;
    }

    public void setShedList(ArrayList<Shed> shedList) {
        this.shedList = shedList;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "farmID=" + farmID +
                ", owner='" + owner + '\'' +
                ", shedList=" + shedList +
                '}';
    }
}
