package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Farm {
    private int farmID;
    private String owner;
    private ArrayList<Shed> shedList;

    public Farm(int farmID, String owner) {
        this.farmID = farmID;
        this.owner = owner;
        this.shedList =new ArrayList<>();
    }
    public void addShed(Collection<Shed> sheds){
        shedList.add((Shed) sheds);
    }

    public int getFarmID() {
        return farmID;
    }

    public void setFarmID(int farmID) {
        this.farmID = farmID;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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
