package com.items.api.pojo;

import com.items.api.entity.Page;

public class ResponsePage {
    private String hostname;
    private String title;
    private String url;
    private int pv_valid;

    public ResponsePage(Page page) {
        this.hostname = page.getHostname();
        this.title = page.getTitle();
        this.url = page.getUrl();
        this.pv_valid = page.getPv_valid();
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
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

    public int getPv_valid() {
        return pv_valid;
    }

    public void setPv_valid(int pv_valid) {
        this.pv_valid = pv_valid;
    }

}
