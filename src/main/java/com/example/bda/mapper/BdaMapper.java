package com.example.bda.mapper;

import com.example.bda.pojo.Depart;
import com.example.bda.pojo.Menu;
import com.example.bda.pojo.SysPermission;
import com.example.bda.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BdaMapper extends Mapper {

    public List<Depart> findAll();

    public int deleteByDepID(String[] depIDs);

    int add(Depart dep);

    int update(Depart dep);

    List<Menu> getMenuList(String username);


    /**
     * 查询用户的权限列表
     *
     * @param userId
     * @return
     */
    List<SysPermission> selectListByUser(Integer userId);


    List<SysPermission> selectListByPath(String requestUrl);
}
