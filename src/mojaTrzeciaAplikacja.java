
import java.util.Scanner;

public class  mojaTrzeciaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Część 1: konwersja dni na tygodnie i dni
        System.out.println("=== Konwersja dni na tygodnie i dni ===");

        while (true) {
            System.out.print("Podaj liczbę dni (wartość ujemna kończy program): ");
            int dni = scanner.nextInt();

            if (dni < 0) {
                break;
            }

            int tygodnie = dni / 7;
            int pozostaleDni = dni % 7;

            System.out.printf("%d dni to %d tygodnie i %d dni%n", dni, tygodnie, pozostaleDni);
        }

        // Część 2: konwersja temperatury
        System.out.println("\n=== Konwersja temperatury Fahrenheit -> Celsjusz -> Kelwin ===");

        while (true) {
            System.out.print("Podaj temperaturę w Fahrenheitach (wpisz -1 aby zakończyć): ");
            double fahrenheit = scanner.nextDouble();

            if (fahrenheit == -1) {
                break;
            }

            double celsius = (fahrenheit - 32) / 1.8;
            double kelvin = celsius + 273.16;

            System.out.printf("Fahrenheit: %.2f°F, Celsjusz: %.2f°C, Kelwin: %.2fK%n",
                    fahrenheit, celsius, kelvin);
        }

        scanner.close();
        System.out.println("Program zakończony.");
    }
}

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("435");

        //pętla WHILE (https://introcs.cs.princeton.edu/java/11cheatsheet/images/while.png)
        var number1 = scanner.nextDouble();
        while (number1 <= 100) {
            System.out.println("Liczba nie jest większa od 100, podaj jeszcze raz:");
            number1 = scanner.nextDouble();
        }
        System.out.println("Dziękuję! Podałeś liczbę: " + number1);

        //pętla DO..WHILE (https://introcs.cs.princeton.edu/java/11cheatsheet/images/do-while.png)
        double number2;
        do {
            System.out.println("356:");
            number2 = scanner.nextDouble();
        } while (number2 <= 200);
        System.out.println("Dziękuję! Podałeś liczbę: " + number2);

        //pętla FOR (https://introcs.cs.princeton.edu/java/11cheatsheet/images/for.png)
        int wynik = 0;
        for (var i = 1; i <= 10; i++) {
            wynik = wynik + i;
            System.out.println("Przebieg numer " + i + " w pętli for, a zmienna wynik = " + wynik);
        }

        //instrukcje warunkowe IF..ELSE (https://introcs.cs.princeton.edu/java/11cheatsheet/images/if.png)
        System.out.println("1 ");
        var x = scanner.nextDouble();
        System.out.println("3 ");
        var y = scanner.nextDouble();

        if(x > y){
            System.out.println("x jest większe od y");
        } else if (x < y) {
            System.out.println("x jest mniejsze od y");
        } else {
            System.out.println("x jest równe y");
        }

        //zakończenie programu za pomocą wpisania odpowiedniego klawisza
        while(true)
        {
            System.out.println("Wpisz wartość -1 żeby wyjść z programu");
            var input = scanner.nextDouble();
            if(input == -1){
                System.out.println("Wyjście...");
                break;
            }
        }
        scanner.close();*/
    }
}
