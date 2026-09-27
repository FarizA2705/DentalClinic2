package model;

public class User {
    protected String id;
    protected String nama;
    protected String noTelepon;

    public User(String id, String nama, String noTelepon) {
        this.id = id;
        this.nama = nama;
        this.noTelepon = noTelepon;
    }

    public void tampilkanInfo() {
        System.out.println("ID         : " + id);
        System.out.println("Nama       : " + nama);
        System.out.println("No Telepon : " + noTelepon);
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }
}