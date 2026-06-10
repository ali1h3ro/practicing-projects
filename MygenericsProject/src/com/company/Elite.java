package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//you wanna categorise elites from each country ... you don't wanna combine all the elites together
public class Elite<T extends Group> {

        ArrayList<T> elite_list;

    public Elite() {
        this.elite_list = new ArrayList<>();
    }
    public boolean add(T nationality){
        if(elite_list.contains(nationality)) return false;
        this.elite_list.add(nationality);
        return true;
    }

    public boolean delete(T nationality){
        if(elite_list.contains(nationality)) {
            elite_list.remove(nationality);
            return true;
        }
        else return false;
    }

    public void sortRanks(){
        Collections.sort(this.elite_list);
        for (T s : this.elite_list){
            System.out.println(s.getRank());
        }
    }

}
