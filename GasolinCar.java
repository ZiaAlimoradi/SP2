public class GasolinCar extends AFuelCar {
    private String fuelType;

    public GasolinCar(String registrationNumber, String make, String model, int doors, int kmPrLitre, String fuelType) {
        super(registrationNumber, make, model, doors, kmPrLitre);
        this.fuelType = fuelType;

    }


    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getNumberOfDoors() {
        return 0;
    }

    public int getRegistrationFee() {
        if (KmPrLitre >= 20 && KmPrLitre <= 50) {
            return 330;
        } else if (KmPrLitre >= 15 && KmPrLitre < 20) {
            return 1050;
        } else if (KmPrLitre >= 10 && KmPrLitre < 15) {
            return 2340;
        } else if (KmPrLitre >= 5 && KmPrLitre < 10) {
            return 5500;
        } else {
            return 10470;
        }
    }
    String getFuelType(){
        return this.fuelType;
    }


    @Override
    public String toString() {
        return super.toString() + "Brand: " + getMake() + ", Model: " + getModel() + ", Number of Doors: " + getNumberOfDoors()
                + ", Number Plate: " + getRegistrationNumber() + ", Km/Liter: " + KmPrLitre + ", Fuel Type: " + getFuelType()
                + "\n" + "Registration Fee: " + getRegistrationFee() + "\n";
    }
}
