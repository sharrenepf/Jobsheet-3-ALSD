import java.util.Scanner;

public class DosenDemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = Integer.parseInt(input.nextLine());

        Dosen24[] arrayOfDosen = new Dosen24[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan data dosen ke-" + (i + 1) + ":");
            System.out.print("Kode: ");
            String kode = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jk = input.nextLine().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Usia: ");
            int usia = Integer.parseInt(input.nextLine());

            arrayOfDosen[i] = new Dosen24(kode, nama, jenisKelamin, usia);
            System.out.println("==============================");
        }

        int nomor = 1;
        for (Dosen24 dosen : arrayOfDosen) {
            System.out.println("\nData dosen ke-" + nomor++);
            System.out.println("Kode       : " + dosen.kode);
            System.out.println("Nama       : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia       : " + dosen.usia);
            System.out.println("==============================");
        }

        input.close();
    }
}
