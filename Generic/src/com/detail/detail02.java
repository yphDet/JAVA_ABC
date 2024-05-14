package com.detail;

import java.util.ArrayList;

public class detail02 {
    //【在给泛型指定具体类型后，可以传入该类型或者子类类型】
    public static void main(String[] args) {
        ArrayList<A> as = new ArrayList<>();
        as.add(new a());
        //as.add(new AA());[不接受父类类型]



    }
}
class AA {}
class A extends AA{}
class a extends A{}
