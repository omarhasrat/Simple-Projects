package model;

public class HourlyEmployee extends Employee{
    private int hour;

    public HourlyEmployee(int hour,String name,float salary){
        super(name,salary);
        this.hour = hour;
    }
    public int getHour(){
        return this.hour;
    }


    @Override
    public float calculateSalary() {
       float hourlySalary = getSalary()/getHour();
        return hourlySalary;

    }
}
