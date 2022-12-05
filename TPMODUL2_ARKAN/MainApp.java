public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat1 = new Perangkat("Sandisk",16,2.3);
        perangkat1.information();
        System.out.println("");

        Handphone handphone1 = new Handphone("Sumsang",16,4.9, true);
        handphone1.information();
        handphone1.telfon( 0233322111);
        handphone1.kirimSMS( 022211345);
        handphone1.kirimSMS(0232422455, 0234561111);
        System.out.println("");

        Laptop laptop1 = new Laptop("Kingston",8,3.5, false);
        laptop1.information();
        laptop1.bukaGame( "The Binding of Isaac Repentance");
        laptop1.kirimEmail( "akusukabaghdad@gmail.com");
        laptop1.kirimEmail( "Bangdavaenakbanget@gmail.com", "Bangdavakalodiwasukagkbales@gmail.com");
        System.out.println("");


    }
}
