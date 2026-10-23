import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        int[] first_arr = new int[number];

        int[] dynamic_arr = add(first_arr, 5);
        int intenger_from_arr = get(first_arr, 2);

        String result = Arrays.toString(dynamic_arr);

        System.out.println(result);
        System.out.println(intenger_from_arr);
    }

    public static int get(int[] arr, int index) {
        return arr[index];
    }

    public static int[] remove (int[] arr, int index) {
        int[] result = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            result[j] = arr[i];
            j++;
        }

        return result;
    }

    public static int[] add (int[] arr, int value) {
        int[] result = new int[arr.length + 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            result[j] = arr[i];
            j++;
        }

        result[arr.length] = value;

        return result;
    }
}