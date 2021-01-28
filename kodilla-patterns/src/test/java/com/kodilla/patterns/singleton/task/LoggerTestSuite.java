package com.kodilla.patterns.singleton.task;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void logg() {
        logger = Logger.INSTANCE;
        logger.log("log1");
    }

    @Test
    void testGetLastLog() {
        //When
        String lastLog = logger.getLastLog();
        //Then
        assertEquals("log1", lastLog);
    }
}
