package solid.isp.impl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rectangle implements IRectangle{
    @Override
    public void drawRectangle() {
        log.info("drawRectangle");
    }
}
