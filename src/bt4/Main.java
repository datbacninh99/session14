package bt4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] arrString = new String[100];
        for (int i = 0; i < arrString.length; i++) {
//            Student s = new Student("SV00" + i);
//            arrString[i] = String.valueOf(s.hashCode());
        }
        System.out.println(Arrays.toString(arrString));
        Arrays.stream(arrString).sorted(Comparator.comparing(o -> o)).forEach(System.out::println);
    }
}