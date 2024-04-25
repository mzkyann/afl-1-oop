import java.util.*;
import java.io.*;

public class Perpus {

    public static void main(String[] args) {
        ArrayList<Barang> tabelBarang = new ArrayList<>();
        ArrayList<Peminjam> tabelPeminjam = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try (PrintWriter writerBarang = new PrintWriter(new File("Barang.txt"));
             PrintWriter writerPeminjam = new PrintWriter(new File("Peminjam.txt"))) {

            // Input untuk laporan barang
            for (int i = 0; i < 5; i++) {
                String JUDUL, EDISI, PENERBIT;
                int TOTAL, DIPINJAM, TERSEDIA, RUSAK;

                try {
                    System.out.print("Masukkan nama JUDUL: ");
                    JUDUL = scanner.nextLine();
                    System.out.print("Masukkan nama EDISI: ");
                    EDISI = scanner.nextLine();
                    System.out.print("Masukkan TOTAL: ");
                    TOTAL = scanner.nextInt();
                    System.out.print("Masukkan jumlah DIPINJAM: ");
                    DIPINJAM = scanner.nextInt();
                    System.out.print("Masukkan jumlah TERSEDIA: ");
                    TERSEDIA = scanner.nextInt();
                    System.out.print("Masukkan jumlah RUSAK: ");
                    RUSAK = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi karakter newline
                    System.out.print("Masukkan nama PENERBIT: ");
                    PENERBIT = scanner.nextLine();

                    Barang buku = new Buku(JUDUL, TOTAL, RUSAK, EDISI, DIPINJAM, TERSEDIA, RUSAK, PENERBIT);
                    tabelBarang.add(buku);
                } catch (Exception e) {
                    System.out.println("Input salah");
                    scanner.nextLine();
                }
            }

            // Tulis laporan barang ke file
            int j = 1;
            writerBarang.printf("|==============================================================================================|%n");
            writerBarang.printf("|                                      Laporan BUKU                                            |%n");
            writerBarang.printf("|==============================================================================================|%n");
            writerBarang.printf("| %-3s | %-15s | %-15s | %-6s | %-9s | %-6s | %-20s |%n", "No", "Judul", "Edisi", "Total", "Dipinjam", "Rusak", "Penerbit");
            writerBarang.printf("|==============================================================================================|%n");
            for (Barang buku : tabelBarang) {
                writerBarang.printf("| %-3d | %-15s | %-15s | %-6d | %-9d | %-6d | %-20s |%n", j, buku.getJUDUL(), buku.getEDISI(), buku.getTOTAL(), buku.getDIPINJAM(), buku.getRUSAK(), buku.getPENERBIT());
                j++;
            }
            writerBarang.printf("|==============================================================================================|%n");

            // Input untuk data peminjaman buku
            for (int k = 0; k < 5; k++) {
                String JUDUL, NAMA;
                int PTANGGAL, JMLDIPINJAM, TGLKEMBALI;

                try {
                    System.out.print("Masukkan nama JUDUL: ");
                    JUDUL = scanner.nextLine();
                    System.out.print("Masukkan nama PTANGGAL: ");
                    PTANGGAL = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi karakter newline
                    System.out.print("Masukkan NAMA: ");
                    NAMA = scanner.nextLine();
                    System.out.print("Masukkan nama TGLKEMBALI: ");
                    TGLKEMBALI = scanner.nextInt();
                    System.out.print("Masukkan jumlah JMLDIPINJAM: ");
                    JMLDIPINJAM = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi karakter newline

                    Peminjam minjam = new Peminjam(JUDUL, PTANGGAL, NAMA, TGLKEMBALI, JMLDIPINJAM);
                    tabelPeminjam.add(minjam);
                } catch (Exception e) {
                    System.out.println("Input salah");
                    scanner.nextLine();
                }
            }

            // Tulis data peminjaman buku ke file
            int l = 1;
            writerPeminjam.printf("|==============================================================================================|%n");
            writerPeminjam.printf("|                                      Laporan Peminjaman buku                                 |%n");
            writerPeminjam.printf("|==============================================================================================|%n");
            writerPeminjam.printf("| %-3s | %-15s | %-15s | %-6s | %-9s | %-6s |%n", "No", "Judul", "PTanggal", "Nama", "TglKembali", "JmlDipinjam");
            writerPeminjam.printf("|==============================================================================================|%n");
            for (Peminjam minjam : tabelPeminjam) {
                writerPeminjam.printf("| %-3d | %-15s | %-15d | %-6s | %-9d | %-6d  |%n", l, minjam.getJUDUL(), minjam.getPTANGGAL(), minjam.getNAMA(), minjam.getTGLKEMBALI(), minjam.getJMLDIPINJAM());

                l++;
            }
            writerPeminjam.printf("|==============================================================================================|%n");
        } catch (FileNotFoundException e) {
            System.out.println("Error creating file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
