package com.Exercise;

public class Homework07 {
    public static void main(String[] args) {
        Car car01 = new Car(45);
        Car.Air air01 = car01.new Air();
        air01.flow();

        Car car = new Car(-3);
        Car.Air air = car.new Air();
        air.flow();

        Car car1 = new Car(38);
        Car.Air air1 = car.new Air();
        air1.flow();
    }
}
class Car{
    private double temperature;
    class Air{
        public void flow(){
            if(temperature > 40){
                System.out.println("冷气");
            }
            else if(temperature < 0){
                System.out.println("暖气");
            }
            else{
                System.out.println("关闭");
            }
        }
    }

    public Car(double temperature) {
        this.temperature = temperature;
    }
}
