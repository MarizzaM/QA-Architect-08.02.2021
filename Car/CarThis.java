package com.example;

import lombok.Getter;
import lombok.Setter;

public class CarThis {
    private @Getter @Setter String model;
    private @Getter @Setter String brand;
    private @Getter @Setter int year;
    private @Getter @Setter String color;

    public CarThis(String model, String brand, int year, String color) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.Go();
    }

    private void Go(){
        System.out.println("beep.. beep!");
    }
}
