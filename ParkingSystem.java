import java.util.*;

public class ParkingSystem {
    private Stack<Integer> driveway; // Stack for the driveway
    private Queue<Integer> street;   // Queue for the street

    public ParkingSystem() {
        driveway = new Stack<>();
        street = new LinkedList<>();
    }

    // Add a car to the driveway
    public void parkCar(int carLicensePlate) {
        driveway.push(carLicensePlate);
        System.out.println("Car with license plate " + carLicensePlate + " is parked in the driveway.");
    }

    // Remove a car from the driveway
    public void retrieveCar(int carLicensePlate) {
        if (driveway.isEmpty()) {
            System.out.println("Driveway is empty.");
            return;
        }

        // Check if the requested car is the last one in the driveway
        if (driveway.peek() == carLicensePlate) {
            System.out.println("Car with license plate " + carLicensePlate + " is retrieved from the driveway.");
            driveway.pop();
        } else {
            // Move cars blocking the requested car to the street
            while (!driveway.isEmpty() && driveway.peek() != carLicensePlate) {
                street.offer(driveway.pop());
            }

            if (driveway.isEmpty()) {
                System.out.println("Car with license plate " + carLicensePlate + " not found in the driveway.");
            } else {
                System.out.println("Car with license plate " + carLicensePlate + " is retrieved from the driveway.");
                driveway.pop();
            }

            // Move cars from the street back to the driveway
            while (!street.isEmpty()) {
                driveway.push(street.poll());
            }
        }
    }

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem();

        parkingSystem.parkCar(123);
        parkingSystem.parkCar(456);
        parkingSystem.parkCar(789);

        parkingSystem.retrieveCar(456); // Retrieve the second car
        parkingSystem.retrieveCar(999); // Try to retrieve a non-existent car
    }
}
