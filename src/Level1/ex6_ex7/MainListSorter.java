package Level1.ex6_ex7;

public class MainListSorter {
    public static void main(String args[]) {

        ListCreator list = new ListCreator();
        var items = list.getObjects();

        ListSorter sorter = new ListSorter();
        var itemsSortedLowerToHigher = sorter.orderLowerToHigher(items);

        ListPrinter printer = new ListPrinter();
        System.out.println("Sorted Lower to Higher");
        printer.printList(itemsSortedLowerToHigher);

        var itemsSortedHigherToLower = sorter.orderHigherToLower(items);
        System.out.println("Sorted Higher to Lower");
        printer.printList(itemsSortedHigherToLower);
    }
}
