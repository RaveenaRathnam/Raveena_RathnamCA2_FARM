package org.example;

import java.util.Comparator;

public class WeightComparator implements Comparator<Animal> {
    int num;
    @Override
    public int compare(Animal a1, Animal a2) {
           if(a1 instanceof BeefCow && a2 instanceof BeefCow ) {
               if (((BeefCow) a1).getWeight() < ((BeefCow) a2).getWeight()) {
                   num= -1;    // a negative value
               } else if (((BeefCow) a1).getWeight() == ((BeefCow) a2).getWeight()){
                   num= 0;
               } else {
                   num=1;
               }
           } else if (a1 instanceof Sheep && a2 instanceof Sheep) {
               if (((Sheep) a1).getWeight() < ((Sheep) a2).getWeight()) {
                   num= -1;    // a negative value
               } else if (((Sheep) a1).getWeight() == ((Sheep) a2).getWeight()){
                   num= 0;
               } else {
                   num=1;
               }
           }else{
               num=0;
           }
        return num;
        }
    }

