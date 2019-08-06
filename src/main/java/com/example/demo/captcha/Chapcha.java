package com.example.demo.captcha;

public class Chapcha {
    int left;
    int right;
    int operator;

    public Chapcha(int pattern, int left, int operator, int right) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public int getLeft() {
        return left;
    }

    public String getRight() {
        String numberWord[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return numberWord[this.right];
    }

    public String getOperator() {
        String operatorWord[] = {"", "+", "-", "*"};

        return operatorWord[this.operator];
    }
}
