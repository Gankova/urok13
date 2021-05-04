package com.company;

public class Printer {


    //принимает на вход массив объектов любобого типа и выводит их на экран
    public <T extends Animal>void printArray(T [] mas ) {
        for (T e: mas) {

            System.out.println(e);
        }

    }
}
