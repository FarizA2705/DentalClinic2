package model;

public class Dokter extends User {
    private String spesialisasi;

    public Dokter(String id, String nama, String noTelepon, String spesialisasi) {
        super(id, nama, noTelepon);
        this.spesialisasi = spesialisasi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== DATA DOKTER ===");
        super.tampilkanInfo();
        System.out.println("Spesialisasi: " + spesialisasi);
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }
}
