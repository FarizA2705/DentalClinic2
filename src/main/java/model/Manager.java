package model;

public class Manager extends User {

    public Manager(String id, String nama, String noTelepon) {
        super(id, nama, noTelepon);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== DATA MANAGER ===");
        super.tampilkanInfo();
        System.out.println("Jabatan    : Manager Klinik");
    }

    public void pilihDokter(Pasien pasien, Dokter dokter) {
        pasien.setDokter(dokter);
        System.out.println(
            "Dokter " + dokter.getNama() +
            " berhasil ditentukan untuk pasien " +
            pasien.getNama()
        );
    }
}
