import java.util.Scanner;

public class DaftarMataKuliah {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String kode = sc.next();
        String nama = sc.next();
        int sks = sc.nextInt();
        String dosen = sc.next();
        int kapasitas = sc.nextInt();
        int tambahan = sc.nextInt();
        sc.close();

        MataKuliah matkul = new MataKuliah(kode, nama, sks, dosen, kapasitas);
        matkul.tambahKapasitas(tambahan);

        System.out.println("Kode Mata Kuliah: " + kode);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS Mata Kuliah: " + sks);
        System.out.println("Nama Dosen: " + dosen);
        System.out.println("Kapasitas Kuliah" + kapasitas);
        System.out.println("Total Revisi Kapasitas Kuliah: " + matkul.getKapasitas());
    }
}


