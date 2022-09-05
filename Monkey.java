

public class Monkey extends RescueAnimal {

    // Instance variable
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    // Constructor

    public Monkey(String name, String monkeySpecies, String gender, String age,
    String weight, String height, String tailLength, String bodyLength, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setSpecies(monkeySpecies);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setHeight(height);
        setTailLength(tailLength);
        setBodyLength(bodyLength);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    // Accessor Method
    public String getSpecies() {
        return species;
    }
    public String getHeight() {
        return height;
    }
    public String getTailLength() {
        return tailLength;
    }
    public String getBodyLength() {
        return bodyLength;
    }

    // Mutator Method
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }
    public void setHeight(String monkeyHeight) {
        height = monkeyHeight;
    }
    public void setTailLength(String monkeyTail) {
        tailLength = monkeyTail;
    }
    public void setBodyLength(String monkeyBody) {
        bodyLength = monkeyBody;
    }
}
