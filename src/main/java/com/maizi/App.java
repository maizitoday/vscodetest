package com.maizi;
/*
 * @Description: 请输入....
 * @Author: 麦子
 * @LastEditors: 麦子
 * @Date: 2019-05-06 00:48:11
 * @LastEditTime: 2019-05-06 05:15:41
 */


public class App {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
             if (i == 99) {
                 System.out.println("我要退出了");
                 break;
             }
        }
        String result = "我要走了-ok---+eeee++----";
        System.out.println(result);
        System.out.println("我要退出了");
    }

}
