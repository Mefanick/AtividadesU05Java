import java.util.Scanner;

public class Atividade0905 {
 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("indique a quiantidade de alunios;;;;;");
        int vezes = ler.nextInt();
        int contador = 0;
        String nome = " ";
        int idade = 0;
        for (int i = 1; i <= vezes; i++) {
            System.out.println("Insira a idade do alunio....");
            idade = ler.nextInt();
            System.out.println("insira o nome do alunio......");
            nome = ler.next();

            if (idade == 18) {
                System.out.println(nome);
            }
            if (idade > 20) {
                contador += 1;
            }

        }
        System.out.println(contador);
    }
 }