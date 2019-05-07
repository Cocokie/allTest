package com.lix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBackT {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(LogBackT.class);
        for (int i = 0; i < 10; i++) {
            log.info("AAA");
            log.debug("BBB");
            log.error("CCC");
        }
    }
}
