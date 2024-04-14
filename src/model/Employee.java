package model;

public abstract class Employee {
    private String name;
    private float salary;

    public abstract float calculateSalary(); // covariant type

    public Employee(String name,float salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }
    public float getSalary(){
        return this.salary;
    }

}

