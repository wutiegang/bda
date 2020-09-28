package com.example.bda.service.impl;


import com.example.bda.mapper.SysRoleMapper;
import com.example.bda.pojo.SysRole;
import com.example.bda.pojo.SysUser;
import com.example.bda.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> findRoleData() {
        return sysRoleMapper.findRoleData();
    }

}
