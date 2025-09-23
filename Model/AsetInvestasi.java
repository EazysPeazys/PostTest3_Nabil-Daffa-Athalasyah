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

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Jenis: " + jenis + ", Nilai: Rp" + nilai;
    }

    public void tampilkanInfo() {
        System.out.println(toString());
    }
}
