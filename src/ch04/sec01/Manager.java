package ch04.sec01;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
        bonus = 0;
    }

    public void setBonus(double bonus) { this.bonus = bonus; }

    // 직원의 총 급여를 보고하는 메서드.
    // Manager 클래스에서 getSalary 메서드를 오버라이드 해서
    // 이 메서드가 기본 급여와 상여금의 합을 반환하게 함.
    // + 슈퍼클래스 메서드를 오버라이드하려는 메서드에 @Override 애너테이션을 붙이면
    // + 매개변수 타입이 변경된 메서드를 정의하는 것을 막을 수 있다.(메서드를 오버라이드할 때는 매개변수 타입이 정확하게 일치해야 한다.)
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}
