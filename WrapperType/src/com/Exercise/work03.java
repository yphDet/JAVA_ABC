package com.Exercise;

public class work03 {
    public static void main(String[] args) {
        Integer i = new Integer(127);
        Integer i1 = new Integer(127);
        System.out.println(i == i1);//f

        System.out.println("============");
        Integer i2 = new Integer(128);
        Integer i3 = new Integer(128);
        System.out.println(i2 == i3);//f

        System.out.println("===========");
        Integer i4 = 127;
        Integer i5 = 127;
        System.out.println(i4 == i5);//t

        System.out.println("============");
        Integer i6 = 128;
        Integer i7 = 128;
        System.out.println(i6 == i7);//f

        System.out.println("===============");
        Integer i8 = 127;
        Integer i9 = new Integer(127);
        System.out.println(i8 == i9);//f

        System.out.println("===========");
        Integer i11 = 127;
        int i12 = 127;
        System.out.println(i11 == i12);//t
//只有有基本数据类型，判断的是————》值是否相同

        System.out.println("============");
        Integer i13 = 128;
        int i14 = 128;
        System.out.println(i13 == i14);//t
    }
}
