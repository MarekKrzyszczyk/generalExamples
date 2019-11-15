package com.sda.datastructures.ex03;

import com.sda.streams.ex10.Person;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> pracownik = new LinkedList<>();

        pracownik.add(new Person("Adam", "Gibała", 5400));
        pracownik.add(new Person("Marcin", "Frąckowiak", 3200));
        pracownik.add(new Person("Marta", "Adamowicz", 6300));
        pracownik.add(new Person("Szymon", "Stasiak", 2800));
        pracownik.add(new Person("Edyta", "Wazon", 9800));

        System.out.println(pracownik.getFirst());
        System.out.println(pracownik.getLast());
    }

}
