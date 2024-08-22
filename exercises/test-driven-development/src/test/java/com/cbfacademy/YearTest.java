package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
// This is a J Unit annotation
@DisplayName(value = "Basic Test Suite")
public class YearTest {
// Orginal Test Layout
// final App app = new App();
    @Test
    @DisplayName("400-true")
    public void is400() {
        //  assertEquals(false, Year.isLeap(2001));
         assertEquals(true, Year.isLeap(2000));
    }

    @Test
    @DisplayName("100-true&440-false")
    public void is100not400() {
        //   assertEquals(true, Year.isLeap(1700));
          assertEquals(false, Year.isLeap(2001));
    }

    @Test
    @DisplayName("4-true&100-false")
    public void is4not100() {
        //  assertEquals(true, Year.isLeap(2008));
          assertEquals(false, Year.isLeap(2009));
    }
    
}