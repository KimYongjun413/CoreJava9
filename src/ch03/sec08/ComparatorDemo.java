package ch03.sec08;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        Person[] people = {
                new Person("George", "Washington"),
                new Person("John", "Adams"),
                new Person("Thomas", "Jefferson"),
                new Person("James", "Madison"),
                new Person("James", "Monroe"),
                new Person("John", "Quincy", "Adams"),
                new Person("Andrew", "Jackson"),
                new Person("Martin", "van Buren"),
                new Person("William", "Henry", "Harrison"),
                new Person("John", "Tyler"),
                new Person("James", "Knox", "Polk"),
                new Person("Zachary", "Taylor"),
                new Person("Millard", "Fillmore"),
                new Person("Franklin", "Pierce"),
                new Person("James", "Buchanan"),
                new Person("Abraham", "Lincoln"),
                new Person("Andrew", "Johnson"),
                new Person("Ulysses", "S.", "Grant"),
                new Person("Rutherford", "Birchard", "Hayes"),
                new Person("James", "Abram", "Garfield"),
                new Person("Grover", "Cleveland"),
                new Person("Benjamin", "Harrison"),
                new Person("Grover", "Cleveland"),
                new Person("William", "McKinley"),
                new Person("Theodore", "Roosevelt"),
                new Person("William", "Howard", "Taft"),
                new Person("Woodrow", "Wilson"),
                new Person("Warren", "Gamaliel", "Harding"),
                new Person("Calvin", "Coolidge"),
                new Person("Herbert", "Hoover"),
                new Person("Franklin", "Delano", "Roosevelt"),
                new Person("Harry", "S.", "Truman"),
                new Person("Dwight", "David", "Eisenhower"),
                new Person("John", "Fitzgerald", "Kennedy"),
                new Person("Lyndon", "Baines", "Johnson"),
                new Person("Richard", "Mulhouse", "Nixon"),
                new Person("Gerald", "Ford"),
                new Person("James", "Earl", "Carter"),
                new Person("Ronald", "Reagan"),
                new Person("George", "Herbert Walker", "Bush"),
                new Person("William", "Jefferson", "Clinton"),
                new Person("George", "Walker", "Bush"),
                new Person("Barack", "Hussein", "Obama")
        };
                
        Arrays.sort(people, Comparator.comparing(Person::getName));
        System.out.println(Arrays.toString(people));

        // Person 객체의 배열을 성으로 정렬할 수 있다.
        // 비교 대상이 같으면 thenComparing 메서드로 다른 비교자를 연결해 추가로 비교할 수 있다.
        Arrays.sort(people, Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));
        System.out.println(Arrays.toString(people));

        // 이름의 길이 순으로 사람을 정렬한다.
        Arrays.sort(people, Comparator.comparing(Person::getName, (s, t) -> s.length() - t.length()));
        System.out.println(Arrays.toString(people));

        // 이름의 길이 순으로 사람을 정렬한다.
        Arrays.sort(people, Comparator.comparingInt(p -> p.getName().length()));
        System.out.println(Arrays.toString(people));

        // null일 가능성이 있는 중간 이름으로 정렬
        // null 값을 정상 값보다 작은 값(nullsFirst)과 큰 값(nullsLast)으로 취급하다록 비교자를 수정한다.
        Arrays.sort(people, comparing(Person::getMiddleName, nullsFirst(naturalOrder())));
        System.out.println(Arrays.toString(people));

    }
}
