import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa24[] arrayOfMahasiswa = new Mahasiswa24[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa24();
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM          : ");
            arrayOfMahasiswa[i].nim = input.nextLine();
            System.out.print("Nama         : ");
            arrayOfMahasiswa[i].nama = input.nextLine();
            System.out.print("Kelas        : ");
            arrayOfMahasiswa[i].kelas = input.nextLine();
            System.out.print("IPK          : ");
            dummy = input.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("=========================================");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            System.out.println("NIM          : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama         : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas        : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK          : " + arrayOfMahasiswa[i].ipk);
            System.out.println("=========================================");
        }
    }
}