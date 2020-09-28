package com.example.bda.util;

import com.example.bda.pojo.SysPermission;

import java.util.List;

public class SessionManager {

    private static List<SysPermission> sysPermissions;

    public static List<SysPermission> getSysPermissions() {
        return sysPermissions;
    }

    public static void setSysPermissions(List<SysPermission> sysPermissions) {
        SessionManager.sysPermissions = sysPermissions;
    }
}
