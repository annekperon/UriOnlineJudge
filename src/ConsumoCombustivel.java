import java.util.Locale;
import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/pt/problems/view/1014

public class ConsumoCombustivel {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distanciaTotal;
        double totalCombustivel, gasto;

        distanciaTotal = sc.nextInt();
        totalCombustivel = sc.nextDouble();
        gasto = distanciaTotal / totalCombustivel;

        System.out.printf("%.3f km/l%n", gasto);

        sc.close();

    }

}
