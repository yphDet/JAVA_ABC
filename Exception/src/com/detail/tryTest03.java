package com.detail;

import java.util.Scanner;

//解读:try-final的使用
/*
可以进行 try - finally 配合使用，这种用法     相当与没有捕获异常
异常代码会直接崩溃/退出。
try - finally应用场景，就是执行一段代码，不管是否发生异常，都必须执行某个业务逻辑
 */
public class tryTest03 {
    public static void main(String[] args) {
        try {
            int n = 10;
            int n1 = 0;
            int num = n/n1;
            System.out.println("num=" + num);
        } finally {
            System.out.println("执行了finally");
        }
        System.out.println("try - finally之后的代码");//这种用法相当与没有捕获异常；异常代码会直接崩溃/退出。（这行代码将不再执行）
    }
}
