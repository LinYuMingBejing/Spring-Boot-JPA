package com.items.api.entity;


import com.items.api.pojo.ResponseHighDevice;
import com.items.api.pojo.ResponseHighPv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.domain.Pageable;
import java.util.List;


public interface PageRepository extends JpaRepository<Page, Integer> {
    Page findByUrl (String url); // 根據網址查詢

    List<Page> findByHostname (String hostname); // 找出相似hostname的文章

    @Query(value = "SELECT * FROM article_pv order by pv_valid desc", nativeQuery = true)
    List<Page> findByPV(Pageable pageable); // 抓出PV前100名文章

    @Query(value = "SELECT * FROM article_pv where pv_valid >5", nativeQuery = true)
    List<Page> findByHighPv(Pageable pageable); // 抓出PV前100名文章

    @Query(value = "SELECT * FROM article_pv where city = ?", nativeQuery = true)
    List<Page> findByCity(String city,Pageable pageable); // 抓出PV前100名文章

    @Query(value = "SELECT new com.items.api.pojo.ResponseHighPv(city, sum(pv_valid)) FROM Page group by city")
    List<ResponseHighPv> findByHighCity(); // 抓出PV前100名文章

    @Query(value = "SELECT new com.items.api.pojo.ResponseHighDevice(device_type,sum(pv_valid)) FROM Page group by device_type")
    List<ResponseHighDevice> findByHighDevice(); // 抓出PV前100名文章

}
