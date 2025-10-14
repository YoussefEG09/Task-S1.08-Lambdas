package Level1.ex1_ex2;

import java.util.Arrays;
import java.util.List;

public class MainContains {
    public static void main(String args[]) {
        List<String> names = Arrays.asList("Youssef", "Mohammado", "Andy", "Andres", "Alexa", "Christo", "Eli", "Eloy");


        System.out.println("==========Showing only names that contain o ===================");
        names.stream().filter(name -> name.contains("o")).forEach(System.out::println);

        System.out.println("============Showing names that contain more than 5 letters ==============");
        names.stream().filter(name -> (name.length()>=5)).forEach(System.out::println);


    }
}
