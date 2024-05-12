package com.Method;

public class test01 {
    public static void main(String[] args) {
        //equals 区分大小写，判断内容是否相等
        System.out.println("ava".equals("dald"));
        // equalslgnoreCase 忽略大小写的判断内容是否相等
        System.out.println("HeLLo".equals("hello"));
        // length 获取字符的个数，字符串的长度
        String s1 = "java";
        System.out.println(s1.length());
        // indexof 获取字符在字符串中第1次出现的索引索引从0开始，如果找不到，返回-1
        String s2 = "wer@terwe@g";
        int index = s2.indexOf('@');
        System.out.println(index);
        System.out.println(s2.indexOf("er"));
        // lastIndexOf 获取字符在字符串中最后1次出现的索引索引从0开始如找不到，返回-1
        System.out.println(s2.lastIndexOf('@'));
        System.out.println(s2.lastIndexOf("we"));
        // substring 截取指定范围的子串
        //解读：
        System.out.println(s2.substring(6));//从索引6开始截取后面所有的内容
        System.out.println(s2.substring(2,5));//表示从索引0开始索取，截取到索引范围：[2,5)
        // trim 去前后空格
        String s3 = " jdls dsi s ";
        System.out.println(s3.trim());
        // charAt :获取某索引处的字符，注意不能使用Str[index ]这种方式
        System.out.println(s2.charAt(3));
    }
}
