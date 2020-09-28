package com.example.bda.mapper;

import com.example.bda.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper extends Mapper{
    List<SysUser> findUserBydepID(String depID);

    void updateUser(SysUser sysUser);

    /**
     * 根据用户名查询用户
     *
     * @param userName
     * @return
     */
    SysUser selectByName(String userName);

    int add(SysUser sysUser);
}
