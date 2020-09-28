package com.example.bda.service;

import com.example.bda.pojo.SysUser;

import java.util.List;

public interface SysUserService {
    SysUser selectByName(String userName);

    void update(SysUser sysUser);

    List<SysUser> findUserBydepID(String depID);

    int add(SysUser sysUser);
}
