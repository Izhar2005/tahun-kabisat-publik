import java.util.Scanner;

public class tahunKabisat {
    public static void main(String[] args) {
        // Meminta input tahun dari pengguna
        try (Scanner scanner = new Scanner(System.in)) {
            // Meminta input tahun dari pengguna
            System.out.print("Masukkan tahun: ");
            int tahun = scanner.nextInt();
            
            // Menentukan apakah tahun tersebut adalah tahun kabisat atau tidak
            boolean isKabisat = false;
            
            if (tahun % 4 == 0) {
                if (tahun % 100 == 0) {
                    if (tahun % 400 == 0) {
                        isKabisat = true;
                    }
                } else {
                    isKabisat = true;
                }
            }
            
            // Menampilkan hasil
            if (isKabisat) {
                System.out.println(tahun + " Tahun kabisat ");
            } else {
                System.out.println(tahun + " Bukan Tahun Kabisat ");
            }
        }
    }
}
