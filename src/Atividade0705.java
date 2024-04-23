import java.util.Scanner;
import java.lang.Math;

public class Atividade0705 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("escreva um número inteiro");
        int numeroInt = ler.nextInt();
        double numeroReal = 0;
        double maiorNumero = 0;
        double menorNumero = 0;

        for (int i = 1; i <= numeroInt; i++) {
            System.out.printf("informe o %d° número real:%n", i);
            numeroReal = ler.nextDouble();
            if (i == 1) {
                maiorNumero = numeroReal - 1;
                menorNumero = numeroReal + 1;
            }
            if (numeroReal >= maiorNumero) {
                maiorNumero = numeroReal;
            }
            if (numeroReal <= menorNumero) {
                menorNumero = numeroReal;
            }
            System.out.printf("até agora, o menor número é %.2f e o maior número é %.2f:%n", menorNumero, maiorNumero);
        }

        System.out.printf("Finalizando, o maior e o menor numero dos %d números informados são respectivamente, %.2f e %.2f.", numeroInt, maiorNumero, menorNumero);

    }
}
