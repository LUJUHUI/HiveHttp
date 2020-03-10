package com.pom.mapper;

import com.pom.entity.HistoryDataCount;
import com.pom.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {

    /*网民观点*/
    List<User> kemansNetizensViewsSql(String id);

    /*重要观点*/
    List<String> invQueryHsql2(String id);

    /*微博历史数据汇总*/
    List<HistoryDataCount> countWeiboDataSql(String id,String id2);

    /*微博历史数据汇总-时间段*/
    List<HistoryDataCount> countWeiboDataSqlTimeBucket(String id,String id2);

    /*微信历史数据汇总*/
    List<HistoryDataCount> countWeChatDataSql(String id,String id2);

    /*微信历史数据汇总-时间段*/
    List<HistoryDataCount> countWeChatDataSqlTimeBucket(String id,String id2);

    /*网媒历史数据汇总*/
    List<HistoryDataCount> countInternetMediaDataSqlTimeBucket(String id,String id2);

    /*总历史数据汇总*/
    List<HistoryDataCount> counthistoryDataSql(String id,String id2);

    /*总历史数据汇总-时间段*/
    List<HistoryDataCount> counthistoryDataSqlTimeBucket(String id,String id2);

    /*总历史数据汇总-全部*/
    List<HistoryDataCount> countAllHistoryDataSql(String id,String id2);


}
