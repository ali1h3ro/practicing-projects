package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

            Group<Iraqi> iraqiGroup = new Group<>(1);

              Iraqi iraqiFighters = new Iraqi("Ali","White","Non","Stable",10);

        iraqiGroup.add(iraqiFighters);
        iraqiGroup.add(new Iraqi("Mohammed","Black","Islam","Aggressive",1));
        iraqiGroup.add(new Iraqi("Zaid","Brown","Islam","calm",5));


                   iraqiGroup.sortPeople();


    }
}
