import java.text.DecimalFormat;

public class Atividade0405 {
    public static void main(String[] args) {
        DecimalFormat deci = new DecimalFormat("0.00");
        double numeroCima = 3;
        double numeroBaixo = 2;
        double contador = 0;
        //numerocimanovo = numerocima + 2;
        //numerobaixonovo = numerobaixo + 2. 
        for (int i = 1; i <= 20; i++) {
            contador += (double) (numeroCima/numeroBaixo);
            numeroCima += 2;
            numeroBaixo += 2 + (2 * i);
        }
        System.out.println(contador);
    }
}
