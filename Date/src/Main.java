import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("Date.txt");
             Scanner scanner = new Scanner(reader);
             FileWriter writer = new FileWriter("Text.txt")) {

            while (scanner.hasNextLine()) {
                String decodeStr = decodeString(scanner.nextLine());
                writer.write(decodeStr);

                if (scanner.hasNextLine()) {
                    writer.write(System.lineSeparator());
                }
            }

            System.out.println("Декодирование успешно завершено!");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String decodeString(String s) {
        Deque<StringBuilder> strStack = new ArrayDeque<>();
        Deque<Integer> numStack = new ArrayDeque<>();

        StringBuilder currentString = new StringBuilder();
        int currentNumber = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            }

            else if (ch == '[') {
                numStack.push(currentNumber);
                strStack.push(currentString);

                currentString = new StringBuilder();
                currentNumber = 0;
            }

            else if (ch == ']') {
                int count = numStack.pop();
                StringBuilder decodedSegment = currentString;

                currentString = strStack.pop();

                for (int i = 0; i < count; i++) {
                    currentString.append(decodedSegment);
                }
            }

            else {
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }
}

