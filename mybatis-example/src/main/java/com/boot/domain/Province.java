package com.boot.domain;

/**
 * @Auther d
 * @Date 2022/4/2 13:13
 * @Describe
 **/

public class Province {
    //省Id
    private Integer id;
    //省code
    private String provinceId;
    //省名称
    private String province;
    //省缩写
    private String wm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getWm() {
        return wm;
    }

    public void setWm(String wm) {
        this.wm = wm;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", provinceId='" + provinceId + '\'' +
                ", province='" + province + '\'' +
                ", wm='" + wm + '\'' +
                '}';
    }
}
