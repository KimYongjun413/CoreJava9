package ch03.sec08;

import java.util.Arrays;
import java.util.Comparator;

public class HigherOrderDemo {
    public static Comparator<String> compareInDirection(int direction) {
        return (x,y) -> direction * x.compareTo(y);
    }

    public static Comparator<String> reverse(Comparator<String> comp) {
        return (x,y) -> -comp.compare(x,y);
    }


    public static void main(String[] args) {
        String[] words = {"Kim", "had", "a", "little", "lamb"};
        // 대소문자를 구분하는 내림차순 비교자를 돌려 준다.
        Arrays.sort(words, compareInDirection(-1));
        System.out.println(Arrays.toString(words));
        // 대소문자를 구별하지 않는 내림차순 비교자를 돌려 준다.
        Arrays.sort(words, reverse(String::compareToIgnoreCase));
        System.out.println(Arrays.toString(words));
    }
}
