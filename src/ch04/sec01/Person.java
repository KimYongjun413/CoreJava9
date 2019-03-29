package ch04.sec01;

// 추상 클래스는 인터페이스와 달리 인스턴스 변수와 생성자를 포함할 수 있다.
public abstract class Person {
    private String name;

    public Person(String name) { this.name = name; }
    public final String getName() { return name; }

    public abstract int getId();

}
