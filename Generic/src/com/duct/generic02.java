package com.duct;


import java.util.ArrayList;

public class generic02 {
    public static void main(String[] args) {
        //泛型的好处以及基本理解【对于使用传统方法会出现的情况等引出泛型】
        /**
         * 使用传统方法的问题分析
         * 1）不能对加入结合ArrayList中的数据类型进行约束（不安全）---存储的数据类型
         * 2）遍历的时候，需要进行类型转化，如果集合中的数据量较大，对效率有影响
         */

        //解读
        ArrayList<Staff> arraylist = new ArrayList<Staff>();
        /*
        public class ArrayList<E>{}
        解读：E称为泛型，那么Staff-》E
         */
        //一；表明ArrayList使用了泛型；二：说明ArrayList使用[存储]的类型只能是Staff

        arraylist.add(new Staff("jack",30));
        arraylist.add(new Staff("tom",20));
        arraylist.add(new Staff("smith",48));

        //使用泛型的好处如下：
        /*
        1、在添加数据时就已经进行了排除
        2、类型转换更加方便
         */

        //不用再进行类型转化了
        for (Staff staff : arraylist) {
            System.out.println(staff.getName() + "-" + staff.getId());
        }
        /*
        使用泛型后，对加入的数据类型进行约束了：演示如下并加以解读
        arraylist.add(new Person());//no【以及即便添加了除Staff类型的数据；编译时就会直接显示出错误，这样就避免了抛出类型转化异常】
         */
    }



}
class Staff{
    private String name;
    private int id;

    public Staff(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class Person{
    private String base;

    public Person(String base) {
        this.base = base;
    }

    public String getBase() {
        return base;
    }

    public Person() {
    }

    public void setBase(String base) {
        this.base = base;
    }
}