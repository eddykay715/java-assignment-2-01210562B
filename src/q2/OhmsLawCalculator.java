package q2;

import java.util.Scanner;

public class OhmsLawCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which parameter is unknown? (Voltage/Current/Resistance)");
        String choice = scanner.next().toLowerCase();

        double voltage = 0, current = 0, resistance = 0;

        switch (choice) {
            case "voltage":
                System.out.print("Enter Current (A): ");
                current = scanner.nextDouble();
                System.out.print("Enter Resistance (Ω): ");
                resistance = scanner.nextDouble();
                voltage = current * resistance;
                System.out.println("Voltage = " + voltage + "V");
                break;
            case "current":
                System.out.print("Enter Voltage (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Resistance (Ω): ");
                resistance = scanner.nextDouble();
                if (resistance == 0) {
                    System.out.println("Resistance cannot be zero.");
                } else {
                    current = voltage / resistance;
                    System.out.println("Current = " + current + "A");
                }
                break;
            case "resistance":
                System.out.print("Enter Voltage (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Current (A): ");
                current = scanner.nextDouble();
                if (current == 0) {
                    System.out.println("Current cannot be zero.");
                } else {
                    resistance = voltage / current;
                    System.out.println("Resistance = " + resistance + "Ω");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

