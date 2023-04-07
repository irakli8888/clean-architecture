package solid.dip.impl;

public class App {

    public static void main(String[] args) {
        new OrderProcessor(new ConfirmationEmailSender(), new MySQLOrderRepository()).process(new Order());
    }
}
