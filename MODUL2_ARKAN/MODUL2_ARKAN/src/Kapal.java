public class Kapal extends TransportasiAir{
    protected String mesin;
    protected String text;
}
public Kapal (int JumlahKursi, int Biaya, String mesin){
    super(JumlahKursi, Biaya);
    this.mesin = mesin;   
}
    @Override
    public void information() {
    System.out.println("Transportasi Air tidak diketahui dengan kursi berjumlah "+JumlahKursi+"dengan biaya sebesar Rp. "+Biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis sedang berlayar dengan menggunakan mesin"+mesin+" layar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis berhasil berlabuh dipantai");
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air dengan jenis sampan berhasil berlayar menggunakan mesin"+mesin+"Dengan kecepatan"+kecepatan);
    }
}