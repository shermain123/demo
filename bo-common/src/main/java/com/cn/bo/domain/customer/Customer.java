package com.cn.bo.domain.customer;

/**
 * Created by sher on 2019/3/1.
 */
public class Customer {

    private String cusid;

    private String cusname;

    private String phone;

    private String address;

    private String brithday;

    private String email;

    private String destric;

    private String updateTime;

    private String lastTime;

    public void setCusid(String cusid) { this.cusid = cusid; }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDestric(String destric) {
        this.destric = destric;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public String getCusid() { return cusid;}

    public String getCusname() {
        return cusname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getBrithday() {
        return brithday;
    }

    public String getEmail() {
        return email;
    }

    public String getDestric() {
        return destric;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public String getLastTime() {
        return lastTime;
    }

}
