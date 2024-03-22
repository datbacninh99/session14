package bt5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(1000);
        }

        System.out.println("Mảng số nguyên: " + Arrays.toString(arr));

        // Giá trị xác định, bạn có thể thay đổi nó theo yêu cầu của bạn
        System.out.print("Nhập giá trị xác định: ");
        int threshold = scanner.nextInt();

        // Sử dụng Arrays.stream() và phương thức filter() để lọc các số lớn hơn một giá trị xác định
        // Sử dụng phương thức forEach() để in các số đã lọc ra màn hình
        System.out.println("Các số lớn hơn " + threshold + ": ");
        Arrays.stream(arr)
                .filter(n -> n > threshold)
                .forEach(n -> System.out.println(n));
    }
}