package project;

public class Monkey extends RescueAnimal{
    private String species;
    private String breed;
    private String tailLength;
    private String height;
    private String bodyLength;
    //making all of the 

    // enum is a special Java type used to define collections of constants
public enum species{
	Capuchin, Guenon, Macaque, marmoset, SquirrelMonkey, Tamarin
	}
 
//constructor
public Monkey(String name, String gender, String age, String species , String height, 
		String tailLength, String bodyLength,
		String acquisitionDate, String acquisitionCountry, String trainingStatus, 
		boolean reserved, String inServiceCountry) {
    name = "";
    gender ="";
    age = "";
	species = "Capuchin";
    
    tailLength = "0.0";
    height = "0.0";
    bodyLength = "0.0";
    acquisitionDate = "";
    acquisitionCountry = "";
    trainingStatus = "";
    reserved = true;
    inServiceCountry = "";
}
    
public Monkey(String monkeySpecies, String monkeyBreed, String monkeyTailLength, String monkeyHeight, String
monkeyBodyLength, String name, String gender, String age, String weight, String acquisitionDate, String
acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry) {
	{
//setting the names of the variables for entry
		setName(name);
		setAnimalType("Monkey");
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		setSpecies(species);
		setTailLength("tailLength");
		setHeight(height);
		setBodyLength(bodyLength);

		}
}



String getSpecies() {
    return species;
}
String getBreed() {
    return breed;
}
String getTailLength() {
    return tailLength;
}
String getHeight() {
    return height;
}
String getBodyLength() {
    return bodyLength;
}

void setSpecies(String monkeySpecies) {
    this.species = monkeySpecies;
}
void setBreed(String monkeyBreed) {
    this.breed = monkeyBreed;
}
void setTailLength(String monkeyTailLength) {
    this.tailLength = monkeyTailLength;
}
void setHeight(String monkeyHeight) {
    this.height = monkeyHeight;
}
void setBodyLength(String monkeyBodyLength) {
    this.bodyLength = monkeyBodyLength;
}
}

