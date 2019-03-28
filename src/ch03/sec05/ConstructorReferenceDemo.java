package ch03.sec05;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Paul");
        names.add("Mary");

        Stream<Object> stream = names.stream().map(Employee::new);
        //Stream.toArray 같은 메서드는 요소 타입 배열이 아니라 Object 배열을 반환한다.
        Object[] tempEmployees = stream.toArray();
        //Employee[] tempEmployees2 = stream.toArray();//컴파일 에러가 발생한다.

        //다음과 같이 생성자 참조를 받아 Employee 배열을 반환할 수 있다.
        Employee[] employees = names.stream().map(Employee::new).toArray(Employee[]::new);
        for(Employee e : employees) System.out.println(e.getName());
    }
}
