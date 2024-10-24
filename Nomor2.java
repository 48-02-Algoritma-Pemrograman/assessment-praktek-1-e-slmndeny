import java.util.Scanner;

public class Nomor2{
    public static void main(String[] args){
int jumlahPembelian;
        int totalTransaksi = 0;
        String namaProduk, lanjut;
        double totalPendapatan = 0;
        double harga;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Masukan nama produk [Labubu/Jenglot/Voodo]: ");
            namaProduk = input.next();

            System.out.println("jumlah pembelian: ");
            jumlahPembelian = input.nextInt();

            if (namaProduk.equalsIgnoreCase ("Labubu")) {
                harga = 300000;
            } else if (namaProduk.equalsIgnoreCase ("Jenglot")) {
                harga = 250000;
            } else if (namaProduk.equalsIgnoreCase ("Voodo")) {
                harga = 200000;
            }else {
                System.out.println("Produk tidak valid!");
                System.out.print("Input lagi (Y/N)?: ");
                lanjut = input.next();
                continue;            
            }

            double totalHarga = jumlahPembelian * harga;

            if (totalHarga >= 1000000) {
                totalHarga = totalHarga - (totalHarga * 0.15); // Diskon 15%
            } else if (totalHarga >= 500000) {
                totalHarga = totalHarga - (totalHarga * 0.10); // Diskon 10%
            }

            totalPendapatan += totalHarga;
            totalTransaksi++;

            System.out.print("Input lagi (Y/N)?: ");
            lanjut = input.next();

        } while (lanjut.equalsIgnoreCase("Y"));

        System.out.println("Total transaksi yang terjadi = " + totalTransaksi);
        System.out.println("Jumlah uang yang diterima = " + totalPendapatan);
        
        input.close();
    }
}
