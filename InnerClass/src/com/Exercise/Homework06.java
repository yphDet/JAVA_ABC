package com.Exercise;

public class Homework06 {
    public static void main(String[] args) {
        Person person = new Person("唐僧", null);
        person.common();
        person.passriver();
        person.passriver();
        person.common();
        person.common();
    }
}
interface Vehicles{
    void work();
}
class Horse implements Vehicles{

    @Override
    public void work() {
        System.out.println("horse");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("boat");
    }
}
class Factory{
    //一路通过都用一匹马
    private static Horse horse = new Horse();//饿汉式；

    private Factory(){};//防止外部new

    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
}
class Person{
    private String name;
    private Vehicles vehicles;//需要理解//对象多态。

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void common(){
        if(!(vehicles instanceof Horse)){//这里取反--nice
            vehicles = Factory.getHorse();
        }
        vehicles.work();
    }
    public void passriver(){
        if(!(vehicles instanceof Boat)){//这里的vehicles体现了对象的多态；
            vehicles = Factory.getBoat();
        }
        vehicles.work();
    }
}