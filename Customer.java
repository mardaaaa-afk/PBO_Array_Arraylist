import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts; // Menggunakan ArrayList untuk menyimpan banyak akun

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        this.accounts = new ArrayList<Account>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Menambah akun ke daftar ArrayList
    public void setAccount(Account acct) {
        accounts.add(acct);
    }

    // Mengambil akun berdasarkan indeks di ArrayList
    public Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        }
        return null;
    }

    // Mengambil total jumlah akun nasabah
    public int getNumOfAccounts() {
        return accounts.size();
    }
}
