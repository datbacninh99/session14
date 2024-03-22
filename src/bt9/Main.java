package bt9;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // BT1
        System.out.println("Ngày hiện tại của hệ thống: " + LocalDate.now());
        System.out.println("Ngày hiện tại tại Asia/Tokyo: " + LocalDate.now(ZoneId.of("Asia/Tokyo")));
        System.out.println("Ngày hiện tại tại Australia/Sydney: " + LocalDate.now(ZoneId.of("Australia/Sydney")));
        System.out.println("Ngày hiện tại tại America/Sao_Paulo: " + LocalDate.now(ZoneId.of("America/Sao_Paulo")));

        System.out.println("===============================================================================================");

        // BT2
        System.out.println("Thời gian hệ thống: " + LocalTime.now());

        System.out.println("===============================================================================================");

        // BT3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày thứ nhất (theo định dạng yyyy-mm-dd): ");
        String firstDateString = scanner.nextLine();
        System.out.print("Nhập ngày thứ hai (theo định dạng yyyy-mm-dd): ");
        String secondDateString = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateString);
        LocalDate secondDate = LocalDate.parse(secondDateString);
        long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);
        System.out.println("Số ngày giữa hai ngày là: " + daysBetween);

        System.out.println("===============================================================================================");

        // BT4
        System.out.println("Số ngày trong tháng hiện tại là: " + YearMonth.now().lengthOfMonth());

        System.out.println("===============================================================================================");

        // BT5
        System.out.println("Số ngày trong năm hiện tại là: " + Year.now().length());

        System.out.println("===============================================================================================");

        // BT6
        System.out.print("Nhập một chuỗi ngày (theo định dạng yyyy-mm-dd): ");
        String dateString = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateString);
        System.out.println("Đối tượng LocalDate từ chuỗi ngày: " + date);

        System.out.println("===============================================================================================");

        // BT7
        System.out.print("Nhập một đối tượng LocalDate (theo định dạng yyyy-mm-dd): ");
        date = LocalDate.parse(scanner.nextLine());
        dateString = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Chuỗi ngày từ đối tượng LocalDate: " + dateString);

        System.out.println("===============================================================================================");

        // BT8
        System.out.print("Nhập một đối tượng LocalDateTime (theo định dạng yyyy-MM-ddTHH:mm:ss): ");
        LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine());
        String dateTimeString = dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("Chuỗi ngày từ đối tượng LocalDateTime: " + dateTimeString);

        System.out.println("===============================================================================================");

        // BT9
        System.out.print("Nhập ngày thứ nhất (theo định dạng yyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());
        System.out.print("Nhập ngày thứ hai (theo định dạng yyyy-mm-dd): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());
        int comparison = date1.compareTo(date2);
        if (comparison < 0) {
            System.out.println("Ngày thứ nhất trước ngày thứ hai");
        } else if (comparison > 0) {
            System.out.println("Ngày thứ nhất sau ngày thứ hai");
        } else {
            System.out.println("Hai ngày là như nhau");
        }

        System.out.println("===============================================================================================");

        // BT10
        System.out.print("Nhập thời gian thứ nhất (theo định dạng HH:mm): ");
        LocalTime time1 = LocalTime.parse(scanner.nextLine());
        System.out.print("Nhập thời gian thứ hai (theo định dạng HH:mm): ");
        LocalTime time2 = LocalTime.parse(scanner.nextLine());
        comparison = time1.compareTo(time2);
        if (comparison < 0) {
            System.out.println("Thời gian thứ nhất trước thời gian thứ hai");
        } else if (comparison > 0) {
            System.out.println("Thời gian thứ nhất sau thời gian thứ hai");
        } else {
            System.out.println("Hai thời gian là như nhau");
        }

        System.out.println("===============================================================================================");

        // BT11
        System.out.print("Nhập một đối tượng LocalDateTime (theo định dạng yyyy-MM-ddTHH:mm:ss): ");
        dateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.print("Nhập số ngày cần thêm hoặc bớt: ");
        long days = scanner.nextLong();
        System.out.print("Nhập số giờ cần thêm hoặc bớt: ");
        long hours = scanner.nextLong();
        System.out.print("Nhập số phút cần thêm hoặc bớt: ");
        long minutes = scanner.nextLong();
        System.out.print("Nhập số giây cần thêm hoặc bớt: ");
        long seconds = scanner.nextLong();
        System.out.print("Nhập số mili giây cần thêm hoặc bớt: ");
        long nanos = scanner.nextLong() * 1000000;
        LocalDateTime modifiedDateTime = dateTime.plusDays(days).plusHours(hours).plusMinutes(minutes).plusSeconds(seconds).plusNanos(nanos);
        System.out.println("Đối tượng LocalDateTime sau khi đã thêm hoặc bớt: " + modifiedDateTime);

        System.out.println("===============================================================================================");

        // BT12
        System.out.print("Nhập một ngày (theo định dạng yyyy-mm-dd): ");
        date = LocalDate.parse(scanner.nextLine());
        LocalDate nextDay = date.plusDays(1);
        LocalDate previousDay = date.minusDays(1);
        System.out.println("Ngày tiếp theo: " + nextDay);
        System.out.println("Ngày trước đó: " + previousDay);
    }
}