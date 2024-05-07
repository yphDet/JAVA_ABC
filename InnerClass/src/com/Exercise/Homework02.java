package com.Exercise;

public class Homework02 {
}
class Frock{
    private static int currentNum = 10000;
    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock(){
        serialNumber = getNextNum();
    }

    public static int getNextNum(){//静态的只能调用与静态相关的；
        currentNum += 100;
        return currentNum;
    }

}
class TestFrock{
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
    }
}
