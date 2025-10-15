package Level2.ex3;

public class MathOperation {

    public Operation Add() {
        return ((a , b) -> a + b);
    }

    public Operation Subtract() {
        return ((a, b) -> a - b);
    }

    public Operation Multiply() {
        return ((a, b) -> a * b);
    }

    public Operation Divide() {
        return ((a, b) -> a / b);

    }
}
