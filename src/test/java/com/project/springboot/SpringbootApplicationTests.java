package com.project.springboot;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class SpringbootApplicationTests {
  /*  @BeforeClass
        public static void setUpClass(){
        System.out.println("Set up class ");
    }*//*
    @BeforeEach
    public void before()
    {
        System.out.println("Before");
    }
    @Test
    public void testCase1()
    {
        System.out.println("Testcase 1");
    }
    @Test
    public void testCase2()
    {
        System.out.println("TestCase 2");
    }
    @AfterEach
    public void after()
    {
        System.out.println("After");
    }
   *//* @AfterClass
    public static void  tearDownClass()
    {

        System.out.println("Tear down class");
    }*/

   Calculator underTest=new Calculator();
@Test
@Disabled
void itShouldAddNumbers() {

    // given
    int numberOne = 20;
    int numberTwo = 30;
    //when
    int result = underTest.add(numberOne, numberTwo);
    //then
    int expected=50;
    assertEquals(result,50);
    assertThat(result).isEqualTo(expected);
}
 class Calculator
  {
    int add(int a, int b) {
            return a + b;
        }
  }
}
