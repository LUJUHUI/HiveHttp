package com.pom.mapper;

import com.pom.entity.HistoryDataCount;
import com.pom.entity.User;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;


@Repository
public interface UserMapper {

    /*网民观点*/
    List<User> kemansNetizensViewsSql(String id);

    /*==========================================================================*/
    /*重要观点*/
    List<String> invQueryHsql2(String id);

    /*==========================================================================*/
    /*1 微博历史数据汇总-数据源-时间段双匹配*/
    List<HistoryDataCount> countWeiboDataSql(String id, String id2, BigInteger res_ts1, BigInteger res_ts2);

    /*微博历史数据汇总-数据源单匹配*/
    List<HistoryDataCount> countWeiboDataSql1(String id);

    /*微博历史数据汇总-时间段-可忽略*/
    List<HistoryDataCount> countWeiboDataSqlTimeBucket(String id, String id2);

    /*==========================================================================*/
    /*2 微信历史数据汇总-数据源-时间段双匹配*/
    List<HistoryDataCount> countWeChatDataSql(String id, String id2,BigInteger res_ts1,BigInteger res_ts2);

    /*微信历史数据汇总-数据源单匹配*/
    List<HistoryDataCount> countWeChatDataSql1(String id);

    /*微信历史数据汇总-时间段-可忽略*/
    List<HistoryDataCount> countWeChatDataSqlTimeBucket(String id, String id2);

    /*==========================================================================*/
    /*3 网媒历史数据汇总-数据源-时间段双匹配*/
    List<HistoryDataCount> countInternetMediaDataSqlTimeBucket(String id, String id2,BigInteger res_ts1,BigInteger res_ts2);

    /*网媒历史数据汇总-数据源单匹配*/
    List<HistoryDataCount> countInternetMediaDataSqlTimeBucket1(String id);

    /*==========================================================================*/
    /*4 总历史数据汇总-数据源-时间段双匹配*/
    List<HistoryDataCount> counthistoryDataSql(String id, String id2, BigInteger res_ts1, BigInteger res_ts2);

    /*总历史数据汇总-数据源单匹配*/
    List<HistoryDataCount> counthistoryDataSql1(String id);

    /*==========================================================================*/
    /*总历史数据汇总-时间段-可忽略*/
    List<HistoryDataCount> counthistoryDataSqlTimeBucket(String id, String id2);

    /*总历史数据汇总-全部-可忽略*/
    List<HistoryDataCount> countAllHistoryDataSql(String id, String id2);

}
