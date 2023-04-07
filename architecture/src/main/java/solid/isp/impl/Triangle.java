package solid.isp.impl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Triangle implements ITriangle{
    @Override
    public void drawTriangle() {
        log.info("drawTriangle");
    }
}
