package ch04.sec01;

/*
* 항상 슈퍼클래스 구현이 인터페이스 구현보다 우선한다.
* '클래스 우선' 규칙은 자바7과 호환성을 보장한다. 따라서 인터페이스에 기본 메서드를 추가해도
* 기본 메서드가 생기기 전부터 작동하던 코드에는 영향을 주지 않는다.
* */
public class Student extends Person implements Named {
    private  int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() { return id; }
}
