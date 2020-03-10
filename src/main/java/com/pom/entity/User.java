package com.pom.entity;


public class User {

    private String poNetizensViews;
    private String poCluster;
    private String poRepostNum;

    public String getPoNetizensViews() {
        return poNetizensViews;
    }

    public void setPoNetizensViews(String poNetizensViews) {
        this.poNetizensViews = poNetizensViews;
    }

    public String getPoCluster() {
        return poCluster;
    }

    public void setPoCluster(String poCluster) {
        this.poCluster = poCluster;
    }

    public String getPoRepostNum() {
        return poRepostNum;
    }

    public void setPoRepostNum(String poRepostNum) {
        this.poRepostNum = poRepostNum;
    }

    @Override
    public String toString() {
        return "{" +
                "poNetizensViews='" + poNetizensViews + '\'' +
                ", poCluster='" + poCluster + '\'' +
                ", poRepostNum='" + poRepostNum + '\'' +
                '}';
    }

}
