package com.Method;

import java.util.Arrays;

public class test03 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,90,123,567};
        //binarySearch 通过二分搜索法进行查找，要求必须排好
        int index = Arrays.binarySearch(arr,567);
        System.out.println(index);

//        Integer[] array = {2,7,-6};
//        //要求数组是有序的，如果该数组是无序的，不能使用binarySearch
//        int index02 = Arrays.binarySearch(array,-6);

        index = Arrays.binarySearch(arr,589);
        //如果数组中不存在该元素，就返回 return -(low + 1);//key not found.
        //low表示该元素应该在数组中的索引位置；
        System.out.println(index);
    }
}
