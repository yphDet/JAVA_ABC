package com.duct;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame {
    public static void main(String[] args) {
        new BallMove();
    }

    MyPrint mp;

    public BallMove(){
        mp = new MyPrint();
        this.add(mp);
        this.setSize(1000,750);

        this.addKeyListener(mp);//接口的多态--MyPrint实现了KeyListener接口

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(false);
    }
}


//KeyListener 是监听器,可以监听键盘事件
class MyPrint extends Panel implements KeyListener {
    Ball ball = null;

    int x = 10;
    int y = 10;

    public MyPrint(){
        ball = new Ball(x,y);
    }

    @Override
    public void print(Graphics g) {
        super.print(g);
        g.fillOval(ball.getX(), ball.getY(),10,10);
    }



    //下面是对接口的方法重写
    @Override
    //由字符输入是,该方法就会触发
    public void keyTyped(KeyEvent e) {

    }

    @Override
    //当某个键按下,该方法会触发
    public void keyPressed(KeyEvent e) {
        /*
        根据用户按下的不同键,来处理移动操作
        在java中,会给每一个键,分配某个值(int)
         */
        switch (e.getKeyCode()){
            case KeyEvent.VK_DOWN:
                y++;
                break;
            case KeyEvent.VK_UP:
                y--;
                break;
            case KeyEvent.VK_LEFT:
                x--;
                break;
            case KeyEvent.VK_RIGHT:
                x++;
                break;
        }

        //让面板重绘(更新绘画)--目的是为了什么呢?->会调用print方法
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
class Ball{
    private int x;
    private int y;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}