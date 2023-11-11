// abstract class that implements the Car interface
public abstract class ACar implements Car {

    private String registrationNumber;
    private final String make ;
    private final String model;
    private final int getNumberOfDoors;
    private int i = 0;
    private static int z = 0;




// constructor to initialize instance variables
    public ACar ( String registrationNumber,String make, String model,int doors) {

        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.getNumberOfDoors = doors;
        z++;
        this.i=z;

    }
    //getter  method
    public String getRegistrationNumber(){

        return this .registrationNumber;
    }
    public String getMake(){

        return this .make;
    }
    public String getGetModel(){

        return this.model;
    }
    public int getGetNumberOfDoors(){

        return this.getNumberOfDoors;
    }
// catch errors
    @Override
public String toString() {
        return "\n" + "\n" + "Car:"+i;
    }
}









