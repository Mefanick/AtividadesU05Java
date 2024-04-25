import java.util.Scanner;

public class Atividade1205 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int inteiro = ler.nextInt();
        int numeroAnterior = 1;
        int linha = 1;
        for (int i = 1; i <= inteiro; i++) {
            if (i <= 10) {
                System.out.print(i + "  ");
            } else {
                System.out.print(i + " ");
            }
            if (numeroAnterior == i) {
                linha+=1;
                System.out.println();
                numeroAnterior += linha;
            }
        }
    }
}
