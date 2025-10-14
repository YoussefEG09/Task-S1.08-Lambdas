package Level1.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainContains {
    public static void main(String args[]) {
        List<String> names = Arrays.asList("Youssef", "Mohammado", "Andres", "Alexa", "Christo");

        names.stream().filter(name -> name.contains("o")).forEach(System.out::println);


    }
}
