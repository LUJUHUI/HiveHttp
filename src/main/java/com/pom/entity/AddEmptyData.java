package com.pom.entity;

import com.pom.util.TimeLists;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: LUJUHUI
 * @Description:
 * @Date: Created in 2020/3/18 17:34
 * @Modified by:
 */
public class AddEmptyData {
    static List<String> timelist = TimeLists.getTimeLists();
    /*1 微博*/
    public static HashMap<Object, Object> getWeiBoAddEmptyData(int i) {
        HashMap<Object, Object> ads = new HashMap<>();
        ads.put("type_name","微博");
        ads.put("total_account_number","0");
        ads.put("total_data_source","0");
        ads.put("total_data","0");
        ads.put("total_add_account_number","0");
        ads.put("total_add_data_source","0");
        ads.put("total_add_total_data","0");
        ads.put("data_source","0");
        ads.put("ds",timelist.get(i));
        return ads;
    }

    /*2 微信*/
    public static HashMap<Object, Object> getWeChatAddEmptyData(int i) {
        HashMap<Object, Object> ads = new HashMap<>();
        ads.put("type_name","微信");
        ads.put("total_account_number","0");
        ads.put("total_data_source","0");
        ads.put("total_data","0");
        ads.put("total_add_account_number","0");
        ads.put("total_add_data_source","0");
        ads.put("total_add_total_data","0");
        ads.put("data_source","0");
        ads.put("ds",timelist.get(i));
        return ads;
    }

    /*3 网媒*/
    public static HashMap<Object, Object> getInternetMediaAddEmptyData(int i) {
        HashMap<Object, Object> ads = new HashMap<>();
        ads.put("type_name","网媒");
        ads.put("total_account_number","0");
        ads.put("total_data_source","0");
        ads.put("total_data","0");
        ads.put("total_add_account_number","0");
        ads.put("total_add_data_source","0");
        ads.put("total_add_total_data","0");
        ads.put("data_source","0");
        ads.put("ds",timelist.get(i));
        return ads;
    }
}
