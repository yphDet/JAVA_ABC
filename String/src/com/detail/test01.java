package com.detail;
//【1】：创建String对象的两种方式
public class test01 {
    public static void main(String[] args) {
        //String类创建对象方式一：
        String a = "abc";
        String b = "abc";
        System.out.println(a.equals(b));//t【内容比较】
        System.out.println(a==b);//t【地址比较】

    }
}
