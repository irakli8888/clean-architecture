package solid.srp.impl;

public class App {
    public static void main(String[] args) {

        EmployeeFacade empolyeeFacade = new EmployeeFacade();
        empolyeeFacade.cleanFood();
        empolyeeFacade.cook();
    }
}
