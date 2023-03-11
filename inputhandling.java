import java.io.*;
import java.util.Scanner;


class InputHandling {
    public static int intIn;
    public static String stringIn;

    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word:");
        stringIn = scan.nextLine();
        scan.close();
        System.out.println(stringIn);

    }
}