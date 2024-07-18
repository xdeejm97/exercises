package codewars;

import java.util.List;
import java.util.stream.Collectors;

public class NewListInt {
    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));
    }

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out


        return list.stream()
                .filter(e -> e instanceof Integer)
                .collect(Collectors.toList());
    }
}
