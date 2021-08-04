package com.hp.bean;


public class FormBean {

    private int id;
    private String bid;
    private String xtname;

    @Override
    public String toString() {
        return "FormBean{" +
                "id=" + id +
                ", bid='" + bid + '\'' +
                ", xtname='" + xtname + '\'' +
                ", number=" + number +
                ", jibie='" + jibie + '\'' +
                ", bugurl='" + bugurl + '\'' +
                ", bugtype='" + bugtype + '\'' +
                ", bu='" + bu + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getXtname() {
        return xtname;
    }

    public void setXtname(String xtname) {
        this.xtname = xtname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getJibie() {
        return jibie;
    }

    public void setJibie(String jibie) {
        this.jibie = jibie;
    }

    public String getBugurl() {
        return bugurl;
    }

    public void setBugurl(String bugurl) {
        this.bugurl = bugurl;
    }

    public String getBugtype() {
        return bugtype;
    }

    public void setBugtype(String bugtype) {
        this.bugtype = bugtype;
    }

    public String getBu() {
        return bu;
    }


    public void setBu(String bu) {
        this.bu = bu;
    }

    private int number;
    private String jibie;
    private String bugurl;
    private String bugtype;
    private String bu;
}
