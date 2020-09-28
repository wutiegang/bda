package com.example.bda.pojo;

import java.io.Serializable;

public class Menu implements Serializable {

    private String menuId; //菜单id
    private String menuName; //菜单名称
    private String bz; //备注

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
