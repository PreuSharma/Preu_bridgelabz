import java.util.*;

public class Stringss8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+"); // Split by whitespace
        int wordCount = words.length;

        System.out.println("Number of words: " + wordCount);
    }
}
