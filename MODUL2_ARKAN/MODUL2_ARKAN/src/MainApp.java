public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir TransportasiAir1 = new TransportasiAir(5,500);
        TransportasiAir1.information();
        System.out.println("");

        Sampan Sampan1 = new Sampan(5,500,4);
        Sampan1.information();
        Sampan1.berlayar();
        Sampan1.berlabuh( 2);
        Sampan1.berlabuh();
        System.out.println("");

        Kapal Kapal1 = new Kapal(3,5,"Diesel");
        Kapal1.information();
        Kapal1.berlayar();
        Kapal1.berlayar( 500);
        Kapal1.berlabuh( );
        System.out.println("");


    }
}
