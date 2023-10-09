import java.util.Scanner;

public class MenampilkanDanMencetakData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Sebuah Kata: ");
        String input = scanner.nextLine();
        System.out.println("Anda masukkan: " +input);
    }
}
