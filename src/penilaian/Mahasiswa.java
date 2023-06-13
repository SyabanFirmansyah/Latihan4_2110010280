package penilaian;

public class Mahasiswa {
    public String nama, npm;

//set    

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }       
//get

    public String getNama() {
        System.out.println("superclass");
        return nama;
    }

    public String getNpm() {
        System.out.println("superclass");
        return npm;
    }
    
   
}
