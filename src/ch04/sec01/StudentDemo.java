package ch04.sec01;

public class StudentDemo {
    public static void main(String[] args) {
        //Person p = new Person("Kim"); // 오류 : 추상 클래스의 인스턴스는 생성할 수 없다.
        Person p = new Student("Kim", 8688); // 구체적인 서브클래스이므로 할당해도 된다.

    }
}
