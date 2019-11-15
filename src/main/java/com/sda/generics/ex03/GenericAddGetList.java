package com.sda.generics.ex03;

import java.util.ArrayList;
import java.util.List;

public class GenericAddGetList <T> {
   List<T> list = new ArrayList<>();

    public void addToList(T element){
        this.list.add(element);
    }

    public T getFromList(int index){
     return this.list.get(index);
    }
}
