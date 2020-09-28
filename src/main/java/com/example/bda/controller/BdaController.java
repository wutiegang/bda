package com.example.bda.controller;



import com.example.bda.pojo.Depart;
import com.example.bda.service.BdaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.util.*;

@CrossOrigin
@RestController
public class BdaController {
    @Autowired
    private BdaService bdaService;
    @Autowired
    private UserDetailsService userDetailsService;


    @RequestMapping(value = "/loadTabContentByKey",method = RequestMethod.GET)
    public List<Depart> getTabContentByKey(@RequestParam String key, HttpServletResponse resp, HttpServletRequest request){

        List<Depart> list=new ArrayList<Depart>();
        if(!Objects.isNull(key)){
            //maps.put("menukey",key);
            //根据menukey值查找内容
            //1.查找单位管理的数据
            if( ("1".equals(key)) || ("2".equals(key)) ){
                list = bdaService.findAll();
            }else if(("3".equals(key))){
                list = null;
            }else{
                list = null;
            }
        }

        return list;
    }
    private Depart mapToDepart(Map<Object, String> map){
        Depart dep=new Depart();
        if(!StringUtils.isEmpty(map.get("values[depID]"))){
            dep.setDepID(map.get("values[depID]"));
        };
        dep.setDepName(map.get("values[depName]"));
        dep.setState(Integer.parseInt(map.get("values[state]")));
        dep.setDepLevel(Integer.parseInt(map.get("values[depLevel]")));
        dep.setSuperDepID(map.get("values[superDepID]"));
        dep.setLxr(map.get("values[lxr]"));
        dep.setPhone(map.get("values[phone]"));
        dep.setAddress(map.get("values[address]"));
        return dep;
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public int add(@RequestParam Map<Object, String> map, HttpServletRequest request,HttpServletResponse resp){
        Depart dep = mapToDepart(map);
        int i = bdaService.add(dep);
        return i;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public int update(@RequestParam Map<Object, String> map,HttpServletRequest request,HttpServletResponse resp){
        Depart dep = mapToDepart(map);
        int i = bdaService.update(dep);
        return i;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public int delete(@RequestParam String[] keys, HttpServletRequest request, HttpServletResponse res){
        int i = bdaService.deleteByDepID(keys);
        return i;
    }
}
