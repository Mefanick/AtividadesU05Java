import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade0305 {
    public static void main(String[] args) {

        DecimalFormat deci = new DecimalFormat("0.00");
        Scanner ler = new Scanner(System.in);
        
        double contador = 0;

        for (int i = 1; i <= 100; i++) {
            contador =  contador + (float) 1/i;
        }
        System.out.println(deci.format(contador));
    }
}
