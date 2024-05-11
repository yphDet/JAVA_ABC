package com.Exception;
//类型转换异常
public class ClassCasException {
    public static void main(String[] args) {
         A a = new B();
         B b = (B)a;
         C c = (C)a;
    }
}
class A{}
class B extends A{}
class C extends A{}