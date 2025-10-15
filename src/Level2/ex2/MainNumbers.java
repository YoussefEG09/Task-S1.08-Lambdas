package Level2.ex2;

import java.util.List;

public class MainNumbers {
    public static void main(String args[]) {

        List<Integer> numbersList = new NumbersCreator().getNumbers();

        EvenOrOdd method = new EvenOrOdd();

        String numbersUsingMethod = method.evenOrOddNumber(numbersList);

        System.out.println(numbersUsingMethod);


    }


}
