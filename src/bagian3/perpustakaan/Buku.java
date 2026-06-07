package bagian3.perpustakaan;

public class Buku {
    // Atribut: data yang dimiliki setiap buku
    // 2. Tambahkan atribut tahunTerbit (int) pada class Buku, lengkapi constructor dan getter-nya, lalu tampilkan tahun terbit di dalam method info.
    private String judul;
    private String penulis;
    private boolean dipinjam;
    private int tahunTerbit; // ← tambahan

    
    // Constructor: dipanggil saat objek dibuat
    // Constructor dilengkapi dengan tahunTerbit
    public Buku(String judul, String penulis, int tahunTerbit) {
    this.judul = judul;
    this.penulis = penulis;
    this.tahunTerbit = tahunTerbit;
    this.dipinjam = false; // buku baru dianggap tersedia
    }
    
    // Getter tambahan
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    
    // Getter: cara membaca atribut dari luar class
    public String getJudul() {
        return judul;
    }
    
    public String getPenulis() {
        return penulis;
    }
    
    public boolean isDipinjam() {
        return dipinjam;
    }
    // Method untuk mengubah status pinjam
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }
    
    // Mengembalikan keterangan buku dalam bentuk teks
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " oleh " + penulis + " (" + tahunTerbit + ")  [" + status + "]";
    }
  
}
