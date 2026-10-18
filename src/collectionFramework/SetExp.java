package collectionFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExp {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("A");
        names.add("Z");
        names.add("1");
        names.add("C");
        names.add("A");
        names.add("B");

        System.out.println(names);


        Set<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(20);
        numbers.add(20);
        numbers.add(20);

        System.out.println(numbers);

        Set<String> names2 = new TreeSet<>();
        names2.add("A");
        names2.add("Z");
        names2.add("1");
        names2.add("C");
        names2.add("A");
        names2.add("B");

        System.out.println(names2);

        String ad = "Aditya";
        System.out.println(ad.hashCode());

    }

}
