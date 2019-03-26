package ch03.sec03;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;
        
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public Employee(double salary) {
        this.name = "";
        this.salary = salary;
    }        
    
    public Employee(String name) {
        // salary는 자동으로 0으로 설정된다.
        this.name = name;
    } 
    
    public Employee() {
        this("", 0);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;    
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }

    //compare 메서드가 other.salary에 접근하는 것은 규칙에 들어맞는다.
    //자바의 메서드는 자신이 속한 클래스의 모든 객체에 있는 비공개 기능에 접근할 수 있다.
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
