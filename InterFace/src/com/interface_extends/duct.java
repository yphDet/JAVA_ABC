package com.interface_extends;

//实现接口 vs 继承类
//接口和继承解决的问题不同
/*
继承的价值主要在于：解决代码的复用性和可维护性
接口的价值主要在于：设计，设计好各种规范（方法），
让其它类去实现这些方法。即更加灵活
 */
//接口比继承更加灵活
//接口比继承更加灵活，继承是满足 is -a的关系，
//而接口只需要满足 like - a的关系

public class duct {
}
class A{
    private String name;
    private int age;
    private char gender;

    public void base(){
        System.out.println("我有学习能力");
    }

    public A(String name, int age, char gender) {
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

interface JAVA extends technolongy{
    void program();
}

interface technolongy{
    void others();
}
class a extends A implements JAVA{
    public a(String name, int age, char gender) {
        super(name, age, gender);
    }

    @Override
    public void program() {
        System.out.println("a有学习能力，通过这个能力学习java编程");
    }

    @Override
    public void others() {
        System.out.println("可以在学习其他技术");
    }
}
