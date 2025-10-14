package Level1.ex3;

import java.util.Arrays;
import java.util.List;

public class MonthsMain {
    public static void main(String args[]) {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        System.out.println("=======Printing all moths with Lambdas=======");
        months.forEach(System.out::println);
    }
}
