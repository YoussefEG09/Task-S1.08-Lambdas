package Level2.ex4;

import java.util.List;

public class ListCreator {
    private final List<Object> items;


    public ListCreator(){
        this.items = List.of(
                "apple", "banana", "cherry", "date", "elephant",
                123, 456, 789, "dog", "cat", "7eleven", "ace", 42, "every");

    }

    public List<Object> getItems() {
        return items;
    }
}
