package Level1.ex6;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSorter {
     public List<String> orderLowerToHigher(List<Object> list) {

         return list.stream()
                 .filter(obj -> obj instanceof String)
                 .map(Object::toString)
                 .sorted(Comparator.comparing(String::length))
                 .collect(Collectors.toList());
     }

     public List<String> orderHigherToLower (List<Object> list) {

         return list.stream()
                 .filter(obj -> obj instanceof String)
                 .map(Object::toString)
                 .sorted(Comparator.comparing(String::length).reversed())
                 .collect(Collectors.toList());
     }
}
