package org.example;

import java.util.Comparator;

public class UdderCapacityComparator implements Comparator<Animal> {
    int num;
    @Override
    public int compare(Animal a1, Animal a2) {

        if (a1 instanceof IMilkable && a2 instanceof IMilkable) {
            if (((IMilkable) a1).getCapacity() < ((IMilkable) a2).getCapacity()) {
                num= -1;    // a negative value
            } else if ( ((IMilkable) a1).getCapacity() == ((IMilkable) a2).getCapacity()) {
                num= 0;
            } else {
                num= 1;
            }
        }
        return num;
    }
}
