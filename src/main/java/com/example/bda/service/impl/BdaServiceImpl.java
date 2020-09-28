package com.example.bda.service.impl;

import com.example.bda.mapper.BdaMapper;
import com.example.bda.pojo.Depart;
import com.example.bda.pojo.Menu;
import com.example.bda.service.BdaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BdaServiceImpl implements BdaService {
    @Autowired
    private BdaMapper bdaMapper;

    @Override
    public List<Depart> findAll() {
        return bdaMapper.findAll();
    }

    @Override
    public int deleteByDepID(String[] depIDs) {
        return bdaMapper.deleteByDepID(depIDs);
    }

    @Override
    public int add(Depart dep) {
        return bdaMapper.add(dep);
    }

    @Override
    public int update(Depart dep) {
        return bdaMapper.update(dep);
    }

    @Override
    public List<Menu> getMenuList(String username) {

        return bdaMapper.getMenuList(username);

    }


}
