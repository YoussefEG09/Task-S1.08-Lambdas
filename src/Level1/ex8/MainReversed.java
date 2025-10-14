package Level1.ex8;

public class MainReversed {
    public static void main(String args[]) {

        Reversed reverse = input -> new StringBuilder(input).reverse().toString();

        String string1 = "Hello my namy is Youssef";

        String reversed = reverse.reverse(string1);

        System.out.println("Original string : " + string1);
        System.out.println("Reversed string : " + reversed);
    }
}
