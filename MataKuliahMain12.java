public class MataKuliahMain12 {
    public static void main(String[] args) {
        MataKuliah12 mk1 = new MataKuliah12();
        mk1.kodeMK = "2521";
        mk1.nama = "Basis Data";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.ubahSks(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.tampilInformasi();

        System.out.println("=====================================");
        
        MataKuliah12 mk2 = new MataKuliah12("2522", "Algoritma dan Struktur Data", 2, 6);
        mk2.tampilInformasi();
        mk2.ubahSks(3);
        mk2.tambahJam(2);
        mk2.kurangiJam(1);
        mk2.tampilInformasi();
    }
}
