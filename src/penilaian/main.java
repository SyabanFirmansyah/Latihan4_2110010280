package penilaian;

public class main {
    public static void main(String[] args) {
         //objek mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Sya'ban Firmansyah");
        mahasiswa.setNpm("2110010280");
        
        //objek NilaiAkhir
        NilaiAkhir nilaiAkhir = new NilaiAkhir();
        nilaiAkhir.setUts(90);
        nilaiAkhir.setUas(85);
        nilaiAkhir.setTugas(99);
        
        // tampilan data
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("NPM Mahasiswa: " + mahasiswa.getNpm());
        System.out.println("Nilai UTS: " + nilaiAkhir.getUts());
        System.out.println("Nilai UAS: " + nilaiAkhir.getUas());
        System.out.println("Nilai Tugas: " + nilaiAkhir.getTugas());
        System.out.println("Nilai Akhir: " + nilaiAkhir.hitungNilaiAkhir());
    }
}
