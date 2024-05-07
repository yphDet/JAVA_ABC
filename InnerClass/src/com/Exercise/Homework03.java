package com.Exercise;

public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();

        Animal dog = new Dog();
        dog.shout();
    }
}
abstract class Animal{
    abstract void shout();
}
class Cat extends Animal{
    void shout(){
        System.out.println("猫会喵喵叫");
    }
}
class Dog extends Animal{
    void shout(){
        System.out.println("狗会旺旺叫");
    }
}