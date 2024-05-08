package com.Exercise;
//重点掌握：枚举对象在switch语句中的使用。
public class Homework03 {
    public static void main(String[] args) {
        Color[] colors = Color.values();
        for(Color c: colors){
            System.out.println(c);
            switch (c){
                case RED:
                    c.show();
                    break;
                case BLUE:
                    c.show();
                    break;
                default:
                    System.out.println("没有匹配到");
            }
        }
    }
}
interface IF{
    void show();
}
enum Color implements IF{
    RED(225,0,0),BLUE(0,0,225),BLACK(0,0,0),
    YELLOW(225,225,0),GREEN(0,225,0);
    private int redValue;
    private int blueValue;
    private int greenValue;

    Color(int redValue, int blueValue, int greenValue) {
        this.redValue = redValue;
        this.blueValue = blueValue;
        this.greenValue = greenValue;
    }

    public int getRedValue() {
        return redValue;
    }

    public int getBlueValue() {
        return blueValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    @Override
    public void show() {
        System.out.println("redValue" + redValue + "greenValue" + greenValue + "blueValue" + blueValue);
    }

    @Override
    public String toString() {
        return "Color{" +
                "redValue=" + redValue +
                ", blueValue=" + blueValue +
                ", greenValue=" + greenValue +
                '}';
    }
}
