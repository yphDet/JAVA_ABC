package com.Exercise;

public class test01 {
    public static void main(String[] args) {
        Circle circle = new Circle(1.23);
        System.out.println("半径为" + circle.radius + "的面积为" + circle.caculate());
    }
}
class Circle{
    public double radius;

    private final double PI = 3.14;//定义时
//    {代码块
//        PI = 3.14;
//    }
    public Circle(double radius){
        //PI = 3.14;构造器
        this.radius = radius;
    }
    public double caculate(){
        return radius * radius * PI;
    }
}
