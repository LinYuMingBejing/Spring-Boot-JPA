package com.items.api.pojo;

import com.items.api.entity.Page;

import javax.persistence.Entity;
import java.io.Serializable;


public class ResponseHighPv implements Serializable {
    private String city;
    private long pv_valid;

    public ResponseHighPv(String city, long pv_valid) {
        this.city = city;
        this.pv_valid = pv_valid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPv_valid() {
        return pv_valid;
    }

    public void setPv_valid(long pv_valid) {
        this.pv_valid = pv_valid;
    }
}
