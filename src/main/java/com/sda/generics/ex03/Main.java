package com.sda.generics.ex03;

public class Main {
    public static void main(String[] args) {
        GenericAddGetList genericAddGetList = new GenericAddGetList();
        genericAddGetList.addToList(5);
        genericAddGetList.addToList(6);
        genericAddGetList.addToList(7);
        genericAddGetList.addToList(8);

        System.out.println(genericAddGetList.getFromList(3));
    }
}
