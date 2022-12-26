import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Calculation calculation = new Calculation();

            boolean keepGoing = true;
            while (keepGoing) {
                System.out.println("Choose an option:");
                System.out.println("1. Calculate the area of a square");
                System.out.println("2. Calculate the area of a circle");
                System.out.println("3. Calculate the area of a trapezoid");
                System.out.println("4. Exit");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the side length of the square: ");
                        double squareSide = scanner.nextDouble();
                        calculation.setSquare(squareSide);
                        double squareArea = calculation.getSquare();
                        System.out.println("The area of the square is: " + squareArea);
                        break;
                    case 2:
                        System.out.println("Enter the radius of the circle: ");
                        double circleRadius = scanner.nextDouble();
                        calculation.setCircle(circleRadius);
                        double circleArea = calculation.getCircle();
                        System.out.println("The area of the circle is: " + circleArea);
                        break;
                    case 3:
                        System.out.println("Enter the side length of the top of the trapezoid: ");
                        double trapezoidA = scanner.nextDouble();
                        System.out.println("Enter the side length of the bottom of the trapezoid: ");
                        double trapezoidB = scanner.nextDouble();
                        System.out.println("Enter the height of the trapezoid: ");
                        double trapezoidT = scanner.nextDouble();
                        calculation.setTrapezoid(trapezoidA, trapezoidB, trapezoidT);
                        double trapezoidArea = calculation.getTrapezoid();
                        System.out.println("The area of the trapezoid is: " + trapezoidArea);
                        break;
                    case 4:
                        keepGoing = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                        break;
                }
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
