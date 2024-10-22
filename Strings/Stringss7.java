import java.util.*;

public class Stringss7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);               // Get the character at index i
                                                      // Shift the character by one
            if (c == 'z') {
                result += 'a';                              // Wrap around if it's 'z'
            } else if (c == 'Z') {
                result += 'A';                                      // Wrap around if it's 'Z'
            } else {
                result += (char) (c + 1);                              // Shift to the next character
            }
        }
        System.out.println("Shifted string: " + result);
    }
}
