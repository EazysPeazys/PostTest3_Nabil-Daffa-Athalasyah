package Model;

public class Saham extends AsetInvestasi {
    private String perusahaan;

    public Saham(String nama, double nilai, String perusahaan) {
        super(nama, nilai, "Saham");
        this.perusahaan = perusahaan;
    }

    public String getPerusahaan() { return perusahaan; }
    public void setPerusahaan(String perusahaan) { this.perusahaan = perusahaan; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Perusahaan: " + perusahaan);
    }
}
