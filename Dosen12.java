public class Dosen12 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen12() {

    }

    public Dosen12(String id, String nm, boolean status, int tahunGabung, String bidang) {
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = tahunGabung;
        bidangKeahlian = bidang;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatus(boolean status) {
        if (statusAktif == true) {
            System.out.println("Status: Aktif");
        } else {
            System.out.println("Status: Tidak Aktif");
        }
    }

    int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        return masaKerja;
    }
    
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
