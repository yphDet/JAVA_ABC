//抽象模板设计模式


package com.model;

public class test01 {
    public static void main(String[] args) {
        new B01().caculate();
    }
}
abstract class Abs{//抽象模板设计模式；
    public void caculate(){
        long start = System.currentTimeMillis();
        job();//抽象方法的妙用
        long end = System.currentTimeMillis();
        System.out.println("执行时间" + (end - start));
    }
    public abstract void job();
}
class A01 extends Abs{
//    public void caculate(){
//        long start = System.currentTimeMillis();
//       job();
//        long end = System.currentTimeMillis();
//        System.out.println("执行时间" + (end - start));
//    }
    public void job(){
        int num = 0;
        for (int i = 0; i <= 800000; i++) {
            num += i;
        }
    }
}
class B01 extends Abs{
//    public void caculate(){
//        long start = System.currentTimeMillis();
//        job();
//        long end = System.currentTimeMillis();
//        System.out.println("执行时间" + (end - start));
//    }
    public void job(){
        long num = 0;
        for (int i = 0; i <= 9990000; i++) {
            num *= i;
        }
    }
}
