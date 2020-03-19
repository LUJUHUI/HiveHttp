package com.pom.util;

/**
 * @Author: LUJUHUI
 * @Description:
 * @Date: Created in 2020/3/16 16:19
 * @Modified by:
 */
public class JsonResult<T> {

    private T data;

    /**
     * @param data
     */
    public JsonResult(T data) {
        this.data = data;
    }

    // get 和 set 方法
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

