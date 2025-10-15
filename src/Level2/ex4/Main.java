package Level2.ex4;

import java.util.List;

public class Main {
    public static void main (String args[]) {
        var provider = new ListCreator();
        var items = provider.getItems();

        var operations = new ListOrdenator();

        List<Integer> onlyNumbers = operations.getNumericStrings(items);
        List<String> replacedList = operations.replaceAWith4(items);
        List<String> letterEFirst = operations.sortStringsEFirst(items);
        List<String> orderedList = operations.listOrderedAlphabetically(items);

        System.out.println("Only Numbers:" + onlyNumbers);

        System.out.println("\nReplace 'a' with '4' : " + replacedList);

        System.out.println("\nLetter 'e' First, then Alphabetical : " + letterEFirst);

        System.out.println("\nOrdered Alphabetically by First Character : " + orderedList);
    }
}
