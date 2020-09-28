package com.example.bda.service.impl;

import com.example.bda.mapper.BdaMapper;
import com.example.bda.pojo.SysPermission;
import com.example.bda.service.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysPermissionServiceImpl implements SysPermissionService {
    @Autowired
    private BdaMapper bdaMapper;

    @Override
    public List<SysPermission> selectListByUser(Integer userId) {
        return bdaMapper.selectListByUser(userId);
    }

    @Override
    public List<SysPermission> selectListByPath(String requestUrl) {
        return bdaMapper.selectListByPath(requestUrl);
    }
}
