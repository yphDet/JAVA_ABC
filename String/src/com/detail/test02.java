package com.detail;

public class test02 {
    public static void main(String[] args) {
        //String类创建对象的方式二
        //我的理解这里的a 表示的是对象变量名
        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a.equals(b));
        System.out.println(a == b);//f
    }
}
