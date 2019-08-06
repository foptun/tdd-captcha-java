package com.example.demo;

import com.example.demo.captcha.Chapcha;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

    @Test
    public void operatorPattern_1_ShouldBe_Multiply(){
        Chapcha chapcha = new Chapcha(1,1,3,1);
        String operator = chapcha.getOperator();

        assertEquals("asdasdasdasdasdas", operator);
    }
}
