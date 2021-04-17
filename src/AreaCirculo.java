import java.util.Locale;
import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/pt/problems/view/1002

public class AreaCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio, area;
        raio = sc.nextDouble();
        area = pi * raio * raio;

        System.out.printf("A=%.4f%n", area);

        sc.close();

    }
}