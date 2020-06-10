package com.items.api.pojo;

import com.items.api.entity.Page;

public class ResponseCity {
    private String title;
    private String url;
    private String city;
    private int pv_valid;

    public ResponseCity(Page page) {
        this.title = page.getTitle();
        this.url = page.getUrl();
        this.city = page.getCity();
        this.pv_valid = page.getPv_valid();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPv_valid() {
        return pv_valid;
    }

    public void setPv_valid(int pv_valid) {
        this.pv_valid = pv_valid;
    }
}
