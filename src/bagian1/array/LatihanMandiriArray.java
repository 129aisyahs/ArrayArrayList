package bagian1.array;

public class LatihanMandiriArray {
    public static void main(String[] args) {
        //1. Buat array berisi 6 suhu harian (bertipe double). Tampilkan suhu tertinggi dan terendah.
        double[] suhu = {32.1, 26.5, 34.7, 29.3, 30.8, 27.6};
        double max = suhu[0], min = suhu[0];
        for (double s : suhu) {
        if (s > max) max = s;
        if (s < min) min = s;
        }
        System.out.println("Tertinggi: " + max);
        System.out.println("Terendah : " + min);
        
        System.out.println("=================================================");
        
        //2. Buat array String berisi 5 nama hari. Cetak hanya nama hari yang memiliki lebih dari 5 huruf (gunakan .length() pada String).
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }
        
        System.out.println("=================================================");
        
        //3. Diberikan int[] angka = {4, 8, 15, 16, 23, 42}; hitung dan tampilkan berapa banyak angka genap di dalamnya.
        int[] angka = {4, 8, 15, 16, 23, 42};
        int genap = 0;
        for (int a : angka) {
        if (a % 2 == 0) genap++;
        }
        System.out.println("Jumlah genap: " + genap); // hasil: 4
    }
    
}
