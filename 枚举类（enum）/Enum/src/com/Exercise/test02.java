package com.Exercise;

public class test02 {
    public static void main(String[] args) {
        System.out.println("===所有星期的信息如下===");
        week[] weeks = week.values();
        for(week w:weeks){
            System.out.println(w);
        }
    }
}
enum week{
    /*
    1) 构造器私有化
    2）可以提供 get 方法，但是不要提供 set
    3) 本类内部创建一组对象
     */
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),
    THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    private String name;
    private week(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
