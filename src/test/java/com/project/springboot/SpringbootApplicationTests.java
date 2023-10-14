package com.project.springboot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
class SpringbootApplicationTests {

Calculator underTest=new Calculator();

@Test
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
