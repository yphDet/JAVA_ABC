//掌握在idea中任何给main方法传递参数？Edit Conflgurations

package com.Exercise;


public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("索引为" + i + "时args[i]" + args[i]);
        }
    }
}
