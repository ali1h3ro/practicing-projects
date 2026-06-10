package com.company;

import java.util.ArrayList;


public abstract class Human implements Comparable<Human>{

          private String name;
          private String color;
          private String religion;
          private String mental_state;
          private int rank;
    public Human(String name, String color, String religion, String mental_state,int rank) {
        this.name = name;
        this.color = color;
        this.religion = religion;
        this.mental_state = mental_state;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getReligion() {
        return religion;
    }

    public String getMental_state() {
        return mental_state;
    }


    @Override
    public int compareTo(Human o) {

            if (this.rank < o.rank){
                return 1;
            }
            else if (this.rank > o.rank){
                return -1;
            }
            return 0;

    }
}
