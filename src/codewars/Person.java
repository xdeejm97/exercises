package codewars;

import java.util.Arrays;
import java.util.Map;

public class Person {
    public final String name;        // name of the staff member
    public final String department;  // department they work in

    public Person(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public static void main(String[] args) {

        boredom(new Person[]{
                new Person("kim", "accounts"),
                new Person("kay", "finance"),
                new Person("", ""),
                new Person("", "")
        });

    }

    public static String boredom(Person[] staff) {
        Map<String, Integer> map = Map.of(
                "accounts",1,
                "finance",2,
                "canteen",10,
                "regulation", 3,
                "trading", 6,
                "change", 6,
                "IS", 8,
                "retail" ,5,
                "cleaning", 4,
                "pissing about",25
        );
        int result = Arrays.stream(staff)
                .mapToInt(s -> map.get(s.department))
                .sum();

        return result <= 80 ? "kill me now" : result >= 100 ? "party time!!" : "i can handle this";
    }
}