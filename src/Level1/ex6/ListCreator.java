package Level1.ex6;

import java.util.List;

public class ListCreator {

    private final List<Object> objects;

    public ListCreator() {
        this.objects = List.of("Youssef", "Father", 214.15, 8, "Welcome", "Aloha");
    }

    public List<Object> getObjects() {
        return objects;
    }
}
