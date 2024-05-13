package com.Method;

import java.util.Arrays;
import java.util.Comparator;

public class test01 {
    public static void main(String[] args) {
        //1、toString返回数组的字符串形式。
        int[] arr = {1,-1,7,0,89};
        System.out.println(Arrays.toString(arr));
//
//        System.out.println("冒泡排序后");
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));


        //2、Arrays排序源码解读----sort
        Integer[] array = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        System.out.println(Arrays.toString(array));

        Arrays.sort(array,new Comparator(){//匿名内部类；
            @Override
            public int compare(Object o1, Object o2) {
                int t1 = (Integer) o1;//先向下转型，在自动转型。
                int t2 = (Integer) o2;
                return t1 - t2;
            }
        });
        System.out.println("===定制排序后===");
        System.out.println(Arrays.toString(array));
    }
}
