package com.items.api.pojo;

import com.items.api.entity.Page;

public class ResponsePage {
    private String hostname;
    private String title;
    private String url;
    private int pv_valid;
    private String ua_os_family;

    public ResponsePage(Page page) {
        this.hostname = page.getHostname();
        this.title = page.getTitle();
        this.url = page.getUrl();
        this.pv_valid = page.getPv_valid();
        this.ua_os_family = page.getUa_os_family();
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

    public String getUa_os_family() {
        return ua_os_family;
    }

    public void setUa_os_family(String ua_os_family) {
        this.ua_os_family = ua_os_family;
    }
}
