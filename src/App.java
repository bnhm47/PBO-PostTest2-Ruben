import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Menerima Input dari Pengguna
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();
        
        System.out.print("Masukkan jumlah uang yang dimiliki: Rp ");
        double uang = input.nextDouble();
        
        System.out.print("Masukkan rata-rata pengeluaran harian: Rp ");
        double pengeluaranHarian = input.nextDouble();
        
        // 2. Konversi tipe data
        double usiaDouble = (double) usia;
        int uangInt = (int) uang;
        
        // 3. Perhitungan Keuangan
        double sisaUang30Hari = uang - (pengeluaranHarian * 30);
        double estimasiBulanBertahan = uang / (pengeluaranHarian * 30);
        
        String statusKeuangan;
        if (estimasiBulanBertahan < 1) {
            statusKeuangan = "PERINGATAN: Keuangan Anda kurang stabil!";
        } else if (estimasiBulanBertahan > 6) {
            statusKeuangan = "Keuangan Anda dalam kondisi aman";
        } else {
            statusKeuangan = "Keuangan Anda cukup stabil";
        }
        
        // 4. Operator Perbandingan & Logika
        boolean lebihDari30 = usia > 30;
        boolean lebihDari30DanKaya = usia > 30 && uang > 10000000;
        boolean kurangDari30AtauCukup = usia < 30 || uang > 5000000;
        
        // 5. Input jumlah hutang
        System.out.print("Masukkan jumlah hutang: Rp ");
        double hutang = input.nextDouble();
        
        double hutangAbsolut = hutang < 0 ? -hutang : hutang;
        double pengeluaranPembulatan = (pengeluaranHarian % 1 == 0) ? pengeluaranHarian : (int) pengeluaranHarian + 1;
        int bonusTakTerduga = 100000 + (int) ((System.currentTimeMillis() % 901000)); 
        
        double totalUangSetelah = sisaUang30Hari + bonusTakTerduga;
        
        // 6. Menampilkan Rangkuman Keuangan
        System.out.println("=== LAPORAN KEUANGAN PRIBADI ===");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Uang yang dimiliki: Rp " + uangInt);
        System.out.println("Pengeluaran harian rata-rata: Rp" + pengeluaranHarian);
        System.out.println("Sisa uang dalam 30 hari: Rp " + sisaUang30Hari);
        System.out.println("Estimasi bulan bertahan: " + estimasiBulanBertahan + " bulan");
        System.out.println("Status Keuangan: " + statusKeuangan);
        
        System.out.println("Apakah usia lebih dari 30? " + lebihDari30);
        System.out.println("Apakah usia > 30 dan uang > 10 juta? " + lebihDari30DanKaya);
        System.out.println("Apakah usia < 30 atau uang > 5 juta? " + kurangDari30AtauCukup);
        
        System.out.println("Nilai absolut dari hutang: Rp" + hutangAbsolut);
        System.out.println("Pengeluaran harian setelah pembulatan: Rp " + pengeluaranPembulatan);
        System.out.println("Bonus tak terduga: Rp " + bonusTakTerduga);
        System.out.println("Total uang yang dimiliki setelah pengeluaran dan bonus: Rp " + totalUangSetelah);

        input.close();
    }
}
