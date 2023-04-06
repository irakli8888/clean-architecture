package solid.srp.impl;

class EmployeeFacade {
    Cook cook = new Cook();
    Janitor janitor = new Janitor();

    void cook() {
        cook.cook();
    }

    void cleanFood() {
        janitor.cleanFood();
    }
}
