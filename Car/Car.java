package com.example;

import lombok.Getter;
import lombok.Setter;

public class Car {
    private @Getter @Setter String m_model;
    private @Getter @Setter String m_brand;
    private @Getter @Setter int m_year;
    private @Getter @Setter String m_color;

    public Car(String model, String brand, int year, String color) {
        m_model = model;
        m_brand = brand;
        m_year = year;
        m_color = color;
        this.Go();
    }

    private void Go(){
        System.out.println("beep.. beep!");
    }

}
