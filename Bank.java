import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers; // Menggunakan ArrayList untuk menyimpan banyak nasabah

    public Bank() {
        this.customers = new ArrayList<Customer>();
    }

    // Menambah nasabah baru ke daftar ArrayList
    public void addCustomer(String f, String l) {
        customers.add(new Customer(f, l));
    }

    // Mengambil total jumlah nasabah
    public int getNumOfCustomers() {
        return customers.size();
    }

    // Mengambil data nasabah berdasarkan indeks
    public Customer getCustomer(int index) {
        if (index >= 0 && index < customers.size()) {
            return customers.get(index);
        }
        return null;
    }
}
