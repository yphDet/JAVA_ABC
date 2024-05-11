package com.Exercise;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {//回顾了main方法的知识
        //hsp


        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println("计算结果为" + calculate(n1,n2));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("参数格式不正确");;
        }catch (ArithmeticException e){
            System.out.println("被除数为0，错误");
        }


    }
    static int calculate(int n1,int n2){
        return n1/n2;
    }
}

//my
class EcmDet{
    public static int cal(int n1,int n2){
        try {
            return n1/n2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            EcmDet.cal(Integer.parseInt(scanner.next()),Integer.parseInt(scanner.next()));
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}