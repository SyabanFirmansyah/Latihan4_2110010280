package penilaian;

public class main {
    public static void main(String[] args) {
        NilaiAkhir iman1 = new NilaiAkhir(80,80,90);
        
        iman1.setNama("Syaban Firmansyah");
        iman1.setNpm("2110010280");
        
        System.out.println("nama        :"+iman1.getNama());
        System.out.println("npm         :"+iman1.getNpm());
    }
}
