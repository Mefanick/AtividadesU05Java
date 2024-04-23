import java.util.Scanner;

public class Atividade0105 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero = ler.nextInt();

        for (int i = 0; i <= 20; i++) {
            if (numero %2 == 0 ) {
                System.out.printf("O numero %d é par%n", numero);
            } else {
                System.out.printf("O numero %d é ímpar%n", numero);                
            }
            numero++;
        }
    }
}
