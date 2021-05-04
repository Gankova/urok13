package com.company;

public class Main {

    public static void main(String[] args) {
        // если тип дженерика явно не указан, то по умолчанию будет указываться класс Object

        User u = new User();

        User<Integer, Float> u2 =new User<>();
        u2.id = 12;
        u2.setId(122);// на вход принимает тип Интежер
        u2.salary =  123.5f;


        User<String,Integer> u3 =new User<>();
        u3.id = "id 121212";
        u3.salary = 123;

        u2.<String>test("hello",1212);

        Cat [] cats =new Cat[]{
                new Cat(),
                new Cat(),
        };

        Dog[] dogs = new Dog[]{
                new Dog(),
                new Dog(),
                new Dog(),
        };
        Printer p = new Printer();
        p.printArray(cats);
        p.printArray(dogs);

    }
}
