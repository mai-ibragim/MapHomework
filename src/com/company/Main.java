package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Car, Auto> car = new HashMap<>();
        car.put(new Car(2332, 01), new Auto(2020, "Audi", 20000, "Black"));
        car.put(new Car(3521, 001), new Auto(2019, "BMW", 45000, "Rose"));
        car.put(new Car(9821, 007), new Auto(2021, "Porsche", 570000, "White"));
        car.put(new Car(6593, 11), new Auto(2022, "Mercedes", 320000, "Brown"));

       // for (Map.Entry info: car.entrySet()) {
        //    System.out.println(info.getKey() + " " + info.getValue());
        //}                OR

        Iterator iterator = car.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry info2 = (Map.Entry) iterator.next();
            System.out.println(info2.getKey() + " " + info2.getValue());
        }
    }
}
