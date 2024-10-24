import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args){
        double tunjangan;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jumlah anggota keluarga: ");
        int jumlahAnggota = input.nextInt();
    
        if (jumlahAnggota <= 3) {
            tunjangan = jumlahAnggota * 100000;
        } else {
            tunjangan = (3 * 100000) + ((jumlahAnggota - 3) * 50000);
        }
        

        System.out.println("Besar tunjangan kesehatan = " + tunjangan);
        
        input.close();
    }
}
