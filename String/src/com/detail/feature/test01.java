package com.detail.feature;

public class test01 {
    public static void main(String[] args) {
       //以下语句创建了几个对象？画出内存布局图

        String s1 = "hello";
        s1 = " haha";
        System.out.println(s1);
       //创建了2个对象

        String a = "hello" + "abc";
        //创建1个对象；
        //分析：String a = "hello" + "abc";===》优化等价 String a = "helloabc"
        System.out.println(a);

    }
}
