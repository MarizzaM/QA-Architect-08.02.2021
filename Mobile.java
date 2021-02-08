package com.example;

import lombok.Getter;
import lombok.Setter;

public class MobilePhone {
    private @Getter @Setter String m_brand;
    private @Getter @Setter String m_model;
    private @Getter @Setter float m_price;
    private @Getter @Setter float m_size;
    private @Getter @Setter String m_color;

    public MobilePhone(String m_brand, String m_model, float m_price, float m_size) {
        this.m_brand = m_brand;
        this.m_model = m_model;
        this.m_price = m_price;
        this.m_size = m_size;
    }

    public MobilePhone(String m_brand, String m_model, float m_price) {
        this(m_brand, m_model, m_price, 5.4f);
    }

    public MobilePhone(String m_brand, float m_price) {
        this(m_brand, "standard", m_price, 5.4f);
    }

    public MobilePhone(float m_price) {
        this("samsung", "standard", m_price, 5.4f);
    }

    public MobilePhone(String m_brand, String m_model, float m_price, float m_size, String m_color) {
        this("samsung", "standard", m_price, 5.4f);
        this.m_color = m_color;
    }

}
