package com.Exception;

public class NumberFormatException {//数字格式异常
    public static void main(String[] args) {
        String str = "phoh";
        int num = Integer.parseInt(str);
        //用于将 字符串 参数解析为 有符号的十进制整数。
        System.out.println(num);
    }
}
