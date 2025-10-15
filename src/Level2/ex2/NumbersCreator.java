package Level2.ex2;

import java.util.List;

public class NumbersCreator {

    private final List<Integer> numbers;

    public NumbersCreator() {
        this.numbers = List.of(1,2,44,55,66,23,56,78);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
