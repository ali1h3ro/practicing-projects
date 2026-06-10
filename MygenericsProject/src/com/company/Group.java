package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Group <T extends Human> implements Comparable<Group<T>> {

    private ArrayList<T> group;
    private int rank =0;

    public Group(int rank) {
        this.group = new ArrayList<>();
       this.rank = rank;
    }

    public boolean add(T nationality){
        if(group.contains(nationality)) return false;
        this.group.add(nationality);
        return true;
    }

    public boolean delete(T nationality){
        if(group.contains(nationality)) {
            group.remove(nationality);
            return true;
        }
        else return false;
    }

    public int getRank() {
        return rank;
    }

    public void sortPeople(){
           Collections.sort(this.group);
           for (T s : this.group){
               System.out.println(s.getName());
           }
       }
    @Override
    public int compareTo(Group<T> o) {
        if (this.rank < o.rank){
            return 1;
        }
        else if (this.rank > o.rank){
            return -1;
        }
        return 0;

    }
}
