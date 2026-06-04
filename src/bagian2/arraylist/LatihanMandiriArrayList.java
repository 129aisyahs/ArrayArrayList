package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {
        //1. Buat ArrayList<String> daftar belanja. Tambah 4 item, lalu hapus item ke-2, lalu tampilkan isi list beserta jumlah akhirnya.
        ArrayList<String> belanja = new ArrayList<>();
        // Tambah 4 item
        belanja.add("Apel");
        belanja.add("Susu");
        belanja.add("Roti");
        belanja.add("Telur");

        // Hapus item ke-2 (index 1)
        belanja.remove(1); // "Susu" terhapus

        // Tampilkan isi list
        System.out.println("Daftar belanja: " + belanja);
        System.out.println("Jumlah item: " + belanja.size());
        
        System.out.println("=================================================");
        
        //2. Buat ArrayList<Integer> berisi 5 angka. Tampilkan nilai terbesar dengan menelusuri seluruh elemen.
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(75); nilai.add(98); nilai.add(59);
        nilai.add(68); nilai.add(82);
        int max = nilai.get(0);
        for (int n : nilai) {
        if (n > max) max = n;
        }
        System.out.println("Terbesar: " + max); // hasil: 95
        
        System.out.println("=================================================");
        
        //3. Buat program yang menambah 6 nama ke dalam ArrayList, lalu cetak hanya nama yang diawali huruf A (gunakan method startsWith pada String).
        ArrayList<String> nama = new ArrayList<>();
        String[] data = {"Andi","Budi","Aldi","Citra","Aisya","Doni"};
        for (String d : data) nama.add(d);
        for (String n : nama) {
            if (n.startsWith("A")) System.out.println(n);
        }
        // hasil: Andi, Ayu, Adit
    }
}
