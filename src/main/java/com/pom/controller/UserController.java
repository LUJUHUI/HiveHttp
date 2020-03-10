package com.pom.controller;

import com.pom.entity.HistoryDataCount;
import com.pom.entity.User;
import com.pom.service.UserService;
import com.pom.util.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pom")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {

    @Autowired
    private UserService userService;

    /*网民观点*/
    @RequestMapping(value = "/kemansNetizensViewsSql/{id}")
    public String kemansNetizensViewsSql(@PathVariable String id) {
        SuccessResult result = new SuccessResult();
        List<User> users = userService.kemansNetizensViewsSql(id);
        if (null != users && users.size() > 0) {
            System.out.println("----------------------------------------------------");
            result.addData("kemansNetizens", users);
        } else {
            result.addData("kemansNetizens", new ArrayList<>());
        }
        return result.toString();
    }

    /*重要观点*/
    @RequestMapping(value = "/invQueryHsql2/{id}")
    public String invQueryHsql2(@PathVariable String id) {
        SuccessResult result = new SuccessResult();
        List<String> overvierID = userService.invQueryHsql2(id);
        if (null != overvierID && overvierID.size() > 0) {
            System.out.println("----------------------------------------------------");
            result.addData("impViews", overvierID);
        } else {
            result.addData("impViews", new ArrayList<>());
        }
        return result.toString();
    }

    /*微博历史数据汇总*/
    @RequestMapping(value = "/countWeiboDataSql/{id}")
    public String countWeiboDataSql(@PathVariable String id,@PathVariable String id2) {
        SuccessResult result = new SuccessResult();
        List<HistoryDataCount> users = userService.countWeiboDataSql(id,id2);
        if (null != users && users.size() > 0) {
            System.out.println("----------------------------------------------------");
            result.addData("countWeiboData", users);
        } else {
            result.addData("countWeiboData", new ArrayList<>());
        }
        return result.toString();
    }

    /*微博历史数据汇总-时间段*/
    @RequestMapping(value = "/countWeiboDataSqlTimeBucket/{id}")
    public String countWeiboDataSqlTimeBucket(@PathVariable String id,@PathVariable String id2) {
        SuccessResult result = new SuccessResult();
        List<HistoryDataCount> users = userService.countWeiboDataSqlTimeBucket(id,id2);
        if (null != users && users.size() > 0) {
            System.out.println("----------------------------------------------------");
            result.addData("countWeiboDataSqlTimeBucket", users);
        } else {
            result.addData("countWeiboDataSqlTimeBucket", new ArrayList<>());
        }
        return result.toString();
    }


    /*微信历史数据汇总*/
    @RequestMapping(value = "/countWeChatData/{id}")
    public String countWeChatDataSql(@PathVariable String id,@PathVariable String id2) {
        SuccessResult result = new SuccessResult();
        List<HistoryDataCount> users = userService.countWeChatDataSql(id,id2);
        if (null != users && users.size() > 0) {
            System.out.println("----------------------------------------------------");
            result.addData("countWeChatData", users);
        } else {
            result.addData("countWeChatData", new ArrayList<>());
        }
        return result.toString();
    }

    /*微信历史数据汇总-时间段*/
    @RequestMapping(value = "/countWeChatDataTimeBucket/{id}")
    public String countWeChatDataTimeBucket(@PathVariable String id,@PathVariable String id2) {
        SuccessResult result = new SuccessResult();
        List<HistoryDataCount> users = userService.countWeChatDataSqlTimeBucket(id,id2);
        if (null != users && users.size() > 0) {
            System.out.println("----------------------------------------------------");
            result.addData("countWeChatDataTimeBucket", users);
        } else {
            result.addData("countWeChatDataTimeBucket", new ArrayList<>());
        }
        return result.toString();
    }


    /*总历史数据汇总*/
    @RequestMapping(value = "/counthistoryData/{id}")
    public String counthistoryData(@PathVariable String id,@PathVariable String id2) {
        SuccessResult result = new SuccessResult();
        List<HistoryDataCount> users = userService.counthistoryDataSql(id,id2);
        if (null != users && users.size() > 0) {
            System.out.println("----------------------------------------------------");
            result.addData("counthistoryData", users);
        } else {
            result.addData("counthistoryData", new ArrayList<>());
        }
        return result.toString();
    }

    /*总历史数据汇总-时间段*/
    @RequestMapping(value = "/counthistoryDataTimeBucket/{id}")
    public String counthistoryDataTimeBucket(@PathVariable String id,@PathVariable String id2) {
        SuccessResult result = new SuccessResult();
        List<HistoryDataCount> users = userService.counthistoryDataSqlTimeBucket(id,id2);
        if (null != users && users.size() > 0) {
            System.out.println("----------------------------------------------------");
            result.addData("counthistoryDataTimeBucket", users);
        } else {
            result.addData("counthistoryDataTimeBucket", new ArrayList<>());
        }
        return result.toString();
    }

    /*总历史数据汇总-全部*/
    @RequestMapping(value = "/countAllhistoryData/{id}/{id2}")
    public String countAllhistoryData(@PathVariable String id, @PathVariable String id2) {
        if (id.equals("weibo") && null != id2) {
            SuccessResult result = new SuccessResult();
            List<HistoryDataCount> users = userService.countWeiboDataSql(id,id2);
            if (null != users && users.size() > 0) {
                System.out.println("----------------------------------------------------");
                result.addData("data", users);
            } else {
                result.addData("data", new ArrayList<>());
            }
            return result.toString();
        } else if (id.equals("wechat") && null != id2) {
            SuccessResult result = new SuccessResult();
            List<HistoryDataCount> users = userService.countWeChatDataSql(id,id2);
            if (null != users && users.size() > 0) {
                System.out.println("----------------------------------------------------");
                result.addData("data", users);
            } else {
                result.addData("data", new ArrayList<>());
            }
            return result.toString();
        } else if (id.equals("internet_media") && null != id2) {
            SuccessResult result = new SuccessResult();
            List<HistoryDataCount> users = userService.countInternetMediaDataSqlTimeBucket(id,id2);
            if (null != users && users.size() > 0) {
                System.out.println("----------------------------------------------------");
                result.addData("data", users);
            } else {
                result.addData("data", new ArrayList<>());
            }
            return result.toString();
        } else if (id.equals("history_count_data") && null != id2) {
            SuccessResult result = new SuccessResult();
            List<HistoryDataCount> users = userService.counthistoryDataSql(id,id2);
            if (null != users && users.size() > 0) {
                System.out.println("----------------------------------------------------");
                result.addData("data", users);
            } else {
                result.addData("data", new ArrayList<>());
            }
            return result.toString();
        }
        return "Sorry,if you see this information,the reason maybe you input the wrong source type,please check it and try it again ! Thanks";
    }
}
