package bt8;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(1000);
        }
        // Tìm ra số chẵn
        boolean check = Arrays.stream(arr).anyMatch(value -> value % 2 == 0);

        // Nếu có in ra số đầu tiên
        // Nếu không, ném ra lỗi không tìm thấy
        OptionalInt optionalInt = Arrays.stream(arr).filter(value -> value % 2 == 0).findFirst();
        System.out.println("Số chẵn đầu tiên là " + optionalInt.orElseThrow(() -> new RuntimeException("Không có số chẵn")));
    }
}