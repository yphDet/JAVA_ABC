package com.Review;

import java.io.Serializable;

public class Use {
    public static void main(String[] args) {
        Person no1 = Person.NO1;//1、枚举的使用方式 2、枚举对象 还默认使用了static
        int a1 = Use.a;
        //通过于普通类中的属性对比：     可以说明其编译类型
    }
    private static int a ;
}
interface A{}
interface B{}
//在定义枚举（Enum）时，通常不允许使用 extends 关键字来指定一个超类（superclass）或
// 父类已经实现的接口（parent interface）。
//枚举类型，它隐式地继承自Java内置的 Enum 类
//由于Java是单继承的，这意味着一个类只能直接继承自一个父类
/*extends Use*/
enum Person implements A,B, Serializable {
    //枚举常量是该类的静态、final的实例
    //使用了枚举必须在其代码块区中的首行用 ; 表示枚举常量
    NO1("me",1),NO2("yph",2);
    public static void main(String[] args) {
        NO1.name = "yph";
        System.out.println(NO1);

        //NO2 = NO1;这里说明枚举对象 默认使用了final修饰

//        Person myself = new Person("myself", 1);枚举不可以实例化

    }

    private String name;
    private int id;

    //枚举的构造器访问修饰符不是任意的，它们通常是私有的或包级私有的
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}