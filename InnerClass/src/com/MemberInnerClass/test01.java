package com.MemberInnerClass;



public class test01 {
    public static void main(String[] args) {
        //外部类访问成员内部类
        Outer01 outer00 = new Outer01();
        outer00.get();


        //100% 外部其他类访问成员内部类。三种方式
        outer00.new Inner01();

        Outer01.Inner01 inner01 = outer00.new Inner01();
        inner01.say();

        //通过在外部类中的方法得到成员内部类。
        Outer01 outer01 = new Outer01();
        Outer01.Inner01 getInner01 = outer01.getInner01();
        getInner01.say();
    }
}
class Outer01{//外部类
    private String name;
    private int age;
    private char gender;

    public void get(){
        Inner01 inner01 = new Inner01();
        inner01.say();
    }

    public Inner01 getInner01(){
        return new Inner01();
    }//创建成员内部类的对象



    public class Inner01{//成员内部类
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void say(){
            System.out.println(name + " " + Outer01.this.name);
            System.out.println("Inner01.say()");
        }
    }



}



