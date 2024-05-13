package com.Method;

import java.util.Arrays;

public class test04 {
    public static void main(String[] args) {
        Integer[] arr = {1,5,8,-9,6};

        //copyOf数组元素的复制
        //解读
        //1、从arr数组中，拷贝 arr.length 个元素到 newarr数组中

        Integer[] newarr = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newarr));
        Integer[] newarr02 = Arrays.copyOf(arr,arr.length -3);
        System.out.println(Arrays.toString(newarr02));

        //如果拷贝的长度 > arr.length 就在新数组的后面 增加null
        Integer[] newArr01 = Arrays.copyOf(arr,arr.length + 2);
        System.out.println(Arrays.toString(newArr01));

        //如果拷贝长度 < 0 就抛出异常 NegativeArraySixeException
        Integer[] newArr02 = Arrays.copyOf(arr,0);
        System.out.println(Arrays.toString(newArr02));

        newArr02 = Arrays.copyOf(arr,-2);
        System.out.println(Arrays.toString(newArr02));
    }
}
