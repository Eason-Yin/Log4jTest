package com.eason;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class log4jdemon1 {
    private static final Logger logger = LoggerFactory.getLogger(log4jdemon1.class);

    public static void main(String[] args) {
        logger.debug(" asdadw debug message");
        logger.info(" awdawd info message");
        logger.error(" ergerg error message");
    }
}
