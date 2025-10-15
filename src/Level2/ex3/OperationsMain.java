package Level2.ex3;

public class OperationsMain {
    public static void main(String args[]) {

        MathOperation mathOperation = new MathOperation();

        System.out.println("14 + 18 = " + mathOperation.Add().operation(14, 18) );
        System.out.println("25 - 18 = " + mathOperation.Subtract().operation(25, 18) );
        System.out.println("10 * 18 = " + mathOperation.Multiply().operation(10, 18) );
        System.out.println("10 / 18 = " + mathOperation.Divide().operation(10, 18) );

    }
}
