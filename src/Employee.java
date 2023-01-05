public class Employee {
    public String name;
    public int department;
    public int salary;

    public int id;

    public Employee (String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }
    public  String getName () {
        return name;
    }
    public int getDepartment () {
        return department;
    }
    public void setDepartment () {
        this.department = department;
    }
    public int getSalary () {
        return salary;
    }
    public void setSalary () {
        this.salary = salary;
    }
    public int getId () {
        return id;
    }
    public String toString() {
        return "ФИО: " + name + ", отдел - " + department + ", зарплата - " + salary;
    }

}
