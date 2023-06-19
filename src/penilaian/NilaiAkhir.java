package penilaian;

public class NilaiAkhir extends Mahasiswa {
    protected int uts, uas, tugas;

    public NilaiAkhir(int uts, int uas, int tugas) {
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }

    NilaiAkhir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    int hitungNilaiAkhir(){
        return 30/100*uts+30/100*uas+40/100+tugas;
    }
    
    @Override
    public String getNama(){
        System.out.println("subclass");
        return super.getNama();
    }
    
    @Override
    public String getNpm(){
        System.out.println("subclass");
        return super.getNpm();
    }
    
}
