package com.pom.entity;

/**
 * @Author: LUJUHUI
 * @Description:
 * @Date: Created in 2020/3/13 14:54
 * @Modified by:
 */
public class AllHistoryDataCount {

    private String type_name;
    private String total_account_number;
    private String total_data_source;
    private String total_data;
    private String total_add_account_number;
    private String total_add_data_source;
    private String total_add_total_data;
    private String data_source;
    private String ds;

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getTotal_account_number() {
        return total_account_number;
    }

    public void setTotal_account_number(String total_account_number) {
        this.total_account_number = total_account_number;
    }

    public String getTotal_data_source() {
        return total_data_source;
    }

    public void setTotal_data_source(String total_data_source) {
        this.total_data_source = total_data_source;
    }

    public String getTotal_data() {
        return total_data;
    }

    public void setTotal_data(String total_data) {
        this.total_data = total_data;
    }

    public String getTotal_add_account_number() {
        return total_add_account_number;
    }

    public void setTotal_add_account_number(String total_add_account_number) {
        this.total_add_account_number = total_add_account_number;
    }

    public String getTotal_add_data_source() {
        return total_add_data_source;
    }

    public void setTotal_add_data_source(String total_add_data_source) {
        this.total_add_data_source = total_add_data_source;
    }

    public String getTotal_add_total_data() {
        return total_add_total_data;
    }

    public void setTotal_add_total_data(String total_add_total_data) {
        this.total_add_total_data = total_add_total_data;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public String getData_source() {
        return data_source;
    }

    public void setData_source(String data_source) {
        this.data_source = data_source;
    }

    @Override
    public String toString() {
        return "{" +
                "type_name='" + type_name + '\'' +
                "total_account_number='" + total_account_number + '\'' +
                ", total_data_source='" + total_data_source + '\'' +
                ", total_data='" + total_data + '\'' +
                ", total_add_account_number='" + total_add_account_number + '\'' +
                ", total_add_data_source='" + total_add_data_source + '\'' +
                ", total_add_total_data='" + total_add_total_data + '\'' +
                ", data_source='" + data_source + '\'' +
                ", ds='" + ds + '\'' +
                '}';
    }
}
