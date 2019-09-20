
package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void createFirstLog(){
        Logger.getInstance().log("testowy log numer 1");
    }

    @Test
    public void testLog() {
        Logger.getInstance().log("testowy log numer 2");
        Assert.assertEquals("testowy log numer 2", Logger.getInstance().getLastLog());
    }

    @Test
    public void testGetLastLog() {
        Assert.assertEquals("testowy log numer 2", Logger.getInstance().getLastLog());
    }
}
