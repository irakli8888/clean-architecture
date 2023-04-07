package solid.isp.impl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Circle implements ICircle{
    @Override
    public void drawCircle() {
        log.info("drawCircle");
    }
}
