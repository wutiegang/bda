package com.example.bda.service;

import com.example.bda.pojo.Depart;
import com.example.bda.pojo.Menu;

import java.util.List;


public interface BdaService {

    public List<Depart> findAll();

    public int deleteByDepID(String[] depIDs);

    int add(Depart dep);

    int update(Depart dep);

    List<Menu> getMenuList(String username);
}
