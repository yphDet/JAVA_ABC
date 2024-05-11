package com.CustomException;
//自定义异常继承编译异常
//throw 和 throws 的区别 见  自定义异常 文件；
import java.util.Scanner;

public class duct01 {
    public static void main(String[] args) throws Exception{//继承Exception属于编译异常需要显示调用异常；
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (!(age >= 18 && age <= 120)) {
            throw new ageException("wrong");
        }
        System.out.println("OK");
    }
}
class ageException extends Exception{//自定义异常继承Exception，属于编译异常；

    public ageException(String message) {
        super(message);
    }
}
