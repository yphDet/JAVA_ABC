package com.detail;
//当我们使用enum关键字开发一个枚举类是，默认会继承Enum类，使用开发工具
//说明  javac 编译工具 将 .java文件 编译成 .class文件
//      javap 反编译工具 将 .class文件 编译成 .java文件（隐式代码也会出现）
//在这里的理解：隐式代码 就在底层执行的代码。
public class test01 {
    public static void main(String[] args) {

    }
}
enum Season2{

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
}
