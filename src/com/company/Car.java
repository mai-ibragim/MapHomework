package com.company;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Car {
    private int number;
    private int ID;

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", ID=" + ID +
                '}';
    }
}
