package com.Exercise;

import java.util.Arrays;
import java.util.Comparator;

public class work {
    public static void main(String[] args) {
        Book[] books = new Book[4];//数据的创建
        books[0] = new Book("红楼梦",100);//对象的创建
        books[1] = new Book("金瓶梅",90);
        books[2] = new Book("青年文摘~",5);
        books[3] = new Book("java从入门到大厂",300);

        Book.Buffer(books, new Comparator() {
           @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                double t = b2.price - b1.price;
                if(t > 0){
                    return 1;
                }else if(t <  0){
                    return -1;
                }else{
                    return 0;
                }
            }
        });

        System.out.println(Arrays.toString(books));
    }
}
class Book{
    public double price;
    public String name;

    public Book(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public static void Buffer(Book[] books, Comparator c){
        for (int i = 0; i < books.length -1; i++) {
            Book book = null;
            for(int j = 0;j < books.length - 1 - i;j++){
                if(c.compare(books[j],books[j + 1]) > 0){
                    book = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = book;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
