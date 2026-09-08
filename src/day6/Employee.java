package day6;

public class Employee extends Person {
    private int salary;
    private int id ;
    private String department;
    public Employee(){
        super("Ahmed");
        System.out.println("i am Employee defult constractor");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }
}
