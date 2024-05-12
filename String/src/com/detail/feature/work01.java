package com.detail.feature;
//字符串的特性
//最后两行代码是最佳体现。
public class work01 {
    public static void main(String[] args) {
        String s1 = "hspedu";
        String s2 = "java";
        String s3 = "hspedujava";
        String s4 = s1 + s2;//变量相加，是在堆中。
        System.out.println(s3 == s4.intern());//t

        /*
        重要规则：String c1 = "ab" + "cd"；常量相加，看的是池。

        String c = a + b;变量相加，是在堆中。
         */
        System.out.println(s4 == s4.intern());//f
    }
}
