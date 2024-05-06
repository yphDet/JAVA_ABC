package com.Exercise;

public class test01 {
    static int count = 9;
    public void count(){
        System.out.println("count" + (count++));
    }

    public static void main(String[] args) {
        //类变量也叫静态变量/静态属性，是该类的所有对象共性的变量（任何一个该类的对象去访问它时，
        //取到的都是相同的值，同样任何一个类去修改它时，修改的也是同一个变量）
        new test01().count();//9
        new test01().count();//10
        //类变量是在类加载时就初始化，也就是说，即使没有创建对象，只要类加载了，
        //就可以使用类变量了。
        System.out.println(test01.count);//11
    }
}
