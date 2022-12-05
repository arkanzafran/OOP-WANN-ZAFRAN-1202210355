public class Handphone extends Perangkat {
    protected boolean fingerprint;
    protected String text;

    public Handphone(String drive, int ram, Double processor, boolean fingerprint) {
        super (drive,ram,processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void information() {
        if (fingerprint==true){
            text = "Terdapat fingerprint";
        }
        else{
            text = "Tidak terdapat fingerprint";
        }
        System.out.println("Handphone ini memiliki drive tipe "+drive+"dengan ram sebesar "+ram+"GB dan processor yang memiliki kecepatan sebanyak "+processor+"Ghz, dan juga handphone ini memiliki "+text);

    }
    public void telfon(int no_hp){
        System.out.println("Handphone ini berhasil untuk menelpon ke nomor "+no_hp);
    }
    public void kirimSMS(int no_hp){
        System.out.println("Handphone ini berhasil untuk mengirimkan SMS ke nomor "+no_hp);
    }
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone ini berhasil untuk mengirimkan SMS ke nomor "+no_hp1+" menggupnakan nomor "+no_hp2);
    }
}
