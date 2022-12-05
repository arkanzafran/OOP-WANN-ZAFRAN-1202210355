public class TransportasiAir {
    protected int JumlahKursi;
    protected int Biaya;
    

    public TransportasiAir(int JumlahKursi, int Biaya) {
        this.JumlahKursi = JumlahKursi;
        this.Biaya = Biaya;
    }

    public void information(){
        System.out.println("Transportasi Air tidak diketahui dengan kursi berjumlah "+JumlahKursi+"dengan biaya sebesar Rp. "+Biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");
    }

    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui berlabuh dipantai");
    }
}