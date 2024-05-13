package com.Method;

import java.util.Arrays;
import java.util.Comparator;

//Arrays模拟排序
public class test02 {
    public static void main(String[] args) {
        int[] arr = {1,-1,0,7,5};
        //自定义冒泡排序
        test02.bubble(arr, new Comparator() {
            @Override
            public int compare(Object o1,Object o2) {
                int t1 = (Integer) o1;
                int t2 = (Integer) o2;
                return t1 - t2;
            }
        });
        System.out.println(Arrays.toString(arr));

    }
    



    public static void bubble(int[] arr, Comparator c){
        int t = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1;j++){
                if (c.compare(arr[j],arr[j+1]) > 0){
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
}
