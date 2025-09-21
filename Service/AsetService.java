package Service;

import java.util.ArrayList;
import java.util.Scanner;
import Model.AsetInvestasi;
import Model.Saham;
import Model.Obligasi;

public class AsetService {
    private ArrayList<AsetInvestasi> daftarAset = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void tambahAset() {
        System.out.println("\n== Tambah Aset ==");
        System.out.print("Masukkan jenis aset (1=Saham, 2=Obligasi): ");
        int jenis = sc.nextInt();
        sc.nextLine(); // buang newline

        System.out.print("Masukkan nama aset: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan nilai aset: ");
        double nilai = sc.nextDouble();
        sc.nextLine();

        AsetInvestasi aset;
        if (jenis == 1) {
            System.out.print("Masukkan nama perusahaan: ");
            String perusahaan = sc.nextLine();
            aset = new Saham(nama, nilai, perusahaan);
        } else {
            System.out.print("Masukkan bunga obligasi (contoh 5.5): ");
            double bunga = sc.nextDouble();
            sc.nextLine();
            aset = new Obligasi(nama, nilai, bunga);
        }

        daftarAset.add(aset);
        System.out.println("Aset berhasil ditambahkan!");
    }

    public void lihatAset() {
        System.out.println("\n== Daftar Aset ==");
        if (daftarAset.isEmpty()) {
            System.out.println("Belum ada aset.");
            return;
        }
        int i = 1;
        for (AsetInvestasi a : daftarAset) {
            System.out.println("Aset ke-" + (i++));
            a.tampilkanInfo(); // polymorphism + overriding
            System.out.println();
        }
    }

    public void cariAset() {
        System.out.print("Masukkan nama aset yang dicari: ");
        String keyword = sc.nextLine().toLowerCase();
        boolean found = false;
        for (AsetInvestasi a : daftarAset) {
            if (a.getNama().toLowerCase().contains(keyword)) {
                a.tampilkanInfo();
                System.out.println();
                found = true;
            }
        }
        if (!found) System.out.println("Aset tidak ditemukan.");
    }

    public void hapusAset() {
        lihatAset();
        if (daftarAset.isEmpty()) return;
        System.out.print("Masukkan nomor aset yang ingin dihapus: ");
        int idx = sc.nextInt();
        sc.nextLine();
        if (idx >= 1 && idx <= daftarAset.size()) {
            daftarAset.remove(idx - 1);
            System.out.println("Aset dihapus.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    public void ubahAset() {
        lihatAset();
        if (daftarAset.isEmpty()) return;
        System.out.print("Masukkan nomor aset yang ingin diubah: ");
        int idx = sc.nextInt();
        sc.nextLine();
        if (idx >= 1 && idx <= daftarAset.size()) {
            AsetInvestasi a = daftarAset.get(idx - 1);
            System.out.print("Masukkan nama baru (enter untuk tetap): ");
            String nama = sc.nextLine();
            if (!nama.trim().isEmpty()) a.setNama(nama);

            System.out.print("Masukkan nilai baru (0 untuk tetap): ");
            double nilai = sc.nextDouble();
            sc.nextLine();
            if (nilai > 0) a.setNilai(nilai);

            // Jika ingin mengubah atribut subclass, bisa dilakukan dengan instanceof dan cast
            if (a instanceof Saham) {
                System.out.print("Masukkan perusahaan (enter untuk tetap): ");
                String p = sc.nextLine();
                if (!p.trim().isEmpty()) ((Saham) a).setPerusahaan(p);
            } else if (a instanceof Obligasi) {
                System.out.print("Masukkan bunga (negatif untuk tetap): ");
                double b = sc.nextDouble();
                sc.nextLine();
                if (b >= 0) ((Obligasi) a).setBunga(b);
            }

            System.out.println("Aset diperbarui.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }
}
