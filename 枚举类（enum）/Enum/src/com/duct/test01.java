package com.duct;

//自定义类是实现枚举（枚举的引出）
/*
1、不需要提供setXxx方法，因为枚举对象只通常为只读【去掉setXxx方法，防止属性被修改】
2、枚举对象名通常使用全部大写，常量的命名规范
3、对枚举对象/属性使用final+static共同修饰，实现底层优化【因为枚举是一组常量的集合.】
4、枚举对象根据需要，也可以有多个属性；
 */


public class test01 {
}
class Season{ //自定义类实现枚举
    private String name;
    private String description;

    //这里可以理解：枚举属于一种特殊的类，里面只包括一组有限的特定的对象
    //因此这里的构造器中用private修饰，枚举对象在类中实现。
    //1、将构造器私有化private，目的防止 直接 new
    private Season(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    //2)枚举是一组常量的集合.（常量，集合）--本类内部创建一组对象
    //3、在Season内部，直接创建固定的对象
    //优化，可以加入final修饰符
    public final static Season SPRING = new Season("春天","温暖");
    public final static Season SUMMER = new Season("夏天","炎热");
    public final static Season AUTUMN = new Season("秋天","凉爽");
    public final static Season WINTER = new Season("冬天","寒冷");

}

//自定义类实现枚举-小结
//小结：进行自定义列实现枚举，有如下特点：


