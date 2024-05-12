package com.detail;
//200% 【2】：两种创建String对象的区别
public class test03 {
    public static void main(String[] args) {
        //String类创建对象的两种方式
        //这个文件中最重要的代码是最后一行，将方式二的底层表示出来了。

        String a = "hsp";
        String b = new String("hsp");
        //回顾    == 运算符知识点  以及 equals方法 的知识点
        System.out.println(a.equals(b));
        System.out.println(a == b);//f
        //知识点：
        /*
        当调用intern方法是，如果池已经包含一个等于此String对象的字符串（用equals（Object）方法确定），
        则返回池中的字符串。否则，将此String对象添加到池中，并返回此String队形的引用
         */
        //小结该知识点：intern方法最终放回的是常量池的地址。
        System.out.println(a == b.intern());
        System.out.println(b == b.intern());
    }
}
