import java.lang.Math;

public class Atividade1105 {
    public static void main(String[] args) {
        double cookieQebrados = 0;   

        for (double i = 0; i < 16; i++) {
            if (i == 0) {
                cookieQebrados+= 1;
            } else {
                cookieQebrados = cookieQebrados + (Math.pow(3, i));
                
            }
        }
        System.out.println("A quantidade de cookies quebrados em 16 horas é de: " + cookieQebrados);
    }
}
