package ch04.sec01;

public class InheritanceDemo {
    public static void main(String[] args) {
        Manager boss = new Manager("Kim", 400000);
        boss.setBonus(100000); // 서브클래스에 정의되어 있다.
        System.out.println(boss.getSalary());

        boss.raiseSalary(10); // 슈퍼클래스에서 상속받았다.
        System.out.println(boss.getSalary());

        Employee empl = boss; // 슈퍼클래스 변수에 할당해도 된다.
        empl.raiseSalary(10); // 여전히 슈퍼클래스의 메서드를 사용할 수 있다.
        System.out.println(empl.getSalary());

        boss.setBonus(3000);
        System.out.println(empl.getSalary());

        // instanceof 연산자와 캐스트로 슈퍼클래스 참조를 서브클래스로 변환 할 수 있다.
        if (empl instanceof Manager) {
            Manager mgr = (Manager) empl;
            mgr.setBonus(20000);
        }

    }
}
