import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //menerima input dari user dan deklarasi data
        Scanner input = new Scanner(System.in);
        String nama,barang;
        int stok;
        double beli,jual;
        //program

        //input nama dari user
        System.out.print("Masukkan Nama anda :");
        nama = input.nextLine();
        System.out.println();

        //Greetings
        System.out.println("STOK GUDANG INPUT BARANG");
        System.out.println("########################");
        System.out.println("");
        System.out.printf("Selamat Datang %s\n",nama);

        //input nama barang dari user
        System.out.print("Masukkan Nama Barang anda :");
        barang = input.nextLine();

        //input jumlah barang dari user
        System.out.print("Masukkan jumlah barang yang mau ditambah : ");
        stok = input.nextInt();

        //input harga beli barang
        System.out.print("Masukkan Harga beli untuk barang tersebut : ");
        beli = input.nextDouble();

        //input harga jual barang
        System.out.print("Masukkan harga jual untuk barang tersebut : ");
        jual = input.nextDouble();
        System.out.println("");

        //Rincian barang
        System.out.println("STOCK GUDANG RINCIAN BARANG");
        System.out.println("###########################");
        System.out.println("");
        System.out.printf("Nama barang : %s\n",barang);
        System.out.printf("Jumlah Barang : %d\n",stok);
        System.out.printf("Harga Beli : %.2f\n",beli);
        System.out.printf("Harga Jual : %.2f\n",jual);

    }
}