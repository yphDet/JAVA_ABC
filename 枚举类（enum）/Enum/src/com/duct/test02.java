//用enum关键字实现枚举
/*
学习目标：使用enum来实现前面的枚举案例，
主要体会和自定义实现类实现枚举不同的地方。
 */


package com.duct;

public class test02 {
    public static void main(String[] args) {
        Season2 spring = Season2.SPRING;//个人认为：在外部其他类中使用枚举对象的时候，类似于属性；
        System.out.println(spring);
        System.out.println(spring.getDesciption());
    }

}
enum Season2{
    //SPRING("春天","温暖")     解读 常量名（参数列表）
    //如果有多个常量（对象），用 , 号隔开；
    //60% 1、如果使用enum来实现枚举，要求将定义常量对象写在前面
    //60% 2、如果使用的是无参构造器，创建常量对象，则可以省略（）
    //eg: SPRING,SUMMER;

    //枚举对象的创建：
    SPRING("春天","温暖"),SUMMER("夏天","炎热"),AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷");//枚举对象的创建
    private String name;
    private String desciption;

    //这里的构造器默认用private修饰
    Season2(String name, String desciption) {//为什么通过快捷键编译的构造器没有修饰符？--编译器默认为私有化
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
