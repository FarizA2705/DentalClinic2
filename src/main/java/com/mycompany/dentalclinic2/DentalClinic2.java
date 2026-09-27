package com.mycompany.dentalclinic2;

import java.util.ArrayList;
import java.util.Scanner;
import model.Dokter;
import model.Manager;
import model.User;
import model.Pasien;

public class DentalClinic2 {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Pasien> daftarPasien = new ArrayList<>();
    static ArrayList<Dokter> daftarDokter = new ArrayList<>();

    public static void main(String[] args) {

        // Data dokter sudah tersedia
        daftarDokter.add(new Dokter(
                "D001",
                "Dr. Andi",
                "081234567890",
                "Dokter Gigi Umum"
        ));

        daftarDokter.add(new Dokter(
                "D002",
                "Dr. Siti",
                "082345678901",
                "Spesialis Ortodonti"
        ));

        daftarDokter.add(new Dokter(
                "D003",
                "Dr. Budi",
                "083456789012",
                "Spesialis Gigi Anak"
        ));

        Manager manager = new Manager(
                "M001",
                "Admin Klinik",
                "085555555555"
        );

        int pilihan;

        do {
            System.out.println("\n=================================");
            System.out.println("     MANAJEMEN KLINIK GIGI");
            System.out.println("=================================");
            System.out.println("1. Daftar Sebagai Pasien");
            System.out.println("2. Lihat Data Pasien");
            System.out.println("3. Lihat Daftar Dokter");
            System.out.println("4. Kelola Pasien & Pilih Dokter");
            System.out.println("5. Informasi Manager");
            System.out.println("6. Informasi Klinik");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {

                case 1:
                    daftarPasien();
                    break;

                case 2:
                    tampilkanPasien();
                    break;

                case 3:
                    tampilkanDokter();
                    break;

                case 4:
                    pilihDokter(manager);
                    break;

                case 5:
                    manager.tampilkanInfo();
                    break;

                case 6:
                    tampilkanInformasi();
                    break;

                case 7:
                    System.out.println("Program selesai. Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak tersedia.");
            }

        } while (pilihan != 7);
    }

    public static void daftarPasien() {

        System.out.println("\n=== PENDAFTARAN PASIEN ===");

        System.out.print("ID Pasien   : ");
        String id = scanner.nextLine();

        System.out.print("Nama        : ");
        String nama = scanner.nextLine();

        System.out.print("Umur        : ");
        int umur = scanner.nextInt();
        scanner.nextLine();

        System.out.print("No Telepon  : ");
        String noTelepon = scanner.nextLine();

        System.out.print("Keluhan     : ");
        String keluhan = scanner.nextLine();

        Pasien pasien = new Pasien(
                id,
                nama,
                umur,
                noTelepon,
                keluhan
        );

        daftarPasien.add(pasien);

        System.out.println("\nPasien berhasil didaftarkan.");
        System.out.println("Silakan Manager menentukan dokter.");
    }

    public static void tampilkanPasien() {

        System.out.println("\n=== DAFTAR PASIEN ===");

        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada pasien yang terdaftar.");
            return;
        }

        for (Pasien pasien : daftarPasien) {
            pasien.tampilkanInfo();
            System.out.println("-----------------------------");
        }
    }

    public static void tampilkanDokter() {

        System.out.println("\n=== DAFTAR DOKTER ===");

        for (Dokter dokter : daftarDokter) {
            dokter.tampilkanInfo();
            System.out.println("-----------------------------");
        }
    }

    public static void pilihDokter(Manager manager) {

        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada pasien yang terdaftar.");
            return;
        }

        System.out.println("\n=== PILIH PASIEN ===");

        for (int i = 0; i < daftarPasien.size(); i++) {
            System.out.println(
                    (i + 1) + ". " +
                    daftarPasien.get(i).getNama()
            );
        }

        System.out.print("Pilih pasien: ");
        int pasienIndex = scanner.nextInt();
        scanner.nextLine();

        if (pasienIndex < 1 || pasienIndex > daftarPasien.size()) {
            System.out.println("Pilihan pasien tidak valid.");
            return;
        }

        System.out.println("\n=== PILIH DOKTER ===");

        for (int i = 0; i < daftarDokter.size(); i++) {
            System.out.println(
                    (i + 1) + ". " +
                    daftarDokter.get(i).getNama() +
                    " - " +
                    daftarDokter.get(i).getSpesialisasi()
            );
        }

        System.out.print("Pilih dokter: ");
        int dokterIndex = scanner.nextInt();
        scanner.nextLine();

        if (dokterIndex < 1 || dokterIndex > daftarDokter.size()) {
            System.out.println("Pilihan dokter tidak valid.");
            return;
        }

        Pasien pasien = daftarPasien.get(pasienIndex - 1);
        Dokter dokter = daftarDokter.get(dokterIndex - 1);

        manager.pilihDokter(pasien, dokter);
    }

    public static void tampilkanInformasi() {

        System.out.println("\n=== INFORMASI KLINIK ===");
        System.out.println("Nama Klinik : Klinik Gigi Sehat");
        System.out.println("Layanan     : 1. Pemeriksaan Gigi");
        System.out.println("              2. Perawatan Gigi");
        System.out.println("              3. Konsultasi Gigi");
    }
}
