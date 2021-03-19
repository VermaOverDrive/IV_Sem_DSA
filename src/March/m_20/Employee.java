package March.m_20;

import java.util.List;
import java.util.Objects;

public class Employee {
    private final String employeeID;
    private final String emloyeeName;
    private double salary;
    private List<String> subjects;

    public Employee(String employeeID, String emloyeeName, double salary, List<String> subjects) {
        this.employeeID = employeeID;
        this.emloyeeName = emloyeeName;
        this.salary = salary;
        this.subjects = subjects;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(employeeID, employee.employeeID) && Objects.equals(emloyeeName, employee.emloyeeName) && Objects.equals(subjects, employee.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID, emloyeeName, salary, subjects);
    }

    @Override
    public String toString() {
        return "Teacher.Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", emloyeeName='" + emloyeeName + '\'' +
                ", salary=" + salary +
                ", subjects=" + subjects +
                '}';
    }
}
