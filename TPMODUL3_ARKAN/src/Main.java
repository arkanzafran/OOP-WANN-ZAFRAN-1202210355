import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant machine = new Restaurant();
            int customerID, orderQty;
            try {

                System.out.println("Masukkan Customer ID: ");
                customerID = input.nextInt();

                System.out.println("Masukkan ingin membuat berapa makanan: ");
                orderQty = input.nextInt();

                Thread f1 = new Thread(machine);
                Waiters waiter = new Waiters(customerID, orderQty);
                Thread f2 = new Thread(waiter);

                f1.start();
                f2.start();
                f1.join();
                f2.join();

            } catch (Exception e) {
                System.out.println("Input harus menggunakan integer");
            }
        }

    }

}