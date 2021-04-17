import java.util.Locale;
import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/pt/problems/view/1016

public class DistanciaEntreCarros {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distanciaEmKm, resultado;

        distanciaEmKm = sc.nextInt();
        resultado = 2 * distanciaEmKm;

        System.out.println(resultado + " minutos");

        sc.close();
    }
}