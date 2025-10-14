package Level2.ex1;

import java.util.List;
import java.util.stream.Collectors;

public class LambdasFilter {

    public List<String> filterWithLambdas(List<String> names) {
        return names.stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.length()==3)
                .sorted()
                .collect(Collectors.toList());

    }
}
