package ch04.sec01;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    // 메서드를 final로 선언하면 어느 서브클래스도 해당 메서드를 오버라이드할 수 없다.
    public final String getName() { return name; }

    public double getSalary() { return salary; }

}
