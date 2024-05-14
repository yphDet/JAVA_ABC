package com.Homework;

import java.util.*;

@SuppressWarnings({"all"})
public class work01 {
    public static void main(String[] args) {
        //【Junit单元测试类的使用】
    }
    /*
    1、一个类有很多功能代码需要测试，为了测试，就需要写入到main方法中
    2、如果有多个功能代码测试，就需要注销，切换很麻烦
    3、如果可以直接运行一个方法，就方便很多，并且可以给出相关信息。
     */
    public void tset(){
        DAO<User> userDAO = new DAO<>();
        userDAO.save("01",new User(1,10,"jack"));
        userDAO.save("02",new User(2,20,"tom"));
        userDAO.save("03",new User(3,30,"smith"));

        System.out.println(userDAO.list());


    }
}
class DAO<T>{
    private Map<String,T> map = new HashMap<>();

    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get(String id){
            return map.get(id);
    }
    public void update(String id,T entity){
        map.put(id,entity);
    }
    public List<T> list(){
        ArrayList<T> ts = new ArrayList<>();
        Set<String> strings = map.keySet();
        for (String key : strings) {
            ts.add(get(key));//这里的get方法是本类成员中的     get方法
        }
        return ts;
    }
    public void delete(String id){
        map.remove(id);
    }

}
class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
