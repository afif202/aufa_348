import java.util.Scanner;

public class Main {
    private static final String[][] USERS = {
            {"admin", "admin123"},
            {"202310370311348", "Muhammad Aufa Nur Ramadhan"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di sistem login Library");
        System.out.println("Silahkan pilih jenis Pengguna");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2) ");
        String userType = scanner.nextLine();

        if (userType.equals("1")) {
            adminLogin(scanner);
        } else if (userType.equals("2")) {
            mahasiswaLogin(scanner);
        } else {
            System.out.println("Pilihan tidak valid. Silahkan coba lagi");
        }
    }

    private static void adminLogin(Scanner scanner) {
        System.out.println("Masukkan username dan password untuk login sebagai admin:");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.println("Passsword: ");
        String Password = scanner.nextLine();

        if (username.equals(USERS[0][0]) && Password.equals(USERS[0][1])) {
            System.out.println("Login berhasil sebagai admin!");
        } else {
            System.out.println("Username atau password salah");
        }
    }

    private static void mahasiswaLogin(Scanner scanner) {
        System.out.println("Masukkan NIM untuk login sebagai mahasiswa");
        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        if (nim.length() != 15) {
            System.out.println("Panjang NIM harus 15 karakter.");
            return;
        }

        if (nim.equals(USERS[1][0])) {
            System.out.println("Login berhasil sebagai mahasiswa!");
        } else {
            System.out.println("NIM salah.");
        }
    }
}