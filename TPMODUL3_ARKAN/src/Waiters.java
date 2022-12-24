public class Waiters implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int foodPrice = 17500;

    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run() {
        while (true) {
            getfood();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID : " + this.customerID);
        System.out.println("Jumlah Makanan : " + this.orderQty);
        System.out.println("Total Harga : " + this.orderQty * foodPrice);
        System.out.println("==========================================================");
    }

    public void getfood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter: Makanan sudah diantarkan");
            Restaurant Restaurant = new Restaurant();
            Restaurant.setWaitingForPickup(false);

            if (Restaurant.getfoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Memberitahukan ke restaurant untuk membuat makanan baru\n");

        }
    }
}