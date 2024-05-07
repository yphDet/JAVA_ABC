package com.Exercise;

import javafx.scene.control.Cell;

public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Caculter() {
            @Override
            public double work(double d1,double d2) {
                System.out.println("匿名内部类");
                return d1 + d2;
            }
        },10,8);
    }
}
interface Caculter{
    double work(double d1,double d2);
}
class Cellphone{
    public void testWork(Caculter caculter,double d1,double d2){
        caculter.work(d1,d2);

    }
}
