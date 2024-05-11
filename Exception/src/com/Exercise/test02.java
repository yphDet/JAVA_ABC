package com.Exercise;

public class test02 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat = null;
        //空指针异常[NullPointerExerption]
        System.out.println(cat.name);
    }
}
class Cat{
    public String name;
}
