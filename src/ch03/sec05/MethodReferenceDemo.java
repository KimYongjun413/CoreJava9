package ch03.sec05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        String[] strings = { "Mary", "had", "a", "little", "lamb" };

        //람다 표현식
        Arrays.sort(strings, (x,y) -> x.compareToIgnoreCase(y));
        System.out.println(Arrays.toString(strings));

        //메서드 참조
        Arrays.sort(strings, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strings));

        System.out.println();

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));

        //람다 표현식
        list.removeIf(x -> Objects.isNull(x));
        //메서드 참조
        list.removeIf(Objects::isNull);

        //람다 표현식
        list.forEach(x -> System.out.println(x));
        System.out.println();
        //메서드 참조
        list.forEach(System.out::println);
    }
}
