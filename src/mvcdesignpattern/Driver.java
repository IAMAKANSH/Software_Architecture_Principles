package mvcdesignpattern;

public class Driver {

    public static void main(String[] args) {

        EmployeeController controller=new EmployeeController(new EmployeeDashboardView(),
                new Employee("Akansh","Srivastava","1055986",71000.00));

        controller.updateDashboardView();
    }
}
