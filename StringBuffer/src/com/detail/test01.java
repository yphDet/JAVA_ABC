package com.detail;

public class test01 {
    public static void main(String[] args) {
        //String --> StringBuffer
        String s = "hello";
        //【1】使用构造器
        StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println(stringBuffer);
        //【2】使用append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(s);
        System.out.println(stringBuffer1);

        //StringBuffer --> String
        //【1】使用构造器
        StringBuffer stringBuffer2 = new StringBuffer("hello");
        String s1 = new String(stringBuffer2);
        System.out.println(s1);

        //【2】使用toString方法
        String s2 = stringBuffer2.toString();
        System.out.println(s2);
    }
}
