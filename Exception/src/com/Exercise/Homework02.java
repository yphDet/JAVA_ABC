package com.Exercise;

public class Homework02 {
    public static void main(String[] args) {
        //args.length 可能为 0
        //所以可能发生数组下标索引异常。
        if (args[4].equals("john")){//可能发生空指针异常。
            System.out.println("AA");
        }else{
            System.out.println("BB");
        }
        Object o = args[2];//向上转型；
        Integer i = (Integer) o;//错误；类型转换异常；
    }
}
