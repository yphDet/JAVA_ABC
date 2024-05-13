package com.Method;

import java.util.Arrays;
import java.util.List;

public class test05 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{9,3,2};
        //ill数组元素的填充
        //解读：使用99取填充 arr数组，可以理解成是替换原理的元素
        Arrays.fill(arr,99);
        System.out.println("===arr数组填充后===");
        System.out.println(Arrays.toString(arr));//[99.99,99]

        //equals 比较两个数组元素内容是否完全一致
        Integer[] arr2 = {1,2,90,123};

        boolean connect = Arrays.equals(arr,arr2);
        System.out.println(connect);


        //asList 将一组值，转换成list
        //解读：
        //1、asList方法，会将(2,3,4,5,6)数据转成一个List集合
        //2、返回的asList 编译类型 List（接口）
        //3、a  运行类型 java.util.Arrays$ArrayList
        List a = Arrays.asList(2,3,4,5,6);
        System.out.println(a.getClass());


    }
}
