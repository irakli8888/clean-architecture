package solid.srp.impl;

/**
 * Класс повара
 */
class Cook implements Employee {

    @Override
    public int gerSalary() {
        return 15;
    }

    void cook() {
        System.out.println("Cook.");
    }
}