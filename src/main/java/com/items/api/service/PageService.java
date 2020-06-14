package com.items.api.service;

import com.items.api.entity.Page;
import com.items.api.entity.PageRepository;
import com.items.api.pojo.ResponseCity;
import com.items.api.pojo.ResponseHighDevice;
import com.items.api.pojo.ResponseHighPv;
import com.items.api.pojo.ResponsePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class PageService {

    @Autowired
    private PageRepository pageRepository;


    public List<ResponsePage> toResponsePage(List<Page> pages){
        List<ResponsePage> responsePages = new ArrayList<>();
        pages.stream().forEach(page ->{
            responsePages.add(new ResponsePage(page));
        });
        return responsePages;
    }

    public List<ResponseCity> toResponseCity(List<Page> pages){
        List<ResponseCity> responseCities = new ArrayList<>();
        pages.stream().forEach(page -> {
            responseCities.add(new ResponseCity(page));
        });
        return responseCities;
    }


    public Page getPageByUrl(String url){
        return pageRepository.findByUrl(url);
    }


    public List<Page> getPageByHostname(String hostname){
        return pageRepository.findByHostname(hostname);
    }


    public List<ResponsePage>  getHotArticleByPV(){
        List<Page> pages = pageRepository.findByPV(PageRequest.of(0, 100));
        List<ResponsePage> responsePages = toResponsePage(pages);
        Collections.shuffle(responsePages);
        return responsePages;
    }


    public List<ResponsePage> getHighPvPage(){
        List<Page> pages= pageRepository.findByHighPv(PageRequest.of(0,100));
        List<ResponsePage> responsePages = toResponsePage(pages);
        Collections.shuffle(responsePages);
        return responsePages;
    }


    public List<ResponseCity>  getPageByCity(String city){
        List<Page> pages = pageRepository.findByCity(city, PageRequest.of(0,100));
        List<ResponseCity> responseCities = toResponseCity(pages);
        Collections.shuffle(responseCities);
        return responseCities;
    }


    public List<ResponseHighPv>  getHighCityPV(){
        return pageRepository.findByHighCity();
    }


    public List<ResponseHighDevice>  getHighDevice(){
        return pageRepository.findByHighDevice();
    }
}
