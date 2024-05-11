package com.TankGame;

import javax.swing.*;
import java.awt.*;

public class Tankgame extends JFrame {
    public static void main(String[] args) {
        new Tankgame();
    }
    Print print = null;
    public Tankgame(){
        print = new Print();
        this.add(print);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }



}
