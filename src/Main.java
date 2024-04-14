import model.CommisisedEmployee;
import model.Employee;
import model.HourlyEmployee;
import model.SalariedEmployee;

public class Main {
    public static void main(String[] args) {
        Employee hourlyEmployee = new HourlyEmployee(1,"Akif",1500);
        printSalaryInfo(hourlyEmployee);
        Employee salariedEmployee = new SalariedEmployee("Vasif",1200);
        printSalaryInfo(salariedEmployee);
        Employee commissiedEmployee = new CommisisedEmployee("Omar",2000,2);
        printSalaryInfo(commissiedEmployee);

    }
    public static void printSalaryInfo(Employee employee){
        System.out.println(employee.getName()+"--"+employee.calculateSalary());

    }
}