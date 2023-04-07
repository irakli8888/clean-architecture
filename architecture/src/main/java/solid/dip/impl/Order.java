package solid.dip.impl;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    String customerName;
    String customerEmail;

    boolean isValid() {
        return true;
    }
}
