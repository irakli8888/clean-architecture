package solid.dip.impl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MySQLOrderRepository implements OrderRepository {

    @Override
    public boolean save(Order order) {
        log.info("save info about {} to database", order.customerEmail);
        return true;
    }
}