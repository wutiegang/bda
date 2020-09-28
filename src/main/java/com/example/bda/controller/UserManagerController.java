package com.example.bda.controller;

import com.example.bda.pojo.Depart;
import com.example.bda.pojo.SysRole;
import com.example.bda.pojo.SysUser;
import com.example.bda.service.SysRoleService;
import com.example.bda.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserManagerController {
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping(value = "/loadUserData",method = RequestMethod.GET)
    public List<SysUser> loadUserData(@RequestParam String depID, HttpServletResponse resp, HttpServletRequest request){

        List<SysUser> list = sysUserService.findUserBydepID(depID);//如果有部门id就根据部门id查询，否则查询全部
        return list;
    }

    @RequestMapping(value = "/loadRoleData",method = RequestMethod.GET)
    public List<SysRole> loadRoleData(HttpServletResponse resp, HttpServletRequest request){
        List<SysRole> list = sysRoleService.findRoleData();
        return list;
    }

    private SysUser mapToUser(Map<Object, String> map){
        SysUser sysUser=new SysUser();
        if(!StringUtils.isEmpty(map.get("values[id]"))){
            sysUser.setId(Integer.parseInt(map.get("values[id]")));
        };
        sysUser.setAccount(map.get("values[account]"));
        sysUser.setPassword(map.get("values[passwords]"));
        sysUser.setUserName(map.get("values[userName]"));
        sysUser.setSex(map.get("values[sex]"));
        sysUser.setDeptID(map.get("values[deptID]"));
        sysUser.setEnabledInt(Integer.parseInt(map.get("values[enabled]")));
        sysUser.setLockedInt(Integer.parseInt(map.get("values[locked]")));
        sysUser.setRoleName(map.get("values[roleType]"));
        sysUser.setZw(map.get("values[zw]"));
        sysUser.setDh(map.get("values[phone]"));

        return sysUser;
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public int add(@RequestParam Map<Object, String> map, HttpServletRequest request, HttpServletResponse resp){
        SysUser sysUser = mapToUser(map);
        SysUser user = sysUserService.selectByName(map.get("values[createUser]"));
        sysUser.setCreateUser(user.getId());
        int i = sysUserService.add(sysUser);
        return 1;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public int update(@RequestParam Map<Object, String> map,HttpServletRequest request,HttpServletResponse resp){
       /* Depart dep = mapToDepart(map);
        int i = bdaService.update(dep);*/
        return 2;
    }
}
