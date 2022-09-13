package com.hemendra.module1;

public class Employee {

    static
    {
        System.out.println("this is static block");
    }

    {
        System.out.println("non static block updated");
    }
    private String name;
    private String sal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public Employee(String name, String sal) {
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal='" + sal + '\'' +
                '}';
    }
}
