package proxy.impl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IvoryTower implements WizardTower {

    public void enter(Wizard wizard) {
        log.info("{} enters the tower.", wizard);
    }

}