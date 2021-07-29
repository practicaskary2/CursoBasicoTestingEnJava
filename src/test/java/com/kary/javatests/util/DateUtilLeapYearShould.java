package com.kary.javatests.util;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DateUtilLeapYearShould {

    /*
    All years divisible by 400 ARE Leap years (1600, 2000, 2400)
    All years divisible by 100 but not by 400 are NOT leap years (1700, 1800, 1900),
    All years divisible by 4 but not by 100 ARE leap years (1996, 2004, 2008),
    All years not divisible by 4 are NOT Leap years (2017, 2018, 2019)
    */

    @Test
    public void returnTrueWhenIsDivisibleBy400(){
        assertThat(DateUtil.isLeap(1600), is(true));
        assertThat(DateUtil.isLeap(2000), is(true));
        assertThat(DateUtil.isLeap(2400), is(true));
    }

    @Test
    public void returnFalseWhenYearIsDivisibleBy100ButNotBy400(){
        assertThat(DateUtil.isLeap(1700), is(false));
        assertThat(DateUtil.isLeap(1800), is(false));
        assertThat(DateUtil.isLeap(1900), is(false));
    }

    @Test
    public void returnTrueWhenIsDivisibleBy4ButNotBy100(){
        assertThat(DateUtil.isLeap(1996), is(true));
        assertThat(DateUtil.isLeap(2004), is(true));
        assertThat(DateUtil.isLeap(2008), is(true));
    }

    @Test
    public void returnFalseWhenIsNotDivisibleBy4(){
        assertThat(DateUtil.isLeap(2017), is(false));
        assertThat(DateUtil.isLeap(2018), is(false));
        assertThat(DateUtil.isLeap(2019), is(false));
    }

}