class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Registration Fee: " + registrationFee);
    }
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        System.out.println("---- Updating Registration Fee ----");
        Vehicle.updateRegistrationFee(7000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
