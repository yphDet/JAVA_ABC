package com.detail;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericExercise {
    public static void main(String[] args) {
        /**练习
         * 1、建立 3个学生对象
         * 2、放入到HashSet中学生对象使用。
         * 3、放入到HashMap中，要求key是String name；Value是 学生对象
         * 4、使用两种方式遍历
         */

        HashMap<String, Student> stringStudentHashMap = new HashMap<>();
        stringStudentHashMap.put("tom",new Student("tom"));
        stringStudentHashMap.put("jack",new Student("jack"));
        stringStudentHashMap.put("smith",new Student("smith"));

        Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();
        for (Object object : entries) {
            System.out.println(object);
        }

        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next);
        }

    }
}
class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

