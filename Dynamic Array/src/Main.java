import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int number = 5;

        DynamicArray dynamicArray = new DynamicArray(number);

        dynamicArray.add(5);

        int integer_from_arr = dynamicArray.get(2);

        System.out.println(dynamicArray.toString());
        System.out.println(integer_from_arr);
    }
}