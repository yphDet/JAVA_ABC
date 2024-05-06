//有一群小孩在完，不是有新的小孩加入
//请问如何知道现在共有多少人在玩？


package com.static_variable;

public class duct {
    public static void main(String[] args) {
//
//        int count = 0;
//        Child a = new Child("A");
//        a.play();
//        count++;
//
//        Child b = new Child("B");
//        b.play();
//        count++;
//
//        System.out.println("最后有" + count + "在玩");

//       什么是类变量？//访问方式中最能体现该性质的时    对象。类变量名
         /*类变量也叫静态变量/静态属性，是该类的所有对象共性的变量（任何一个该类的对象去访问它时，
        取到的都是相同的值，同样任何一个类去修改它时，修改的也是同一个变量）*/

        Child c = new Child("C");
        c.play();
        c.num++;

        Child d = new Child("D");
        d.play();
        //任何访问类变量
        /*
        类名.类变量名
        对象.类变量名
         */
        d.num++;//类名.类变量名
        System.out.println("参加游戏的人数：" + Child.num);//对象.类变量名
    }
}
class Child{
    private String name;
    //定义类变量
    /*
    访问修饰符 static 数据类型 变量名；【推荐】
    static 访问修饰符 数据类型 变量名；
     */
    public static int num = 0;//参加游戏的人数；

    public void play(){
        System.out.println(name + "加入游戏");
    }

    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}