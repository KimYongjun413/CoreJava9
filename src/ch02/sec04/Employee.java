package ch02.sec04;

public class Employee {
    /*
    * statc으로 선언하면 해당 변수는 클래스당 하나만 존재한다.
    * 새 Employee 객체를 생성하면 공유된 lastId 변수가 즈가하고, 인스턴스 변수 id가 증가한 값으로 설정된다.
    * 따라서 모든 직원 객체가 유일한 id값을 얻는다.
    * ! 여러 스레드가 Employee 객체를 동시에 생성하면 이 코드는 제대로 작동하지 않는다.
    * */
    private static int lastId = 0;
    private int id;
    private String name;
    private double salary;
        
    public Employee() {
        lastId++;
        id = lastId;
    }
    
    public Employee(String name, double salary) {
        this();
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
    
    public int getId() {
        return id;
    }
}
