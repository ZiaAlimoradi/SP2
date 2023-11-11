abstract class AFuelCar extends ACar {   // nedarve fra ACar
    int KmPrLitre;
    private int car = 0;
    private static int i = 0;

    public AFuelCar(String registrationNumber, String make, String model, int doors,int KmParLiter) {
        super(registrationNumber, make, model, doors);
        this.KmPrLitre= KmParLiter;
        i++;
        car = i;
    }

    abstract String getFuelType();

    public int getKmPrlitre() {
        return this.KmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }
}










