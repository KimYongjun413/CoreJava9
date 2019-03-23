package ch02.sec03;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee james = new Employee("James Bond", 500000);
            // Employee(String, double) 생성자를 호출한다.
        Employee anonymous = new Employee("", 40000);
            // Employee(double) 생성자를 호출한다.
        Employee unpaid = new Employee("Igor Intern");
        Employee e = new Employee();
            // 인수 없는 생성자를 호출한다.

        james.raiseSalary(10);
        System.out.println("James Bond's ID is " + james.getId());
        System.out.println("James Bond's Salary is " + james.getSalary());

        System.out.println(anonymous.getName() +"'s ID is " + anonymous.getId());
        System.out.println(anonymous.getName() +"'s Salary is " + anonymous.getSalary());

        System.out.println(unpaid.getName() +"'s ID is " + unpaid.getId());
        System.out.println(unpaid.getName() +"'s Salary is " + unpaid.getSalary());

        System.out.println(e.getName() +"'s ID is " + e.getId());
        System.out.println(e.getName() +"'s Salary is " + e.getSalary());

    }
}
