package ch04.sec02;

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

    public final String getName() { return name;}
    public double getSalary() { return salary;}

    public String toString() {
        // "Employee"라는 문자열을 직접 써넣는 대신 getClass().getName()을 호출하면 서브클래스에서도
        // toString메서드가 올바르게 작동한다.
        return getClass().getName()  + "name=" + name
                + ".salary=" + salary + "]";
    }

}
