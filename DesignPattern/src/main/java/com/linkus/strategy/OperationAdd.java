package com.linkus.strategy;

public class OperationAdd implements  CalculateStrategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
class OperationSub implements CalculateStrategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

class OperationMul implements CalculateStrategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

class OperationDiv implements CalculateStrategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 / num2;
    }
}