import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args){
        int jumlahAnggota, tunjangan;
        Scanner input = new Scanner(System.in); 

        System.out.println("\nJumlah Anggota Keluarga: ");
        jumlahAnggota = input.nextInt();

        if (jumlahAnggota <=3 ) {
            tunjangan = jumlahAnggota * 100000;
        }
        else if (jumlahAnggota ==3) {
            tunjangan = jumlahAnggota * 100000;
        }else {
            tunjangan = (3 * 100000) + ((jumlahAnggota - 3) * 50000);
        }


        System.out.println("Besar tunjangan kesehatan= Rp " + tunjangan);

        input.close();
    }
}
