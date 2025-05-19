import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean kontynuuj = true;

        while (kontynuuj) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Wyjście");
            System.out.print("Wybierz opcję (1-5): ");

            int wybor = scanner.nextInt();

            if (wybor < 1 || wybor > 5) {
                System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
                continue;
            }

            if (wybor == 5) {
                System.out.println("Koniec programu.");
                break;
            }

            System.out.print("Podaj pierwszą liczbę: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("To nie jest liczba! Spróbuj ponownie.");
                scanner.next(); // pomija błędne wejście
                continue;
            }
            double a = scanner.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("To nie jest liczba! Spróbuj ponownie.");
                scanner.next();
                continue;
            }
            double b = scanner.nextDouble();

            switch (wybor) {
                case 1 -> System.out.println("Wynik dodawania: " + (a + b));
                case 2 -> System.out.println("Wynik odejmowania: " + (a - b));
                case 3 -> System.out.println("Wynik mnożenia: " + (a * b));
                case 4 -> {
                    if (b == 0) {
                        System.out.println("Nie można dzielić przez zero.");
                    } else {
                        System.out.println("Wynik dzielenia: " + (a / b));
                    }
                }
            }
        }

        scanner.close();
    }
}