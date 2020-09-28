package com.example.bda.service;

import com.example.bda.pojo.SysPermission;

import java.util.List;

public interface SysPermissionService {
    List<SysPermission> selectListByUser(Integer userId);

    List<SysPermission> selectListByPath(String requestUrl);
}
