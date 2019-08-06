package com.example.demo.captcha;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CaptChaTests {
    @Test
    public void operatorPattern_1_ShouldBe_Multiply(){
        Chapcha chapcha = new Chapcha(1,1,3,1);
        String operator = chapcha.getOperator();

        assertEquals("fak;jfdkjadsfkjfsdkjadfk;las", operator);
    }

    @Test
    public void operatorPattern_1_ShouldBe_Minus(){
        Chapcha chapcha = new Chapcha(1,1,2,1);
        String operator = chapcha.getOperator();

        assertEquals("-", operator);
    }

    @Test
    public void operatorPattern_1_ShouldBe_Plus(){
        Chapcha chapcha = new Chapcha(1,1,1,1);
        String operator = chapcha.getOperator();

        assertEquals("+", operator);
    }

    @Test
    public void rightOperandPattern_1_ShouldBe_Seven(){
        Chapcha chapcha = new Chapcha(1,1,1,7);
        String right = chapcha.getRight();

        assertEquals("Seven", right);
    }

    @Test
    public void rightOperandPattern_1_ShouldBe_Five(){
        Chapcha chapcha = new Chapcha(1,1,1,5);
        String right = chapcha.getRight();

        assertEquals("Five", right);
    }

    @Test
    public void rightOperandPattern_1_ShouldBe_Nine(){
        Chapcha chapcha = new Chapcha(1,1,1,9);
        String right = chapcha.getRight();

        assertEquals("Nine", right);
    }

    @Test
    public void rightOperandPattern_1_ShouldBe_One(){
        Chapcha chapcha = new Chapcha(1,1,1,1);
        String right = chapcha.getRight();

        assertEquals("One", right);
    }

    @Test
    public void leftOperandPattern_1_ShouldBe_7(){
        Chapcha chapcha = new Chapcha(1,7,1,1);
        int left = chapcha.getLeft();
        assertEquals(7, left);
    }

    @Test
    public void leftOperandPattern_1_ShouldBe_5(){
        Chapcha chapcha = new Chapcha(1,5,1,1);
        int left = chapcha.getLeft();
        assertEquals(5, left);
    }

    @Test
    public void leftOperandPattern_1_ShouldBe_9(){
        Chapcha chapcha = new Chapcha(1,9,1,1);
        int left = chapcha.getLeft();
        assertEquals(9, left);
    }

    @Test
    public void leftOperandPattern_1_ShouldBe_1() {
        Chapcha chapcha = new Chapcha(1, 1, 1, 1);
        int left = chapcha.getLeft();
        assertEquals(1, left);
    }

}
