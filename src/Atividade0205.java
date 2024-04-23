import java.util.Scanner;

public class Atividade0205 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 ) {
                contadorPar += i;
            } else {
                contadorImpar += i;
            }
        }
        System.out.println(contadorPar);
        System.out.println(contadorImpar);
    }

}
