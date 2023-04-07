package solid.dip.impl;

public interface MailSender {
    void sendConfirmationEmail(Order order);
}