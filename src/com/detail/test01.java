package com.detail;

public class test01 {
}

class AA{
    //1、final修饰的属性又叫常量，一般用XX_XX来命名
    //2、final修饰的属性在定义时，必须赋初值，并且以后不修改，
    //赋值可以在如下位置之一：
    public final int TAX_RATE = 8;//2.1:定义时
    private final double D_R;
    public AA(){
        D_R = 0.9;//2.2: 在构造器中
    }
    private final char G_N;
    {
        G_N = 'n';//2.3: 在代码块中
    }
}
