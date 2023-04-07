package solid.dip.impl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConfirmationEmailSender implements MailSender {

    @Override
    public void sendConfirmationEmail(Order order) {
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();
        log.info("send message to {}", email);
    }

}
