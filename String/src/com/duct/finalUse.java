package com.duct;
/*
200% 7)String 有属性 private final char value[];用于存放字符串内容
8)一定要注意：value 是一个final 类型，不可以修改（需要功力）：
即value 不能指新的地址，但是单个字符内容是可以变化
 */
public class finalUse {
    public static void main(String[] args) {
        //final不可以修改的本质：(对应什么数据类型)
        final char[] c1 ={'a','b','c'};
        final char[] c2 ={'a','b','c'};
        //c1 = c2;
        c1[0]='d';

        //
        final int n1 = 1;
        final int n2 = 2;
//        n1 = n2;
//        n1 = 2;
    }
}
