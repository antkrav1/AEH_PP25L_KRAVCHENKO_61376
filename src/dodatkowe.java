//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class dodatkowe {
    public static void main(String[] args) {
        int[] wylosowane = new int[6];
        int[] uzytkownik = new int[6];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        Set<Integer> zbior = new HashSet<>();

        // Losowanie 6 różnych liczb z przedziału 1–49
        while (zbior.size() < 6) {
            zbior.add(rand.nextInt(49) + 1);
        }

        int i = 0;
        for (int liczba : zbior) {
            wylosowane[i++] = liczba;
        }

        // Wczytanie 6 różnych liczb od użytkownika
        Set<Integer> zbiorUzytkownika = new HashSet<>();
        System.out.println("Podaj 6 różnych liczb z przedziału 1-49:");
        while (zbiorUzytkownika.size() < 6) {
            try {
                int liczba = Integer.parseInt(scanner.nextLine());
                if (liczba < 1 || liczba > 49) {
                    System.out.println("Liczba spoza zakresu. Spróbuj ponownie.");
                } else if (!zbiorUzytkownika.add(liczba)) {
                    System.out.println("Liczba już została podana. Podaj inną.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowy format. Wpisz liczbę.");
            }
        }

        i = 0;
        for (int liczba : zbiorUzytkownika) {
            uzytkownik[i++] = liczba;
        }

        // Porównanie i zliczenie wspólnych liczb
        int trafienia = 0;
        for (int a : wylosowane) {
            for (int b : uzytkownik) {
                if (a == b) {
                    trafienia++;
                }
            }
        }

        // Wyświetlenie wyników
        System.out.println("Wylosowane liczby: " + Arrays.toString(wylosowane));
        System.out.println("Twoje liczby: " + Arrays.toString(uzytkownik));
        System.out.println("Liczba trafień: " + trafienia);
    }
}