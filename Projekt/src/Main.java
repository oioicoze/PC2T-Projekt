import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vítejte v aplikaci správy knihovny!");

        // Vytvoření databáze
        System.out.println("\nVytvořit databázi? (ano/ne)");
        String createDBChoice = scanner.nextLine();
        if (createDBChoice.equalsIgnoreCase("ano")) {
            CreateDatabase.createTables();
        }
        
        //CreateDatabase.createTables();

        while (true) {
            System.out.println("\nVyberte akci:");
            System.out.println("1. Přidat novou knihu");
            System.out.println("2. Ukončit program");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character from the buffer

            switch (choice) {
                case 1:
                    //addNewBook(scanner);
                    break;
                case 2:
                    System.out.println("Program ukončen.");
                    System.exit(0);
                default:
                    System.out.println("Neplatná volba, zkuste to znovu.");
            }
        }
    }
    /*
    public static void addNewBook(Scanner scanner) {
        System.out.println("\nVyberte typ knihy:");
        System.out.println("1. Román");
        System.out.println("2. Učebnice");

        int bookType = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character from the buffer

        String title, author, availability;
        int year;

        System.out.println("Zadejte název knihy:");
        title = scanner.nextLine();

        System.out.println("Zadejte jméno autora:");
        author = scanner.nextLine();

        System.out.println("Zadejte rok vydání:");
        year = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character from the buffer

        System.out.println("Zadejte stav dostupnosti (k dispozici / vypůjčeno):");
        availability = scanner.nextLine();

        if (bookType == 1) {
            String genre;
            System.out.println("Zadejte žánr románu:");
            genre = scanner.nextLine();

            Novel novel = new Novel(title, author, year, availability, genre);
            DatabaseOperations.addBook(novel);
        } else if (bookType == 2) {
            int gradeLevel;
            System.out.println("Zadejte pro jaký ročník je učebnice vhodná:");
            gradeLevel = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character from the buffer

            Textbook textbook = new Textbook(title, author, year, availability, gradeLevel);
            DatabaseOperations.addBook(textbook);
        } else {
            System.out.println("Neplatná volba, kniha nebyla přidána.");
        }
    }*/
}

