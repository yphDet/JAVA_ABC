package com.CustomException;
//自定义异常
//继承 运行异常的优点；
import java.util.Scanner;

/*
当我们接受Person对象年龄时，要求范围在18-120之间
否则抛出一个自定义异常（要求 继承RuntimeException），并给出提示信息；
 */
public class duct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(!(age>=18 && age<=120)){
            throw new AgeException("输入年龄不在正确范围");
        }
        System.out.println("OK");
    }
}
//自定义异常：
//解读
//1、一般情况下，我们自定义异常是继承 RuntimeException
//2、因为 运行异常 ，编译器会使用默认的处理机制。
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
