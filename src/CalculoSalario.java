import java.util.Locale;
import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/pt/problems/view/1008

public class CalculoSalario {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, qtdHorasTrabalhadas;
        double valorHora, salario;

        codigo = sc.nextInt();
        qtdHorasTrabalhadas = sc.nextInt();
        valorHora = sc.nextDouble();
        salario = qtdHorasTrabalhadas * valorHora;

        System.out.println("NUMBER = "+ codigo);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();

    }

}