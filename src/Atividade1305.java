import java.util.Scanner;

public class Atividade1305 {
    public static void main(String[] args) {
        
        /*
         * quando sai = tanque cheio
        quando volta = tanque cheio registra medidas omodromo
        cada parada feita = valor orodromo e quantidade combustivel comprado para reabastecer
        leia o número total de reabastecimentos feitos e os dados registrados relativos à compra de combustíve

        - a quilometragem obtida por litro de combustível em cada parada;  
        - a quilometragem média obtida por litro de combustível em toda a viagem.  
       
         */

         Scanner ler = new Scanner(System.in);

        int paradasFeitas = ler.nextInt();
        double combustivelColocado = 0;
        Double distanciaPercorrida = 0.0;
        double autonomia = 0;
        double contador = 0;
        double media = 0;


        for (int i = 1; i <= paradasFeitas; i++) {
            System.out.printf("Digite a quantidade de combustivel colocado na %d° viagem...", i);
            combustivelColocado = ler.nextDouble();
            System.out.printf("Digite a distancia percorrida na %d° viagem...", i);
            distanciaPercorrida = ler.nextDouble();
            autonomia = distanciaPercorrida / combustivelColocado;
            contador += autonomia;
            media = contador/i;
            System.out.printf("durante as viagens, a autonomia do carro é de %.2f km/L e a média das %d viagens feitas até o momento é de %.2f%n", autonomia, i, media);
    }
    System.out.printf("durante as %d viagens a média foi de %.2f!", media);
}
}
