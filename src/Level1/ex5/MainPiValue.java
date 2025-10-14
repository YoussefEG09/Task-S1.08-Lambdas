package Level1.ex5;

public class MainPiValue {
    public static void main(String args[]) {
        getPiValue pi = () -> 3.1415;

        System.out.println(pi.getPiValue());
    }
}