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
public class AppTest {
// Orginal Test Layout
// final App app = new App();
    @Test
    @DisplayName("prints Fizz")
    public void printsFizz() {
        assertEquals("Fizz", FizzBuzz.getFizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.getFizzBuzz(6));
        assertEquals("Fizz", FizzBuzz.getFizzBuzz(9));
        assertEquals("Fizz", FizzBuzz.getFizzBuzz(12));
    }

    @Test
    @DisplayName("prints Buzz")
    public void printsBuzz() {
        assertEquals("Buzz", FizzBuzz.getFizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.getFizzBuzz(10));
    }

    @Test
    @DisplayName("prints FizzBuzz")
    public void printsFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.getFizzBuzz(15));
    }

    @Test
    @DisplayName("prints int input")
    public void printsIntTo15() {
        assertEquals("1", FizzBuzz.getFizzBuzz(1));
        assertEquals("2", FizzBuzz.getFizzBuzz(2));
        assertEquals("4", FizzBuzz.getFizzBuzz(4));
        assertEquals("7", FizzBuzz.getFizzBuzz(7));
        assertEquals("8", FizzBuzz.getFizzBuzz(8));
        assertEquals("11", FizzBuzz.getFizzBuzz(11));
        assertEquals("13", FizzBuzz.getFizzBuzz(13));
        assertEquals("14", FizzBuzz.getFizzBuzz(14));
    }

    // @ParameterizedTest String[] num ={1,2,4,7,8,11,13,14}
    // // @DisplayName("prints int input")
    // public void printsIntTo14() {
    //     assertEquals(String.valueOf(num), FizzBuzz.getFizzBuzz(n));
    // }

    


}