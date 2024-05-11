package com.detail;

public class throwException {

}
class ReturnException {
    static void methodA() {
        try{
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        }finally{
            System.out.println("用A方法的finally");
        }
    }

    static void methodB() {
        try{
            System.out.println("进入方法B");
            return;
        }finally {
            System.out.println("调用B方法的finally");
        }

    }

    public static void main(String[] args) {
        try {
            ReturnException.methodA();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        ReturnException.methodB();
    }
}

