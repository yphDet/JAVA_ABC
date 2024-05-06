package com.duct;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class duct {
}
abstract class Ainaml{
    private String name;

    public Ainaml(String name) {
        this.name = name;
    }

    //思考：这里eat 这里你实现了，其实没有什么意义
    //即：  父类方法不确定性的问题
    //===》考虑将该方法设计为抽象（abstract）方法
    //===》所谓抽象方法就是没有实现的方法
    //===》所谓没有实现就是指，没有方法体；
    //===》100% 当一个类中存在抽象方法时，需要将该类声明为abstract类
//    public void eat(){
//        System.out.println("这是一个动物，但是不正当吃什么");
//    }

    public abstract void eat();

}
