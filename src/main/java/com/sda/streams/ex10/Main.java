package com.sda.streams.ex10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Person> pracownik = new ArrayList<>();
        pracownik.add(new Person("Adam", "Gibała", 5400));
        pracownik.add(new Person("Marcin", "Frąckowiak", 3200));
        pracownik.add(new Person("Marta", "Adamowicz", 6300));
        pracownik.add(new Person("Szymon", "Stasiak", 2800));
        pracownik.add(new Person("Edyta", "Wazon", 9800));

       OptionalDouble optionalDouble = pracownik.stream().mapToDouble(p -> p.getSalary()).average();

        Double average = 0.0;
       if(optionalDouble.isPresent()){
           average = optionalDouble.getAsDouble();
           System.out.println(average);
       }
       else {
           System.out.println("blad");
       }

       pracownik.stream().filter(person -> person.getSalary()>pracownik.stream().mapToDouble(p -> p.getSalary()).average().getAsDouble()).forEach(person -> System.out.println(person));
    }

}
