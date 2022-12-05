public class Sampan extends TransportasiAir{
    protected int layar;
    protected String text;

public Sampan (int JumlahKursi, int Biaya, int layar){
    super(JumlahKursi, Biaya);
    this.layar = layar;    
}
    @Override
    public void information(){
    System.out.println("Transportasi Air tidak diketahui dengan kursi berjumlah "+JumlahKursi+"dengan biaya sebesar Rp. "+Biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis sampan sedang berlayar dengan menggunakan "+layar+" layar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis sampan berhasil berlabuh tanpa menggunakan jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air dengan jenis sampan berhasil berlabuh"+jangkar);
    }
}
    