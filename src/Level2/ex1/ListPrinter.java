package Level2.ex1;

import java.util.List;

public class ListPrinter {
    public void printList(List<String> names){
        System.out.println("Names that start with A and have only 3 letters");
        names.forEach(System.out::println);
    }
}
