package Model;

public class AsetInvestasi {
    private String nama;
    private double nilai;
    private String jenis;

    public AsetInvestasi(String nama, double nilai, String jenis) {
        this.nama = nama;
        this.nilai = nilai;
        this.jenis = jenis;
    }

    // getter & setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getNilai() { return nilai; }
    public void setNilai(double nilai) { this.nilai = nilai; }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    public void tampilkanInfo() {
        System.out.println("=== Info Aset ===");
        System.out.println("Nama : " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Jenis: " + jenis);
    }
}
