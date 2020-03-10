package com.pom.service;

import com.pom.entity.HistoryDataCount;
import com.pom.entity.User;
import com.pom.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    /*网民观点*/
    public List<User> kemansNetizensViewsSql(String id) {
        return userMapper.kemansNetizensViewsSql(id);
    }

    /*重要观点*/
    public List<String> invQueryHsql2(String id) {
        return userMapper.invQueryHsql2(id);
    }

    /*微博历史数据汇总*/
    public List<HistoryDataCount> countWeiboDataSql(String id,String id2) {
        return userMapper.countWeiboDataSql(id,id2);
    }

    /*微博历史数据汇总-时间段*/
    public List<HistoryDataCount> countWeiboDataSqlTimeBucket(String id,String id2) {
        return userMapper.countWeiboDataSqlTimeBucket(id,id2);
    }

    /*微信历史数据汇总*/
    public List<HistoryDataCount> countWeChatDataSql(String id,String id2) {
        return userMapper.countWeChatDataSql(id,id2);
    }

    /*微信历史数据汇总-时间段*/
    public List<HistoryDataCount> countWeChatDataSqlTimeBucket(String id,String id2) {
        return userMapper.countWeChatDataSqlTimeBucket(id,id2);
    }

    /*网媒历史数据汇总*/
    public List<HistoryDataCount> countInternetMediaDataSqlTimeBucket(String id,String id2) {
        return userMapper.countInternetMediaDataSqlTimeBucket(id,id2);
    }

    /*总历史数据汇总*/
    public List<HistoryDataCount> counthistoryDataSql(String id,String id2) {
        return userMapper.counthistoryDataSql(id,id2);
    }

    /*总历史数据汇总-时间段*/
    public List<HistoryDataCount> counthistoryDataSqlTimeBucket(String id,String id2) {
        return userMapper.counthistoryDataSqlTimeBucket(id,id2);
    }

    /*总历史数据汇总-全部*/
    public List<HistoryDataCount> countAllHistoryDataSql(String id,String id2) {
        return userMapper.countAllHistoryDataSql(id,id2);
    }




}
