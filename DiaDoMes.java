package listaSwitchCase;
import java.util.Scanner;
public class diaDoMes {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int m;
		System.out.println("Digite o número correspondente a um mês qualquer para saber quantos dias ele tem: ");
			m = in.nextInt();
			switch(m) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:	
				case 10:
				case 12:
					System.out.println("Esse  mês tem 31 dias");
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("Esse  mês tem 30 dias");
					break;
				case 2:
					System.out.println("Esse  mês tem 28 dias");
					break;
				default:
					System.out.println("Mês inválido!");
	   }
    }

}
