package com.mybatis.utils;

import java.util.UUID;

/**
 * @Author: XQ-Yang
 * @Date: 2021/8/6 0006
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public class IDUtil {
    public static String getID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }


    public static void main(String[] args) {
        System.out.println(getID());
    }
}
