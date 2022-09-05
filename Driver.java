import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // Instance variables (if needed)
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)
    
    public static void main(String[] args) {
    	
    	String userInput;

        initializeDogList();
        initializeMonkeyList();
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.next().toUpperCase();
        while (userInput != "Q") {
        	if ((userInput != "1") && (userInput != "2") && (userInput != "3") 
        			&& (userInput != "4") && (userInput != "5") && (userInput != "6")) {
        		System.out.println("Invalid Entry");
        		displayMenu();
        		userInput = scanner.next().toUpperCase();
        	}
        		
        	else if (userInput == "1") {
        		intakeNewDog(scanner);
        		break;
        	}
        	else if (userInput == "2") {
        		intakeNewMonkey(scanner);
        		break;
        	}
        	else if (userInput == "3") {
        		reserveAnimal(scanner);
        		break;
        	}
        	else if (userInput == "4") {
        		int number = Integer.parseInt(userInput);
        		printAnimals(number);
        		break;
        	}
        	else if (userInput == "5") {
        		int number = Integer.parseInt(userInput);
        		printAnimals(number);
        		break;
        	}
        	else if (userInput == "6") {
        		int number = Integer.parseInt(userInput);
        		printAnimals(number);
        		break;
        	}
        }
        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey(null, null, null, null, null, null, null, null, null, null, null, false, null);
        Monkey monkey2 = new Monkey(null, null, null, null, null, null, null, null, null, null, null, false, null);
        Monkey monkey3 = new Monkey(null, null, null, null, null, null, null, null, null, null, null, false, null);
        
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the dog's acquisition location?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is the dog reserved?");
        boolean reserved = scanner.nextBoolean();
        System.out.println("What is the dog's service country?");
        String inServiceCountry = scanner.nextLine();
        
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        dogList.add(newDog);
        System.out.println("Dog added to list");

        // Add the code to instantiate a new dog and add it to the appropriate list
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
        	System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }
            System.out.println("What is the monkey's species?");
            String species = scanner.nextLine();
            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();
            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();
            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();
            System.out.println("What is the monkey's height?");
            String height = scanner.nextLine();
            System.out.println("What is the monkey's tail length?");
            String tail = scanner.nextLine();
            System.out.println("What is the monkey's body length?");
            String body = scanner.nextLine();
            System.out.println("What is the monkey's acquisition date?");
            String date = scanner.nextLine();
            System.out.println("What is the monkey's acquisition location?");
            String country = scanner.nextLine();
            System.out.println("What is the monkey's training status?");
            String training = scanner.nextLine();
            System.out.println("Is the monkey reserved?");
            boolean reserved = scanner.nextBoolean();
            System.out.println("What is the monkey's service country?");
            String service = scanner.nextLine();
            
            Monkey newMonkey = new Monkey(name, species, gender, age, weight, height, tail, body, date, country, training, reserved, service);
            monkeyList.add(newMonkey);
            System.out.println("Monkey added to list");
        }

       
	

		// Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	scanner.nextLine();
            System.out.println("Enter animal type: ");
            String animalType = scanner.nextLine();
            if (animalType.equalsIgnoreCase("Monkey")) {
                System.out.println("Enter the monkey's country of acquisiton: ");
                String country = scanner.nextLine();
                for(Monkey obj: monkeyList) {
                    if(obj.getAcquisitionLocation().equalsIgnoreCase(country)) {
                        obj.setReserved(true);
                        System.out.println("This monkey is now reserved.");
                        return;
                    }
                }
                System.out.println("The monkey entered is not in the list");
            }
            else if (animalType.equalsIgnoreCase("Dog")) {
                    System.out.println("Enter the dog's country of acquisition: ");
                    String country = scanner.nextLine();
                    for(Dog obj: dogList){
                    if(obj.getAcquisitionLocation().equalsIgnoreCase(country)){
                        obj.setReserved(true);
                        System.out.println("This dog is now reserved.");
                        return;
                    }

                }
                System.out.println("The dog entered is not in the list");
                }  else {
                System.out.println("Type not found");
                }
        
        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(int option) {
        	if (option == '4') {
                System.out.println(dogList);
            }
            else if (option == '5') {
                System.out.println(monkeyList);
            }
            else if (option == '6') {
                // Iterates through dogs
                for (int i = 0; i < dogList.size(); i++) {
                    if (dogList.get(i).getTrainingStatus().equals("in service") && 
            dogList.get(i).getReserved()==false) {
                        // Prints dogs that are in service and available
                        System.out.println(dogList.get(i));
                    }
                
                }
                // Iterates through monkeys
                for (int i = 0; i < monkeyList.size(); i++) {
                    if (monkeyList.get(i).getTrainingStatus().equalsIgnoreCase("in service") && 
                monkeyList.get(i).getReserved()==false) {
                        // Prints monkeys that are in service and available
                        System.out.println(monkeyList.get(i));
                    }
                }

        }
}
}

