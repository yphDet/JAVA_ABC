package com.duct;
//泛型的基本理解
public class Generic {
    public static void main(String[] args) {
        //【泛型的作用：可以在类声明时通过一个表示表中某个属性的类型，或者是某个方法的返回值类型或者是参数类型】

        Student<String> student = new Student<String>("dad");
        //T泛型具体数据类型在定义Student对象的时候指定，即在编译时期，就确定T是什么数据类型
        /*现在可以这样理解下面的Student类
            class Student{
                private String name;【T表示数据类型】

                public Student(String name) {【T表示参数类型】
                    this.name = name;
                }

                public String getName() {【T表示返回值类型】
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public Student() {
                }
            }
         */

        student.show();

    }
}
class Student<T>{
    private T name;

    public Student(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public Student() {
    }
    public void show(){
        System.out.println(name.getClass());
    }
}
