package solid.srp.impl;

public class App {
    public static void main(String[] args) {

        EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.cleanFood();
        employeeFacade.cook();
    }
}
