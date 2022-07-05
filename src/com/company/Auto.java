package com.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Auto {
    private int year;
    private String model;
    private int price;
    private String color;

    @Override
    public String toString() {
        return "Auto{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
