//NAMA : AISYA SALSABILA NUR ROHMAH
//NPM  : 2410010053
package tugas;

public class MainTugas {
    public static void main(String[] args) {

        // Poin 4: array mata kuliah (ukuran tetap)
        String[] mataKuliah = {"Pemrograman Berbasis Objek", "Basis Data", "Algoritma"};
        System.out.println("== Mata Kuliah ==");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        // Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Poin 3: tambah minimal 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi",  "2301001", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Budi",  "2301002", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2301003", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Doni",  "2301004", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eka",   "2301005", 70.0));

        // Tampilkan semua
        kelas.tampilkanSemua();
        System.out.println();

        // Poin 5: tampilkan rata-rata dan jumlah lulus
        System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());
        System.out.println();

        // Poin 6: tambah mahasiswa baru, tampilkan jumlah terbaru
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "2301006", 78.0));
        System.out.println("Setelah menambah 1 mahasiswa baru:");
        kelas.tampilkanSemua();
    }
}