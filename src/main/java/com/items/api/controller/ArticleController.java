package com.items.api.controller;


import com.items.api.entity.Page;
import com.items.api.entity.PageRepository;
import com.items.api.pojo.ResponseCity;
import com.items.api.pojo.ResponseHighDevice;
import com.items.api.pojo.ResponseHighPv;
import com.items.api.pojo.ResponsePage;
import com.items.api.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class ArticleController {

    @Autowired
    private PageService pageService;


    @ResponseBody
    @GetMapping("/url")
    public Page getPageByUrl(@RequestParam String url){
            return pageService.getPageByUrl(url);
    }

    @ResponseBody
    @GetMapping("/hostname")
    public List<Page> getPageByHostname(@RequestParam String hostname){
        return pageService.getPageByHostname(hostname);
    }

    @ResponseBody
    @GetMapping("/hotArticle")
    public List<ResponsePage>  getHotArticleByPV(){
        return pageService.getHotArticleByPV();
    }

    @ResponseBody
    @GetMapping("/high_pv")
    public List<ResponsePage> getHighPvPage(){
        return pageService.getHighPvPage();
    }

    @ResponseBody
    @GetMapping("/city")
    public List<ResponseCity>  getPageByCity(@RequestParam String city){
        return pageService.getPageByCity(city);
    }

    @ResponseBody
    @GetMapping("/high/city")
    public List<ResponseHighPv> getHighCityPV(){
        return pageService.getHighCityPV();
    }

    @ResponseBody
    @GetMapping("/high/device")
    public List<ResponseHighDevice>  getHighDevice(){
        return  pageService.getHighDevice();
    }
}
