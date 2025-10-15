package Level2.ex4;

import java.util.Comparator;
import java.util.List;

public class ListOrdenator {

    public List<String> listOrderedAlphabetically(List<?> items) {
        return items.stream()
                .filter(item -> item instanceof String)
                .map(item -> (String) item)
                .sorted(Comparator.comparingInt(s -> s.charAt(0)))
                .toList();
    }

    public List<String> replaceAWith4(List<?> items) {

        return items.stream()
                .filter(item -> item instanceof String)
                .map(item -> ((String) item).replace('a', '4').replace('A', '4'))
                .toList();
    }

    public List<String> sortStringsEFirst(List<?> items) {

        return items.stream()
                .filter(item -> item instanceof String)
                .map(item -> (String) item)
                .sorted(Comparator
                        .comparing((String s) -> !s.toLowerCase().contains("e"))
                        .thenComparing(s -> s.trim().toLowerCase()))
                .toList();
    }

    public List<Integer> getNumericStrings(List<?> items) {

        return items.stream()
                .filter(item -> item instanceof Number)
                .map(item -> ((Number) item).intValue())
                .distinct()
                .sorted()
                .toList();
    }
}

