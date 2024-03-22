package bt3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(1000);
        }
        // Lọc các số chẵn trong mảng
        int[] newArr = Arrays.stream(arr).filter(value -> value % 2 == 0).toArray();
        System.out.println(Arrays.toString(newArr));
    }
}