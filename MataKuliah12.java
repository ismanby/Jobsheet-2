public class MataKuliah12 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    
   public MataKuliah12() {
    
   }

    public MataKuliah12(String kode, String nm, int sks, int jam) {
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        jumlahJam = jam;
    }

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSks(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah");
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if(jam < jumlahJam) {
            jumlahJam -= jam;
        } else {
            System.out.println("Pengurangan jam tidak dapat dilakukan.");
        }
    }
}
