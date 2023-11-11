public class DieselCar AFuelCar { // nedarve fra AFuelCar

    private final String fuelType;
    public boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int doors,int KmParLiter, String fuelType,boolean particleFilter) {
        super(registrationNumber, make, model, doors, KmParLiter);
        this.fuelType = fuelType;
        this.particleFilter = particleFilter;

    }


    String getFuelType(){
        return this.fuelType;

    }
    public int getRegistrationFee() {

        if (KmPrLitre >= 20 && KmPrLitre <= 50 && particleFilter) {
            return 130 + 100;
        } else if (KmPrLitre >= 15 && KmPrLitre < 20 && particleFilter) {
            return 1390 + 1000;
        } else if (KmPrLitre >= 10 && KmPrLitre < 15 && particleFilter) {
            return 1850 + 1000;
        } else if (KmPrLitre >= 5 && KmPrLitre < 10 && particleFilter) {
            return 2770 + 1000;
        } else {
            return 15260 + 1000;

        }

    }
        @Override
        public String toString () {
            return super.toString() + "Brand: " + getMake() + ", Model: " + getModel() + ", Number of Doors: " + getNumberOfDoors() + ", Km/Liter: " + KmPrLitre
                    + ", Number Plate: " + getRegistrationNumber() + ", Fuel Type: " + getFuelType()
                    + ", Particle filter status: " + particleFilter
                    + "\n" + "Registration Fee: " + getRegistrationFee() + "\n";


        }
    }


