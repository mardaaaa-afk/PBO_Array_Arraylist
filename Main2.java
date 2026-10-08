public class Main2 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // 1. NASABAH PERTAMA (Marda Tilah)
        bank.addCustomer("Marda", "Tilah");
        Customer nasabah1 = bank.getCustomer(0);

        // Isi akun untuk Nasabah 1
        nasabah1.setAccount(new Account(2000000.0)); // Akun #1 (Tabungan Utama)
        nasabah1.setAccount(new Account(600000.0));  // Akun #2 (Tabungan Cadangan)
       
        // 2. NASABAH KEDUA (Rehan Sahrian)
        bank.addCustomer("Rehan", "Sahrian");
        Customer nasabah2 = bank.getCustomer(1);

        // Isi akun untuk Nasabah 2
        nasabah2.setAccount(new Account(2500000.0)); // Akun #1 (Giro)
        nasabah2.setAccount(new Account(5500000.0)); // Akun #2 (Investasi)

        // TAMPILKAN KONDISI AWAL
        System.out.println("==========================================");
        System.out.println("          STATUS KEUANGAN AWAL            ");
        System.out.println("==========================================");
        tampilkanInfoNasabah(nasabah1);
        tampilkanInfoNasabah(nasabah2);

        // SIMULASI TRANSAKSI KEDUA NASABAH
        System.out.println("\n==========================================");
        System.out.println("           PROSES TRANSAKSI               ");
        System.out.println("==========================================");

        // Transaksi Customer 1 (Marda)
        System.out.println("\n>>> [Marda Tilah] Setor Rp 300.000 ke Akun #1");
        nasabah1.getAccount(0).deposit(300000.0);

        System.out.println(">>> [Marda Tilah] Tarik Rp 100.000 dari Akun #2");
        nasabah1.getAccount(1).withdraw(100000.0);

        // Transaksi Customer 2 (Rehan)
        System.out.println(">>> [Rehan Sahrian] Menabung Rp 1.000.000 ke Akun #1");
        nasabah2.getAccount(0).deposit(1000000.0);

        System.out.println(">>> [Rehan Sahrian] Tarik Rp 500.000 dari Akun #2");
        nasabah2.getAccount(1).withdraw(500000.0);

        // TAMPILKAN KONDISI AKHIR
        System.out.println("\n==========================================");
        System.out.println("          STATUS KEUANGAN AKHIR           ");
        System.out.println("==========================================");
        
        System.out.println("Total Nasabah Terdaftar di Bank: " + bank.getNumOfCustomers());
        System.out.println();
        
        // Loop untuk menampilkan rincian seluruh nasabah di bank
        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            tampilkanInfoNasabah(bank.getCustomer(i));
        }
    }

    // Helper method untuk menampilkan info rincian nasabah
    public static void tampilkanInfoNasabah(Customer nasabah) {
        System.out.println("------------------------------------------");
        System.out.println("Nama Nasabah : " + nasabah.getFirstName() + " " + nasabah.getLastName());
        System.out.println("Jumlah Akun  : " + nasabah.getNumOfAccounts());
        
        double totalSaldo = 0;
        for (int i = 0; i < nasabah.getNumOfAccounts(); i++) {
            Account akun = nasabah.getAccount(i);
            System.out.println("  > Akun #" + (i + 1) + " Saldo: Rp " + akun.getBalance());
            totalSaldo += akun.getBalance();
        }
        System.out.println("Total Saldo Keseluruhan: Rp " + totalSaldo);
        System.out.println("------------------------------------------");
    }
}
