package com.CustomMethodGeneric;

import java.util.ArrayList;
//【自定义泛型方法注意事项】
public class CustomMethodGeneric_ {
    public static void main(String[] args) {

        Person<String> stringPerson = new Person<>();

        //自定义泛型方法大大提高了复用性
        stringPerson.hi("djal");//当调用泛型方法时，传入参数，编译器，就会确定类型
        stringPerson.hi(443);

        stringPerson.hi(new ArrayList<Object>());
    }
}

//泛型类可以使用泛型方法
class Person<T>{
    T name;

    public <E> void hi(E e){//自定义泛型方法

    }

    public T tname(){//方法使用了泛型
        return name;
    }//普通成员使用泛型

    public <V> T OK(V v){return name;}//泛型类中的使用泛型方法

    public void hi(){}//普通方法
}

//普通类也可以使用泛型方法
class D{
    public <T> void hi(T t){//自定义泛型方法

    }
}


