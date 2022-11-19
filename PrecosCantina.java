package listaSwitchCase;

import java.util.Scanner;

public class precosCantina {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o código do produto da cantina:");
        int codigo = leitura.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Cachorro quente, custa: R$8,00");
                break;
            case 2:
                System.out.println("Cheeseburger, custa: R$12,00");
                break;
            case 3:
                System.out.println("X-Salada, custa: R$15,00");
                break;
            case 4:
                System.out.println("Misto quente, custa: R$11,00");
                break;
            case 5:
                System.out.println("Pão na chapa, custa: R$6,00");
                break;
            default:
                System.out.println("Código é inválido!");
        }

	}

}
 