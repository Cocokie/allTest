package com.lix;


import org.apache.log4j.Appender;
import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.RollingFileAppender;
import org.apache.log4j.net.SMTPAppender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogT {
    public static void main(String[] args) {
        //logMail();
        Logger log = LoggerFactory.getLogger(LogT.class);
        for (int i = 0; i < 100; i++) {
            log.info("AAA");
            log.debug("BBB");
            log.error("CCC");
        }

    }

    private static void logMail() {
        //logFileTest();
        //Logger log = LoggerFactory.getLogger(LogT.class);
        org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(LogT.class);

        SMTPAppender rollfile = (SMTPAppender) logger.getRootLogger().getAppender("MAIL");
        rollfile.setSubject("877");
        rollfile.activateOptions();
        try {
            int k = 1 / 0;
        } catch (Exception e) {

            e.printStackTrace();
            e.getMessage();
            logger.error("xx"+e.getMessage()+ e.getLocalizedMessage());
        }
    }

    private static void logFileTest() {
        Logger log = LoggerFactory.getLogger(LogT.class);
        String name1 = log.getName();
        org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(LogT.class);
        String name = logger.getName();
        logger.trace("sd");
        logger.info("sd");
        logger.debug("sd");
        logger.error("sdssssssssssssss");
        RollingFileAppender rollfile = (RollingFileAppender) org.apache.log4j.Logger.getRootLogger().getAppender("rollfile");
        rollfile.setFile("log4jT/logs/log222.log");

        for (int i = 0; i < 100; i++) {
            log.info("AAA");
            log.debug("BBB");
            log.error("CCC");
        }
    }
}
