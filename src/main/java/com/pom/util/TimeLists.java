package com.pom.util;

import org.apache.commons.lang.time.FastDateFormat;

import java.util.*;

/**
 * @Author: LUJUHUI
 * @Description:
 * @Date: Created in 2020/3/18 16:30
 * @Modified by:
 */
public class TimeLists {
    public static void main(String[] args) {
        System.out.println(getTimeLists());

    }
    public static List<String> getTimeLists() {
        Calendar cal1 = Calendar.getInstance();
        cal1.add(Calendar.DATE, 0);
        String today = FastDateFormat.getInstance("yyyyMMdd").format(cal1.getTime());

        Calendar cal2 = Calendar.getInstance();
        cal2.add(Calendar.DATE, -1);
        String yestoday = FastDateFormat.getInstance("yyyyMMdd").format(cal2.getTime());

        Calendar cal3 = Calendar.getInstance();
        cal3.add(Calendar.DATE, -2);
        String three = FastDateFormat.getInstance("yyyyMMdd").format(cal3.getTime());

        Calendar cal4 = Calendar.getInstance();
        cal4.add(Calendar.DATE, -3);
        String four = FastDateFormat.getInstance("yyyyMMdd").format(cal4.getTime());

        Calendar cal5 = Calendar.getInstance();
        cal5.add(Calendar.DATE, -4);
        String five = FastDateFormat.getInstance("yyyyMMdd").format(cal5.getTime());

        return Arrays.asList(today, yestoday, three, four, five);
    }
}
