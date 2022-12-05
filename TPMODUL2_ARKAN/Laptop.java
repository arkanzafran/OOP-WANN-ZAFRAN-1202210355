public class Laptop extends Perangkat{
    protected boolean webcam;
    protected String text;

public Laptop (String drive, int ram, Double processor, boolean webcam){
    super(drive, ram, processor);
    this.webcam = webcam;    
}

    @Override
    public void information() {
        if (webcam==true){
            text = "Terdapat fingerprint";
        }
        else{
            text = "Tidak terdapat fingerprint";
        }
        System.out.println("Laptop ini memiliki drive tipe "+drive+"dengan ram sebesar "+ram+"GB dan processor yang memiliki kecepatan sebanyak "+processor+"Ghz, dan juga laptop ini memiliki "+text);
    }
    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil untuk membuka game "+nama_game);
    }
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil untuk mengirim email kepada "+email);
    }
    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim email kepada "+email1+"dan juga ke "+email2);
    }
}