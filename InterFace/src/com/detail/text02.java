package com.detail;

public class text02 {
    public static void main(String[] args) {
        System.out.println(C.a);//接口中的属性的访问形式：接口名.属性名
        //是因为接口中的所有属性都是 public final static修饰的；

    }
}

//一个类同时可以实现多个接口
interface A{}
interface B{}
class c01 implements A,B{}

//接口中的属性的访问形式：接口名.属性名；
interface C{
    int a = 1;//实际上是public final static int a = 1;
}

//一个接口不能继承其他的类，但是可以继承多个别的接口
//一个类可以同时实现多个接口。
class c02 implements A,B{}
class c03{}

//interface E extends c03{}//一个接口不能继承其他的类

interface F extends A,B{}

