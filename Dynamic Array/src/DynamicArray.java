import java.util.Arrays;

public class DynamicArray {

    private int[] first_arr;

    public DynamicArray(int size) {
        this.first_arr = new int[size];
    }

    public int get(int index) {
        return first_arr[index];
    }

    public void remove (int index) {
        int[] result = new int[first_arr.length - 1];

        for (int i = 0, j = 0; i < first_arr.length; i++) {
            if (i == index) {
                continue;
            }
            result[j] = first_arr[i];
            j++;
        }
        this.first_arr = result;
    }

    public void add (int value) {
        int[] result = new int[first_arr.length + 1];

        for (int i = 0, j = 0; i < first_arr.length; i++) {
            result[j] = first_arr[i];
            j++;
        }

        result[first_arr.length] = value;
        this.first_arr = result;
    }

    @Override
    public String toString() {
        return Arrays.toString(first_arr);
    }
}
