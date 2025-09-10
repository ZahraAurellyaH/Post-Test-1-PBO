package com.mycompany.Tugas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Struktur data untuk menyimpan peminjaman
    static class Peminjaman {
        String namaPeminjam;
        String nim;
        String departemen;
        String namaBarang;
        int jumlah;

        public Peminjaman(String namaPeminjam, String nim, String departemen, String namaBarang, int jumlah) {
            this.namaPeminjam = namaPeminjam;
            this.nim = nim;
            this.departemen = departemen;
            this.namaBarang = namaBarang;
            this.jumlah = jumlah;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("\n=== Manajemen Peminjaman Barang Sekre ===");
            System.out.println("1. Tambah Peminjaman");
            System.out.println("2. Lihat Daftar Peminjaman");
            System.out.println("3. Ubah Data Peminjaman");
            System.out.println("4. Hapus Data Peminjaman");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // buang enter

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Peminjam: ");
                    String nama = scanner.nextLine();
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Departemen: ");
                    String departemen = scanner.nextLine();
                    System.out.print("Nama Barang: ");
                    String barang = scanner.nextLine();
                    System.out.print("Jumlah: ");
                    int jumlah = scanner.nextInt();
                    
                    if (jumlah < 1) {
                        System.out.println("Jumlah barang harus minimal 1!");
                    } else {
                        daftarPeminjaman.add(new Peminjaman(nama, nim, departemen, barang, jumlah));
                        System.out.println("Data berhasil ditambahkan!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Daftar Peminjaman ---");
                    if (daftarPeminjaman.isEmpty()) {
                        System.out.println("Belum ada data peminjaman.");
                    } else {
                        for (int i = 0; i < daftarPeminjaman.size(); i++) {
                            Peminjaman p = daftarPeminjaman.get(i);
                            System.out.println((i + 1) + ". Nama: " + p.namaPeminjam + 
                                               " | NIM: " + p.nim + 
                                               " | Departemen: " + p.departemen + 
                                               " | Barang: " + p.namaBarang + 
                                               " | Jumlah: " + p.jumlah);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- Ubah Data Peminjaman ---");
                    for (int i = 0; i < daftarPeminjaman.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarPeminjaman.get(i).namaPeminjam);
                    }
                    System.out.print("Pilih nomor data yang akan diubah: ");
                    int idxUbah = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (idxUbah >= 0 && idxUbah < daftarPeminjaman.size()) {
                        System.out.print("Nama Baru: ");
                        String namaBaru = scanner.nextLine();
                        System.out.print("NIM Baru: ");
                        String nimBaru = scanner.nextLine();
                        System.out.print("Departemen Baru: ");
                        String departemenBaru = scanner.nextLine();
                        System.out.print("Barang Baru: ");
                        String barangBaru = scanner.nextLine();
                        System.out.print("Jumlah Baru: ");
                        int jumlahBaru = scanner.nextInt();

                        if (jumlahBaru < 1) {
                            System.out.println("Jumlah barang harus minimal 1!");
                        } else {
                            daftarPeminjaman.set(idxUbah, new Peminjaman(namaBaru, nimBaru, departemenBaru, barangBaru, jumlahBaru));
                            System.out.println("Data berhasil diubah!");
                        }
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Hapus Data Peminjaman ---");
                    for (int i = 0; i < daftarPeminjaman.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarPeminjaman.get(i).namaPeminjam);
                    }
                    System.out.print("Pilih nomor data yang akan dihapus: ");
                    int idxHapus = scanner.nextInt() - 1;
                    if (idxHapus >= 0 && idxHapus < daftarPeminjaman.size()) {
                        daftarPeminjaman.remove(idxHapus);
                        System.out.println("Data berhasil dihapus!");
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        scanner.close();
    }
}
