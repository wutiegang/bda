package com.example.bda.service.impl;

import com.example.bda.mapper.BdaMapper;
import com.example.bda.mapper.SysUserMapper;
import com.example.bda.pojo.SysUser;
import com.example.bda.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectByName(String userName) {
        return sysUserMapper.selectByName(userName);
    }

    @Override
    public void update(SysUser sysUser) {
        sysUserMapper.updateUser(sysUser);
    }

    @Override
    public List<SysUser> findUserBydepID(String depID) {
        return sysUserMapper.findUserBydepID(depID);
    }

    @Override
    public int add(SysUser sysUser) {
        return sysUserMapper.add(sysUser);
    }
}
