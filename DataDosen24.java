public class DataDosen24 {

    public void dataSemuaDosen(Dosen24[] arrayDosen24) {
        int nomor = 1;
        for (Dosen24 dosen24 : arrayDosen24) {
            System.out.println("Data dosen ke-" + nomor++);
            cetakInfo(dosen24);
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen24[] arrayDosen24) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen24 dosen24 : arrayDosen24) {
            if (dosen24.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("Jumlah dosen pria   : " + jumlahPria);
        System.out.println("Jumlah dosen wanita : " + jumlahWanita);
        System.out.println("==============================");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen24[] arrayDosen24) {
        int jumlahPria = 0, jumlahWanita = 0;
        int totalUsiaPria = 0, totalUsiaWanita = 0;

        for (Dosen24 dosen24 : arrayDosen24) {
            if (dosen24.jenisKelamin) {
                jumlahPria++;
                totalUsiaPria += dosen24.usia;
            } else {
                jumlahWanita++;
                totalUsiaWanita += dosen24.usia;
            }
        }

        System.out.println("Rerata usia dosen pria   : " + (jumlahPria > 0 ? (totalUsiaPria / jumlahPria) : 0));
        System.out.println("Rerata usia dosen wanita : " + (jumlahWanita > 0 ? (totalUsiaWanita / jumlahWanita) : 0));
        System.out.println("==============================");
    }

    public void infoDosenPalingTua(Dosen24[] arrayDosen24) {
        Dosen24 dosenTertua = arrayDosen24[0];

        for (Dosen24 dosen24 : arrayDosen24) {
            if (dosen24.usia > dosenTertua.usia) {
                dosenTertua = dosen24;
            }
        }

        System.out.println("Dosen tertua adalah : " + dosenTertua.nama);
        System.out.println("Dengan usia         : " + dosenTertua.usia);
        System.out.println("==============================");
    }

    public void infoDosenPalingMuda(Dosen24[] arrayDosen24) {
        Dosen24 dosenTermuda = arrayDosen24[0];

        for (Dosen24 dosen24 : arrayDosen24) {
            if (dosen24.usia < dosenTermuda.usia) {
                dosenTermuda = dosen24;
            }
        }

        System.out.println("Dosen termuda adalah : " + dosenTermuda.nama);
        System.out.println("Dengan usia         : " + dosenTermuda.usia);
        System.out.println("==============================");
    }

    private void cetakInfo(Dosen24 dosen24) {
        System.out.println("Kode           : " + dosen24.kode);
        System.out.println("Nama           : " + dosen24.nama);
        System.out.println("Jenis Kelamin  : " + (dosen24.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia           : " + dosen24.usia);
        System.out.println("==============================");
    }
}
