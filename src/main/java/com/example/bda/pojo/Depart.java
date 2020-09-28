package com.example.bda.pojo;

import java.io.Serializable;

public class Depart implements Serializable {

    private String depID;
    private String depName;
    private Integer state;
    private Integer depLevel;
    private String superDepID;
    private String superDepName;
    private String lxr;
    private String phone;
    private String address;


    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDepLevel() {
        return depLevel;
    }

    public void setDepLevel(Integer depLevel) {
        this.depLevel = depLevel;
    }

    public String getSuperDepName() {
        return superDepName;
    }

    public void setSuperDepName(String superDepName) {
        this.superDepName = superDepName;
    }

    public String getSuperDepID() {
        return superDepID;
    }

    public void setSuperDepID(String superDepID) {
        this.superDepID = superDepID;
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
