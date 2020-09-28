package com.example.bda.mapper;

import com.example.bda.pojo.SysRole;
import com.example.bda.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleMapper extends Mapper{

    List<SysRole> findRoleData();

}
