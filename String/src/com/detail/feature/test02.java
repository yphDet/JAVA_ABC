package com.detail.feature;
//了解字符串常量相加["ab" + "cd"]  与 String类对象相加[String a = "a"; String b = "b";String c = a + b]；
public class test02 {
    public static void main(String[] args) {
        //创建几个对象？画出内存图
        //解读：底层是
        //1、StringBuilder sb = new StringBuilder();
        //2、sb.append(a);
        //3、sb.append(b);
        //sb是在堆中，并且append是在原来字符串的基础上追加的。
        //最后其实是 c 指向堆中的对象（String） value[] -> 池中 “helloabc”
        String a = "hello";
        String b = "abc";
        String c = a + b;
        System.out.println(c);
//小结：
        /*
        重要规则：String c1 = "ab" + "cd"；常量相加，看的是池。

        String c = a + b;变量相加，是在堆中。
         */


        //下面代码和上面代码在底层操作一致
        String s = new String("hello");
        String s1 = new String("abc");
        String s2 = s + s1;
        System.out.println(s2 == c);//f
    }
}
