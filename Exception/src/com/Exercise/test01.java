package com.Exercise;

public class test01 {
    public static void main(String[] args) {
        String friends[] = {"tom","jack","milan"};
//        for (String str:friends){//增强for
//            System.out.println(str);
//        }
        //数组下标索引异常[ArrayIndexOutOfBoundsException]
        for(int i = 0 ;i <= friends.length;i++)
            System.out.println(friends[i]);
    }
}
