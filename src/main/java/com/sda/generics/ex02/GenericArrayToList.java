package com.sda.generics.ex02;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayToList<T> {
    public List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T t : array) {
            list.add(t);
        }

        return list;
    }
}
