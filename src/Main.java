import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      /*  ZooManagement myZoo = new ZooManagement();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Entrez le nom de votre zoo:");

            String name = sc.nextLine();
            myZoo.setZooName(name);
        }while(myZoo.getZooName()==null);
        System.out.println("Entrez le nombre de cages:");
        int numCages = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                numCages = sc.nextInt();
                if (numCages>0) {
                    validInput = true;
                }
                else
                    System.out.println("Entrez une valeur positive");
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrez un valeur valide.");
                sc.nextLine();
            }
        }
        myZoo.setNumberOfCages(numCages);
        System.out.println(myZoo.getZooName() + " comporte de " + myZoo.getNumberOfCages() + " cages.");
        sc.close();*/
       // Animal lion=new Animal("Lion","Lion",10,true);

        Zoo myZoo=new Zoo(25,"MyZoo","Tunis",20);
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        do{
        System.out.println("Zoo Menu");


        System.out.println("1. Add animal | 2. Delete animal | 3. Display animals | 4. Leave");

        System.out.print("Select your choice : ");
        choix = scanner.nextInt();
        switch (choix) {
            case 1:
                System.out.print("Family : ");
                String family = scanner.next();
                System.out.print("Nom: ");
                String name = scanner.next();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                System.out.print("Is the animal a mammal (true or false): ");
                boolean isMammal = scanner.nextBoolean();

                Animal animal = new Animal(family, name, age, isMammal);

                myZoo.addAnimal(animal);
                break;
            case 2:
                System.out.println("Animal ID :");
                int id = scanner.nextInt();
                System.out.println(myZoo.animals[id]);
                myZoo.removeAnimal(myZoo.animals[id]);
                break;
            case 3:
                myZoo.displayAnimals();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid selection");
                break;
        }
        }while(choix!=4);


        /*
        if (myZoo.addAnimal(lion))
            System.out.println("Animal added successfully");
        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(lion));
        myZoo.removeAnimal(lion);
        System.out.println(myZoo.searchAnimal(lion));
        */
    }
        /*
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }*/
    }