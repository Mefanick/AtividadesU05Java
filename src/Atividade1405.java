import java.util.Scanner;

public class Atividade1405 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int mercadorias = 2;
        // mercadorias tem, nome, preço de compra e preço de venda
        double precoCompra = 0;
        double precoVenda = 0;
        double lucro = 0;
        double porcentagemLucro = 0;
        int contador1, contador2, contador3;
        contador1 = 0;
        contador2 = 0;
        contador3 = 0;
        double totalVendas = 0;
        double totalCompras = 0;
        double lucroTotal = 0;

        for (int i = 1; i <= mercadorias; i++) {
            //(PV - PC) / PC * 100  
            System.out.printf("escreva o valor da compra da %d° mercadoria%n", i);
            precoCompra = ler.nextDouble();
            System.out.printf("escreva o valor da venda da %d° mercadoria%n", i);
            precoVenda = ler.nextDouble();

            lucro = (precoVenda - precoCompra);
            porcentagemLucro = (lucro * 100) / precoCompra;
            totalVendas += precoVenda;
            totalCompras += precoCompra;
            lucroTotal += lucro;

            if(porcentagemLucro < 10){
                contador1 += 1;
            } else if (porcentagemLucro >= 10 && porcentagemLucro <= 20) {
                contador2 += 1;
            } else {
                contador3 += 1;
            }
        }
        System.out.println("A quantidade de produtos que deram lucro menor que 10% é de : " + contador1);
        System.out.println("A quantidade de produtos que deram lucro maior ou igual a 10% e menor ou igual a 20% é de : " + contador2);
        System.out.println("A quantidade de produtos que deram lucro maior que 20% é de : " + contador3);
        System.out.printf("O valor total de vendas é de %.2f, o valor total de compras é de %.2f e o valor total do lucro é de %.2f.", totalVendas, totalCompras,lucroTotal);
    }
}
