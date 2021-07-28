package com.kary.javatests;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeatTestOnce() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeatTestMultipleTimes() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeatTestZeroTimes() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

}