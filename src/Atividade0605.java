import java.util.Scanner;

public class Atividade0605 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double altura = 0;
        double contador = 0;
        
        double divisor = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("altura da %d° pessoa...", i);
            altura = ler.nextDouble();
            contador += altura;
            divisor = i;
        }
        double media = contador/divisor;

        System.out.printf("a média é de %.2f.", media);
    }
}
