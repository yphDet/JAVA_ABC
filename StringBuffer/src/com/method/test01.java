package com.method;

public class test01 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        //增
        System.out.println("===增===");
        sb.append(",");
        sb.append(135);
        sb.append("赵敏").append(100).append(true);
        System.out.println(sb);

        //删
        System.out.println("===删===");
        sb.delete(5,10);//删除范围[5,10)
        System.out.println(sb);

        //改
        System.out.println("===改===");
        sb.replace(3,6,"world");//替换[3,6)之间的字符
        System.out.println(sb);

        //查
        System.out.println("===查===");
        int index = sb.indexOf("0");
        System.out.println(index);
        int Lindex = sb.lastIndexOf("0");
        System.out.println(Lindex);

        //插
        System.out.println("===插===插");
        sb.insert(5,5);
        System.out.println(sb);

        //获取长度
        System.out.println("=获取长度=");
        System.out.println(sb.length());
    }
}
