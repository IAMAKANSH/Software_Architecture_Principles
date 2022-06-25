package mvcdesignpattern;

public class EmployeeController {

    private EmployeeDashboardView view;
    private Employee employeeModel;

    public EmployeeController(EmployeeDashboardView view, Employee employeeModel) {
        this.view = view;
        this.employeeModel = employeeModel;
    }

    public void setEmployee(String name,String lastName)
    {
        employeeModel.setFirstName(name);
        employeeModel.setLastName(lastName);
    }

    public String setEmployeeName()
    {
        return employeeModel.getFirstName()+ " "+ employeeModel.getLastName();
    }

    public void setSSN(String ssn)
    {
        employeeModel.setSsNumber(ssn);
    }
    public String getSSN()
    {
        return employeeModel.getSsNumber();
    }

    public void updateDashboardView()
    {
        view.printEmployeeInformation(employeeModel);
    }
}
