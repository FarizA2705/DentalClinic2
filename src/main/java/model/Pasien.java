package model;


public class Pasien {
    private String idPasien;
    private String nama;
    private int umur;
    private String noTelepon;
    private String keluhan;
    private Dokter dokter;

    public Pasien(String idPasien, String nama, int umur,
                  String noTelepon, String keluhan) {
        this.idPasien = idPasien;
        this.nama = nama;
        this.umur = umur;
        this.noTelepon = noTelepon;
        this.keluhan = keluhan;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public String getNama() {
        return nama;
    }

    public void tampilkanInfo() {
        System.out.println("=== DATA PASIEN ===");
        System.out.println("ID Pasien   : " + idPasien);
        System.out.println("Nama        : " + nama);
        System.out.println("Umur        : " + umur);
        System.out.println("No Telepon  : " + noTelepon);
        System.out.println("Keluhan     : " + keluhan);

        if (dokter != null) {
            System.out.println("Dokter      : " + dokter.getNama());
            System.out.println("Spesialisasi: " + dokter.getSpesialisasi());
        } else {
            System.out.println("Dokter      : Belum ditentukan");
        }
    }
}