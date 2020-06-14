package com.items.api.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BloggerPage")
public class Page {

    @Id
    @Column(name="id")
    @GeneratedValue(generator="idGenerator")
    @GenericGenerator(name="idGenerator", strategy = "native")
    private Long id;

    @Column(name = "hostname")
    private String hostname;

    @Column(name = "title")
    private String title;

    @Column(name = "url", length=1024)
    private String url;

    @Column(name = "keywords",length=2048)
    private String keywords;

    @Column(name = "country_short")
    private String country_short;

    @Column(name = "city")
    private String city;

    @Column(name = "device_type")
    private String device_type;

    @Column(name = "pv_valid")
    private int pv_valid;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }


    public String getCountry_short() {
        return country_short;
    }

    public void setCountry_short(String country_short) {
        this.country_short = country_short;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getDevice_type() {
        return device_type;
    }

    public void setDevice_type(String device_type) {
        this.device_type = device_type;
    }


    public int getPv_valid() {
        return pv_valid;
    }

    public void setPv_valid(int pv_valid) {
        this.pv_valid = pv_valid;
    }

}
