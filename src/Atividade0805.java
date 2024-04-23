import java.util.Scanner;

public class Atividade0805 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numeroInt = ler.nextInt();

        int inteiroLido = 0;

        int contadorNegativo = 0;
        double contadorPositivo = 0;
        int divisor = 0;

        for (int i = 1; i <= numeroInt; i++) {
            divisor = i;
            System.out.printf("O %d° numero inteiro é...%n", i);
            inteiroLido = ler.nextInt();
            if (inteiroLido >= 0) {
                contadorPositivo += inteiroLido;
            } else if(inteiroLido <= contadorNegativo){
                contadorNegativo = inteiroLido;
            }
        }
        double media = contadorPositivo / divisor;

        if (contadorNegativo == 0) {
            System.out.printf("O menor valor negativo e a média de %d inteiros lidos é respectivamente, Nenhum e %.2f", divisor, media);
        } else{
            System.out.printf("O menor valor negativo e a média de %d inteiros lidos é respectivamente, %d e %.2f", divisor, contadorNegativo, media);
        }
        
    }
}
