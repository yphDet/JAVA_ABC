package com.detail;

import java.util.Scanner;

public class tryExercise03 {
//    public static int method(String str){
//        return Integer.parseInt(str);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        try {
//            method(scanner.next());
//        } catch (Exception e) {
//            System.out.println("输入信息错误请重写输入（整数）：");
//            method(scanner.next());
//        }
//        System.out.println("恭喜输入正确");
//    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        while(true){
            try {  int n = Integer.parseInt(scanner.next());
                break;
        }catch (NumberFormatException e) {
                System.out.println("输入错误请重新输入");
            }
            System.out.println("OK");
    }
}


}
