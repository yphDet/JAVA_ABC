package com.Method;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//enum常用方法。
//1) toString:Enum 类已经重写过了，返回的是当前对象
//名,子类可以重写该方法，用于返回对象的属性信息
//2) name：返回当前对象名（常量名），子类中不能重写
//80% 3) ordinal：返回当前对象的位置号，默认从 0 开始
//100% 4) values：返回当前枚举类中所有的常量
//80% 5) valueOf：将字符串转换成枚举对象，要求字符串必须
//为已有的常量名，否则报异常！
//80% 6) compareTo：比较两个枚举常量，比较的就是编号！
public class test01 {
    public static void main(String[] args) {
        Season2 spring = Season2.SPRING;
        System.out.println(spring);//toString 在子类中重写了
        System.out.println(spring.name());//返回当前对象名（常量名），子类中不能重写。
//3)ordinal:返回当前对象的位置号，默认从 0 开始。
        System.out.println(spring.ordinal());
        System.out.println(Season2.SUMMER.ordinal());

        //valueof:将字符串换成枚举对象，要求字符串必须为已有的常量名
        //否则报错
        //执行流程：
        //1、根据你输入的"WINTER"到Season2的枚举对象中查找
        //2、如果找到了，就返回，如果没有找到，就报错。
        System.out.println(Season2.valueOf("WINTER"));
        //compareTo()的使用与equal()一致，但是语法不一样。
        // 语法：（前一个对象的编号 - 后一个对象的编号）  Season2.AUTUMN 的编号[3] - Season2.SPRING的编号[1]
        System.out.println(Season2.AUTUMN.compareTo(Season2.SPRING));
    }

}
enum Season2{//1、当我们使用enum关键字开发一个枚举类是，默认会继承Enum类

    SPRING("春天","温暖"),SUMMER("夏天","炎热"),AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷");//枚举对象的创建
    private String name;
    private String desciption;

    Season2(String name, String desciption) {
        this.name = name;
        this.desciption = desciption;
    }

    Season2() {
    }

    public String getName() {
        return name;
    }

    public String getDesciption() {
        return desciption;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desciption='" + desciption + '\'' +
                '}';
    }
}

