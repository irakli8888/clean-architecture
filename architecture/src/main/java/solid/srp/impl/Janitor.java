package solid.srp.impl;

/**
 * Класс уброщика
 */
public class Janitor implements Employee {
    @Override
    public int gerSalary() {
        return 10;
    }

    void cleanFood() {
        System.out.println("Clean food.");
    }
}
