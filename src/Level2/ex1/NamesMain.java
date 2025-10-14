package Level2.ex1;

public class NamesMain {
    public static void main(String args[]) {
        ListCreator names = new ListCreator();
        var namesList = names.getNames();

        LambdasFilter filter = new LambdasFilter();
        var filterNames = filter.filterWithLambdas(namesList);

        ListPrinter printer = new ListPrinter();

        System.out.println("===========Name list without the filter===========");
        printer.printList(namesList);

        System.out.println("=========== Names list with filter =============");
        printer.printList(filterNames);
    }
}
