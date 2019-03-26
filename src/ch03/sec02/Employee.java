package ch03.sec02;

public class Employee implements Person, Identified {
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
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }

    //한 인터페이스에는 기본 메서드가 있고, 다른 한 인터페이스는
    //이 메서드와 이름,매개변수 타입이 같은 메서드(기본이든 아니든)가 있다면
    //반드시 충돌을 해결해야 한다.
    public int getId() { return Identified.super.getId(); }
}
