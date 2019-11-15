package com.sda.generics.ex01;


public class GenericTables<T> {

    public void showArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

}
