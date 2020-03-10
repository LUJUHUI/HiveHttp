package com.pom.entity;

/**
 * @author LUJUHUI
 * @date 2020/2/27 20:31
 */
public class WeChatCountData {
    private String total_wechat_user_id;
    private String total_wechat_data_source;
    private String total_data;
    private String add_overview_user_id;
    private String add_data_source;
    private String add_total_data;
    private String ds;

    public String getTotal_wechat_user_id() {
        return total_wechat_user_id;
    }

    public void setTotal_wechat_user_id(String total_wechat_user_id) {
        this.total_wechat_user_id = total_wechat_user_id;
    }

    public String getTotal_wechat_data_source() {
        return total_wechat_data_source;
    }

    public void setTotal_wechat_data_source(String total_wechat_data_source) {
        this.total_wechat_data_source = total_wechat_data_source;
    }

    public String getTotal_data() {
        return total_data;
    }

    public void setTotal_data(String total_data) {
        this.total_data = total_data;
    }

    public String getAdd_overview_user_id() {
        return add_overview_user_id;
    }

    public void setAdd_overview_user_id(String add_overview_user_id) {
        this.add_overview_user_id = add_overview_user_id;
    }

    public String getAdd_data_source() {
        return add_data_source;
    }

    public void setAdd_data_source(String add_data_source) {
        this.add_data_source = add_data_source;
    }

    public String getAdd_total_data() {
        return add_total_data;
    }

    public void setAdd_total_data(String add_total_data) {
        this.add_total_data = add_total_data;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    @Override
    public String toString() {
        return "{" +
                "total_wechat_user_id='" + total_wechat_user_id + '\'' +
                ", total_wechat_data_source='" + total_wechat_data_source + '\'' +
                ", total_data='" + total_data + '\'' +
                ", add_overview_user_id='" + add_overview_user_id + '\'' +
                ", add_data_source='" + add_data_source + '\'' +
                ", add_total_data='" + add_total_data + '\'' +
                ", ds='" + ds + '\'' +
                '}';
    }
}
