package com.GenericExtends;

import java.util.ArrayList;
import java.util.List;


public class GenericExtends_ {
    public static void main(String[] args) {
        //【泛型的继承和通配符说明】


        ArrayList<Object> objects = new ArrayList<>();//泛型值为Object类
        ArrayList<String> strings = new ArrayList<>();//泛型值为String类
        ArrayList<A> as = new ArrayList<A>();//泛型值为A类
        ArrayList<B> bs = new ArrayList<>();//泛型值为B类
        ArrayList<C> cs = new ArrayList<>();//泛型值为C类

        //如果是List<?> c,可以接受（传入）任意的泛型类型
        printCollection1(objects);//OK
        printCollection1(strings);//OK
        printCollection1(as);//OK
        printCollection1(bs);//OK
        printCollection1(cs);//OK

        //如果是List<? extends A>,可以接受（传入）的泛型类型为A类或者A类的子类[规定了上限]
//        printCollection2(objects);//NO
//        printCollection2(strings);//NO
        printCollection2(as);//OK
        printCollection2(bs);//OK
        printCollection2(cs);//OK




        //如果是List<? super A>,可以接受（传入）的泛型类型为A类或者A类的父类[规定了下限]
        printCollection3(objects);//OK[Object类是所有类的基类]
//        printCollection3(strings);//NO
        printCollection3(as);//OK
//        printCollection3(bs);//NO
//        printCollection3(cs);//NO

    }
    //说明:List<?> 表示 任意的泛型类型都可以接受

    public static void printCollection1(List<?> c){
        for (Object object :c) {//通配符，取出时，就是Object
            System.out.println(object);
        }
    }

    //说明:List<? extends A> 表示 泛型类型可以接受A类或者A类的子类[规定了泛型的上限]
    public static void printCollection2(List<? extends A> c){
        for (Object object :c) {//通配符，取出时，就是Object
            System.out.println(object);
        }
    }

    //说明:List<? super A> 表示 泛型类型可以接受A类或者A类的父类[规定了泛型的下限]
    public static void printCollection3(List<? super A> c){
        for (Object object :c) {//通配符，取出时，就是Object
            System.out.println(object);
        }
    }
}
class A{}
class B extends A{}
class C extends B{}
