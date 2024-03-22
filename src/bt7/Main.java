package bt7;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên x: ");
        int x = scanner.nextInt();
        System.out.print("Nhập số nguyên y: ");
        int y = scanner.nextInt();

        IntStream.rangeClosed(x, y).forEach(System.out::println);
    }
}