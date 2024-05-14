package com.duct;
//引出泛型
import java.util.ArrayList;
@SuppressWarnings({"all"})
public class generic01 {
    public static void main(String[] args) {
        //【引出泛型】
        /**
         * 1)请编写程序，在ArrayList中，添加多个Dog对象
         * 2）Dog对象含有name和age，并输出name和age(使用getXxx方法)
         */

        //先使用传统的方法来解决
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("tutu",3));
        arrayList.add(new Dog("hei",1));
        arrayList.add(new Dog("huang",7));

        for (Object object :arrayList) {
            Dog dog = (Dog) object;
            System.out.println(dog.getAge() + "-" +dog.getName());
        }

        //如果添加其他类对象，还是要遍历ArrayList中输出Dog类中的信息应该怎么办--保存到其他对象中[我自己的想法是将同一类型的保存到一起]
        //有或者程序员，不小心，添加了其他类对象
        arrayList.add(new Cat());
        for (Object object : arrayList) {
            //任何向上面直接向下转化类型 编译器会报错--转化类型异常；

            if(object instanceof Dog){//但是这样的解决，虽然行；但是如果代码的执行效率降低；
                //以及任何有多个类的对象需要通过getXxx方法输出时，这样就太繁琐了，代码的复用性不够高。
                Dog dog = (Dog) object;//类型的转换的效率不是特别好
                System.out.println(dog.getName() + "-" + dog.getAge());
            }
        }


    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Cat{}