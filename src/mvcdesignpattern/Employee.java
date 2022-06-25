package mvcdesignpattern;

public class Employee {

    private String firstName;
    private String lastName;
    private String ssNumber;
    private Double salary;
    public Employee() {
    }

    public Employee(String firstName, String lastName, String ssNumber, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssNumber = ssNumber;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsNumber() {
        return ssNumber;
    }

    public void setSsNumber(String ssNumber) {
        this.ssNumber = ssNumber;
    }
}
