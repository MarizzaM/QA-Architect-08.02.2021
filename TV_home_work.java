package com.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class TV {
    private @Getter final float m_tv_size;
    private @Getter final String m_model;
    private @Getter int m_current_channel;
    private @Getter @Setter boolean m_tv_on;
    private @Getter float m_price;

    public void setM_current_channel(int new_channel){
        if (new_channel > 10){
            m_current_channel = new_channel;
        }
    }
//    ctor1
    public TV(float m_tv_size, String m_model, int m_current_channel, boolean m_tv_on) {
        this.m_tv_size = m_tv_size;
        this.m_model = m_model;
        this.m_current_channel = m_current_channel;
        this.m_tv_on = m_tv_on;
    }

//    ctor2
    public TV(float m_tv_size, String m_model, int m_current_channel) {
        this(m_tv_size, m_model, m_current_channel, false);
    }

//    ctor3
    public TV(float m_tv_size, String m_model) {
        this(m_tv_size, m_model, 1, false);
    }

//    ctor4
    public TV(float m_tv_size) {
        this(m_tv_size, "LG", 1, false);
    }

//    ctor5
    public TV() {
        this(65, "LG", 1, false);
    }

//    ctor6

    public TV(float m_tv_size, String m_model, int m_current_channel, boolean m_tv_on, float m_price) {
        this(m_tv_size, m_model, m_current_channel, m_tv_on);
        this.m_price = m_price;
    }
}
