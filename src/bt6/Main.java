package bt6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Tạo một danh sách chuỗi
        List<String> strings = Arrays.asList("hello", "world", "java", "stream", "api");
        System.out.println("Chuỗi ban đầu = " + strings);

        // Sử dụng Stream API và phương thức map() để chuyển các chuỗi thành chữ in hoa
        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // In ra danh sách chuỗi sau khi đã chuyển thành chữ in hoa
        System.out.println("Chuỗi sau khi đã chuyển thành chữ in hoa = " + upperCaseStrings);
    }
}