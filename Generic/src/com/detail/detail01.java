package com.detail;

import java.util.ArrayList;

public class detail01 {
    public static void main(String[] args) {

        //一、给泛型指向数据类型的要求是   引用数据类型，不能是基本数据类型
        ArrayList<Integer> integers = new ArrayList<>();
        //ArrayList<int> ints = new ArrayList<int>();错误 警告

        //二、泛型的使用形式
        ArrayList<Integer> integers1 = new ArrayList<>();//推荐使用
        ArrayList<Integer> integers2 = new ArrayList<Integer>();

        //默认使用形式状态下的情况--->这种情况下给泛型指定的引用类型是  Object
        ArrayList arrayList = new ArrayList();
        //等价于   ArrayList<Object> arrayList = new ArrayList<Object>();

    }
}
