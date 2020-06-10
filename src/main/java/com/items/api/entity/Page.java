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

    @Column(name = "datetime_intid")
    private int datetime_intid;

    @Column(name = "hostname")
    private String hostname;

    @Column(name = "title")
    private String title;

    @Column(name = "url", length=1024)
    private String url;

    public String getPage_id() {
        return page_id;
    }

    public void setPage_id(String page_id) {
        this.page_id = page_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "page_id")
    private String page_id;

    @Column(name = "keywords",length=2048)
    private String keywords;

    @Column(name = "google_search_keywords")
    private String google_search_keywords;

    @Column(name = "country_short")
    private String country_short;

    @Column(name = "city")
    private String city;

    @Column(name = "town")
    private String town;

    @Column(name = "device_type")
    private String device_type;

    @Column(name = "ua_os_family")
    private String ua_os_family;

    @Column(name = "pv_valid")
    private int pv_valid;

    @Column(name = "create_time")
    private Date create_time;



    public int getDatetime_intid() {
        return datetime_intid;
    }

    public void setDatetime_intid(int datetime_intid) {
        this.datetime_intid = datetime_intid;
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

    public String getGoogle_search_keywords() {
        return google_search_keywords;
    }

    public void setGoogle_search_keywords(String google_search_keywords) {
        this.google_search_keywords = google_search_keywords;
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

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getDevice_type() {
        return device_type;
    }

    public void setDevice_type(String device_type) {
        this.device_type = device_type;
    }

    public String getUa_os_family() {
        return ua_os_family;
    }

    public void setUa_os_family(String ua_os_family) {
        this.ua_os_family = ua_os_family;
    }

    public int getPv_valid() {
        return pv_valid;
    }

    public void setPv_valid(int pv_valid) {
        this.pv_valid = pv_valid;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public static interface PageDao extends CrudRepository<Page, Long> {
        Page findByUrl (String url); // 根據網址查詢
    }
}
