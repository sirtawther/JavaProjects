import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        int P = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annual_rate = scanner.nextDouble();
        double r = annual_rate / 1200 ;
        System.out.print("Peroid (Years): ");
        byte peroid = scanner.nextByte();
        int n = peroid * 12;
        double M = P * r * (Math.pow(1+r,n)) / (Math.pow(1+r,n) - 1);
        System.out.print("Mortgage: ");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        String result = currencyInstance.format(M);
        System.out.print(result);

    }
}
