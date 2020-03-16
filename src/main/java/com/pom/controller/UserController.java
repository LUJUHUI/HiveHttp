package com.pom.controller;

import com.pom.entity.HistoryDataCount;
import com.pom.entity.User;
import com.pom.service.UserService;
import com.pom.util.JsonResult;
import com.pom.util.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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

    /*微博历史数据汇总-时间段*/
    @RequestMapping(value = "/countWeiboDataSqlTimeBucket/{id}")
    public String countWeiboDataSqlTimeBucket(@PathVariable String id, @PathVariable String id2) {
        SuccessResult result = new SuccessResult();
        List<HistoryDataCount> users = userService.countWeiboDataSqlTimeBucket(id, id2);
        if (null != users && users.size() > 0) {
            System.out.println("----------------------------------------------------");
            result.addData("countWeiboDataSqlTimeBucket", users);
        } else {
            result.addData("countWeiboDataSqlTimeBucket", new ArrayList<>());
        }
        return result.toString();
    }

    /*微信历史数据汇总-时间段*/
    @RequestMapping(value = "/countWeChatDataTimeBucket/{id}")
    public String countWeChatDataTimeBucket(@PathVariable String id, @PathVariable String id2) {
        SuccessResult result = new SuccessResult();
        List<HistoryDataCount> users = userService.countWeChatDataSqlTimeBucket(id, id2);
        if (null != users && users.size() > 0) {
            System.out.println("----------------------------------------------------");
            result.addData("countWeChatDataTimeBucket", users);
        } else {
            result.addData("countWeChatDataTimeBucket", new ArrayList<>());
        }
        return result.toString();
    }

    /*总历史数据汇总-时间段*/
    @RequestMapping(value = "/counthistoryDataTimeBucket/{id}")
    public String counthistoryDataTimeBucket(@PathVariable String id, @PathVariable String id2) {
        SuccessResult result = new SuccessResult();
        List<HistoryDataCount> users = userService.counthistoryDataSqlTimeBucket(id, id2);
        if (null != users && users.size() > 0) {
            System.out.println("----------------------------------------------------");
            result.addData("counthistoryDataTimeBucket", users);
        } else {
            result.addData("counthistoryDataTimeBucket", new ArrayList<>());
        }
        return result.toString();
    }

    /*总历史数据汇总-全部-双字段匹配*/
    @RequestMapping(value = "/countAllhistoryData/{id}/{id2}")
    public String countAllHistoryData1(@PathVariable String id, @PathVariable String id2) throws ParseException {
        //转换时间戳 传参类型，例：2020-01-01A2020-12-12
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //按照“A”切割
        String[] split = id2.split("A");
        //获取前半段时间，2020-01-01 将其转换为秒为单位的时间戳
        Date date1 = simpleDateFormat.parse(split[0]);
        Long ts1 = date1.getTime();
        BigInteger res_ts1 = BigInteger.valueOf(Long.parseLong(ts1.toString().substring(0, 10)));

        //获取后半段时间，2020-12-12 将其转换为秒为单位的时间戳
        Date date2 = simpleDateFormat.parse(split[1]);
        Long ts2 = date2.getTime();
        //转换的时间是0点的时间戳，但是入数据库的实际时间可能是0点之后的时间戳，所以要加上24小时
        String add_time = "86400";
        long add_time1 = Long.parseLong(add_time);
        BigInteger res_ts2 = BigInteger.valueOf(Long.parseLong(ts2.toString().substring(0, 10))).add(BigInteger.valueOf(add_time1));

        if (id.equals("weibo") && null != id2) {
            SuccessResult result = new SuccessResult();
            List<HistoryDataCount> users = userService.countWeiboDataSql(id, id2, res_ts1, res_ts2);
            if (null != users && users.size() > 0) {
                System.out.println("----------------------------------------------------");
                result.addData("data", users);
            } else {
                result.addData("data", new ArrayList<>());
            }
            return result.toString();
        } else if (id.equals("wechat") && null != id2) {
            SuccessResult result = new SuccessResult();
            List<HistoryDataCount> users = userService.countWeChatDataSql(id, id2, res_ts1, res_ts2);
            if (null != users && users.size() > 0) {
                System.out.println("----------------------------------------------------");
                result.addData("data", users);
            } else {
                result.addData("data", new ArrayList<>());
            }
            return result.toString();
        } else if (id.equals("internet_media") && null != id2) {
            SuccessResult result = new SuccessResult();
            List<HistoryDataCount> users = userService.countInternetMediaDataSqlTimeBucket(id, id2, res_ts1, res_ts2);
            if (null != users && users.size() > 0) {
                System.out.println("----------------------------------------------------");
                result.addData("data", users);
            } else {
                result.addData("data", new ArrayList<>());
            }
            return result.toString();
        } else if (id.equals("history_count_data") && null != id2) {
            SuccessResult result = new SuccessResult();
            List<HistoryDataCount> users = userService.counthistoryDataSql(id, id2, res_ts1, res_ts2);
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

    /*总历史数据汇总-全部-单字段匹配*/
    @RequestMapping(value = "/countAllhistoryData/{id}")
    public String countAllHistoryData2(@PathVariable String id) {
        SuccessResult result;
        List users;
        //1 历史汇总数据-微博数据
        if (id.equals("weibo")) {
            result = new SuccessResult();
            users = this.userService.countWeiboDataSql1(id);
            if (null != users && users.size() > 0) {
                System.out.println("---------------------weibo--single-count-data-------------------------");
                result.addData("data", users);
            } else {
                result.addData("data", new ArrayList());
            }
            return result.toString();
        } else if (id.equals("wechat")) {
            result = new SuccessResult();
            users = this.userService.countWeChatDataSql1(id);
            if (null != users && users.size() > 0) {
                System.out.println("---------------------wechat--single-count-data-------------------------");
                result.addData("data", users);
            } else {
                result.addData("data", new ArrayList());
            }
            return result.toString();
        } else if (id.equals("internet_media")) {
            result = new SuccessResult();
            users = this.userService.countInternetMediaDataSqlTimeBucket1(id);
            if (null != users && users.size() > 0) {
                System.out.println("---------------------internet_media--single-count-data-------------------------");
                result.addData("data", users);
            } else {
                result.addData("data", new ArrayList());
            }
            return result.toString();
        } else if (id.equals("history_count_data")) {
            result = new SuccessResult();
            users = this.userService.counthistoryDataSql1(id);
            if (null != users && users.size() > 0) {
                System.out.println("---------------------history_count_data--single-count-data-------------------------");
                result.addData("data", users);
            } else {
                result.addData("data", new ArrayList());
            }
            return result.toString();

        }
        return "Sorry,if you see this information,the reason maybe you input the wrong source type,please check it and try it again ! Thanks";
    }

    /*历史数据汇总-总页*/
    @RequestMapping(value = "/countAllhistoryData2/{all}")
    public String countAllHistoryData3(@PathVariable String all) {
        SuccessResult result;
        List weibo_data, wechat_data, intetnet_media_data;
        HashMap<String, String> stringListHashMap = new HashMap<>();
        if (all.equals("all")) {
            result = new SuccessResult();

            /*1 微博数据*/
            weibo_data = this.userService.weiboSql(all);
            if (null != weibo_data && weibo_data.size() > 0) {
                result.addData("weibo", weibo_data);
            } else {
                result.addData("weibo", new ArrayList());
            }
            //String s1 = result.toString();

            /*2 微信数据*/
            wechat_data = this.userService.wechatSql(all);
            if (null != wechat_data && wechat_data.size() > 0) {
                result.addData("wechat", wechat_data);
            } else {
                result.addData("wechat", new ArrayList());
            }
            // String s2 = result.toString();

            /*3 网媒数据*/
            intetnet_media_data = this.userService.internetMediaSql(all);
            if (null != intetnet_media_data && intetnet_media_data.size() > 0) {
                result.addData("internet_media", intetnet_media_data);
            } else {
                result.addData("internet_media", new ArrayList());
            }
            //String s3 = result.toString();
            return result.toString();
        }
        return "Sorry,if you see this information,the reason maybe you input the wrong source type,please check it and try it again ! Thanks";
    }


    /*历史数据汇总-总页*/
    @RequestMapping(value = "/countAllhistoryData3/{all}")
    public JsonResult<List> getUserList(@PathVariable String all) {
        List weibo_data, wechat_data, intetnet_media_data;
        SuccessResult result;
        ArrayList<List> lists = new ArrayList<>();
        /*1 微博数据*/
        if (all.equals("all")) {
            result = new SuccessResult();
            weibo_data = this.userService.weiboSql(all);
            if (null != weibo_data && weibo_data.size() > 0) {
                result.addData("weibo", weibo_data);
            } else {
                result.addData("weibo", new ArrayList());
            }
            /*2 微信数据*/
            wechat_data = this.userService.wechatSql(all);
            if (null != wechat_data && wechat_data.size() > 0) {
                result.addData("wechat", wechat_data);
            } else {
                result.addData("wechat", new ArrayList());
            }
            // String s2 = result.toString();

            /*3 网媒数据*/
            intetnet_media_data = this.userService.internetMediaSql(all);
            if (null != intetnet_media_data && intetnet_media_data.size() > 0) {
                result.addData("internet_media", intetnet_media_data);
            } else {
                result.addData("internet_media", new ArrayList());
            }
            lists.add(weibo_data);
            lists.add(wechat_data);
            lists.add(intetnet_media_data);
        }
        return new JsonResult<>(lists);
    }
}
