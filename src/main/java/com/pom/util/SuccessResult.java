package com.pom.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.HashMap;
import java.util.Map;

public class SuccessResult extends HashMap<String, Object> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public SuccessResult() {
    }

    public void addData(String key, Object data) {
        this.put(key, data);
    }

    public SuccessResult(Map<String, ? extends Object> data) {
        super();
        this.putAll(data);
    }

    public void setData(Object obj) {
        this.clear();
        if (obj instanceof Map) {
            this.putAll((Map) obj);
        } else {
            this.putAll(JSON.parseObject(JSON.toJSONString(obj, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullListAsEmpty)));
        }
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.WriteNullStringAsEmpty);

    }

    public String toString2() {
        return JSON.toJSONString(JSON.toJSONString(this, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.WriteNullStringAsEmpty));

    }

}