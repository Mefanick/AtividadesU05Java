import java.util.Scanner;

public class Atividade0505 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        //primeiro numero x + 2
        // segundo numero x * 2;
        //terceiro 1° numero + 2 
        //quarto 2° numero * 2;
        int numeroDeVezes = ler.nextInt();
        int numeroMultiplicado = 8;
        
        for (int i = 1; i < numeroDeVezes; i++) {
            System.out.println(numeroMultiplicado);
            System.out.println((numeroMultiplicado+2));
            numeroMultiplicado *= 2;
        }
    }
}
