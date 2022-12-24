public class Restaurant implements Runnable {

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    @Override
    public void run() {
        while (true) {
            makefood();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public int getfoodNumber() {
        return foodNumber;
    }

    public void makefood() {
        synchronized(Restaurant.lock) {
            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant : Menunggu waiter untuk mengantarkan makanannya");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            waitingForPickup = true;
            System.out.println("Restaurant : Membuat makanan nomor urut " + foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Memberitahukan ke waiter untuk mengambil makanannya\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}