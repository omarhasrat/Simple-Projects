package model;

public class CommisisedEmployee extends Employee{
    private int commisson;
    public CommisisedEmployee(String name, float salary,int commission){
        super(name,salary);
        this.commisson = commission;
    }
    public int getCommisson(){
        return this.commisson;
    }
    @Override
    public float calculateSalary() {
        float commissiedSalary = getSalary()+(getSalary()*this.commisson)/100;
        return commissiedSalary;

    }
}
