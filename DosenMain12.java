public class DosenMain12 {
    public static void main(String[] args) {
        Dosen12 dosen1 = new Dosen12();
        dosen1.idDosen = "TI197201";
        dosen1.nama = "Shakira Humaira";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2019;
        dosen1.bidangKeahlian = "Machine Learning";

        dosen1.tampilInformasi();
        dosen1.setStatus(true);
        int masaKerja = dosen1.hitungMasaKerja(2026);
        System.out.print("Masa kerja: " + masaKerja + " tahun\n"); 
        dosen1.ubahKeahlian("Cyber Security");
        dosen1.tampilInformasi();

        System.out.println("====================================");

        Dosen12 dosen2 = new Dosen12("TI207218", "Martin Alexandro", false, 2020, "Cloud Computing");
        dosen2.tampilInformasi();
        dosen2.setStatus(false);
        int masaKerja2 = dosen2.hitungMasaKerja(2024);
        System.out.print("Masa kerja: " + masaKerja2 + " tahun\n");
        dosen2.ubahKeahlian("Internet of Things");
        dosen2.tampilInformasi();
    }
}