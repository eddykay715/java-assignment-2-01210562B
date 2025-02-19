package q4;

import java.util.Scanner;

public class DCMotorSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Input Voltage (V): ");
        double voltage = scanner.nextDouble();
        System.out.print("Enter Back EMF (V): ");
        double backEMF = scanner.nextDouble();
        System.out.print("Enter Motor Constant (V/rpm): ");
        double motorConstant = scanner.nextDouble();

        if (motorConstant <= 0) {
            System.out.println("Motor constant must be greater than zero.");
        } else if (voltage < backEMF) {
            System.out.println("Back EMF cannot be greater than input voltage.");
        } else {
            double speed = (voltage - backEMF) / motorConstant;
            System.out.println("Motor Speed = " + speed + " RPM");
        }

        scanner.close();
    }
}


