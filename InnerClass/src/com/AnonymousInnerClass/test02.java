package com.AnonymousInnerClass;

public class test02 {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.method02();
    }
}
class Outer02{
        private int n2 = 20;
        public void method02(){//1)
            System.out.println();
            //匿名内部类的使用---[方法体]
            Father f = new Father("ph",20,'男'){

            };
            System.out.println(f.getName());

            //注意1） 与 2） 的使用方式；
            //普通类的使用
            new Father("pp",18,'男').getAge();//2)
        }
}

class Father{
    private String name;
    private int age;
    private char gender;

    public Father(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
