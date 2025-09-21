package Main;

import java.util.Scanner;
import Service.AsetService;
import java.util.InputMismatchException;

public class MainAppInvestasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AsetService service = new AsetService();
        int pilihan = 0;

        do {
            System.out.println("\n|===< SELAMAT DATANG DI PLATFORM AKADEMI INVESTASI >===|");
            System.out.println("\n|===< MENU PLATFORM AKADEMI INVESTASI >===|");
            System.out.println("1. Tambah Aset");
            System.out.println("2. Lihat Aset");
            System.out.println("3. Ubah Aset");
            System.out.println("4. Hapus Aset");
            System.out.println("5. Cari Aset");
            System.out.println("6. Keluar Dari Platform");
            System.out.print("Pilih menu: ");
            System.out.println("\n|======================================================|");

            try {
                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1 -> service.tambahAset();
                    case 2 -> service.lihatAset();
                    case 3 -> service.ubahAset();
                    case 4 -> service.hapusAset();
                    case 5 -> service.cariAset();
                    case 6 -> System.out.println("Terima kasih, Sampai jumpa lagi!");
                    default -> System.out.println("Maaf Pilihan tidak valid, Silakan pilih nomor yang valid.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka antara 1–6.");
                input.nextLine();
            }

        } while (pilihan != 6);

        input.close();
    }
}
