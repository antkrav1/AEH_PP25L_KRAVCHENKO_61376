//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class SumaKwadratow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dolna, gorna;

        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            dolna = scanner.nextInt();
            gorna = scanner.nextInt();

            if (gorna <= dolna) {
                System.out.println("Done");
                break;
            }

            int suma = 0;
            for (int i = dolna; i <= gorna; i++) {
                suma += i * i;
            }

            System.out.printf("The sums of the squares from %d to %d is %d%n", dolna, gorna, suma);
        }

        scanner.close();
    }
}