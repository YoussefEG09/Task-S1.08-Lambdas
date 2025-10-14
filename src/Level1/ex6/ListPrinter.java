package Level1.ex6;

import java.util.List;

public class ListPrinter {

    public void printList(List<?> list){
            list.forEach(System.out::println);
    }
}
