package com.TankGame;

import javax.swing.*;
import java.awt.*;

public class Print extends JPanel {
    //定义tank
    Tank tank = null;

    public Print(){
        tank = new Tank(10,10);//1.初始化tank    2.tank类中的构造器表示的是tank的位置.
    }

    @Override
    public void print(Graphics g) {
        super.print(g);

        //背景
        g.drawRect(0,0,1000,750);

        //设计怎么样的tank
        drawTank(tank.getX(), tank.getY(),g,0,0);
    }

    //颜色,类型;
    public void drawTank(int x,int y,Graphics g,int direct,int type){
        //由颜色区分 不同人操作的坦克
        switch (type){
            case 0:
                g.setColor(Color.BLUE);
                break;
            case 1:
                g.setColor(Color.red);
                break;
            default:
                System.out.println("没有匹配的tank类型");
        }

        //坦克的摆放方式
        switch (direct){
            case 0:
                g.fillRect(x,y,10,60);
                g.fillRect(x+10,y+10,20,40);
                g.fillRect(x+30,y,10,60);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y,x+20,y+30);
                break;
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("没有这种摆放方式");
        }
    }
}
