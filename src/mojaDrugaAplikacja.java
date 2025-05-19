//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class mojaDrugaAplikacja {
        public static void main(String[] args) {
            double x = 10;
            double y = 2;
            Scanner scanner = new Scanner(System.in);
            var result = x + y;
            System.out.println("x + y =" + result);
            result = x - y;
            System.out.println("xy=" + result);
            result = x*y;
            System.out.println("xy=" + result);
            result = x/y;
            System.out.println("x/y = " + result);
            result = x % y;
            System.out.println("xy=" + result);
            System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter:");
            double first=scanner.nextDouble(); //prośba o wpisanie wartości typu double
            double second=scanner.nextDouble();
            System.out.println("x+y=" + (first + second));
        }
}