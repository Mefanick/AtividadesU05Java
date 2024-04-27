import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Atividade1005 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("00");
        //Fiz o L
        double numero = 0;
        double contador = 0;
        double potencia = 0;
        String ultimos = " ";
        int i = 0;
        while (contador <= 10) {
            i += 5;
            numero = (i + 25);
            potencia = Math.pow(numero, 2);
            String text = String.valueOf((int)potencia);
            ultimos = text.substring(text.length()-3);
            if (ultimos.equals("025")) {
                contador += 1;
                System.out.printf("%.0f%n",potencia);
                System.out.printf("%d + 25 = %.0f² = %.0f%n%n", i, numero, potencia);
            }
        }
    }
}