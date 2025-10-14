package Level2.ex1;

import java.util.List;

public class ListCreator {

    private final List<String> names;

    public ListCreator() {
        this.names = List.of("Youssef", "Mohammado", "Andy", "Andres", "Alexa", "Ana", "Anna", "Ann");
    }

    public List<String> getNames() {
        return names;
    }
}
