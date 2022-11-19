package listaSwitchCase;

import java.util.Scanner;

public class estatisticaAlunos {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int total, mb, b, r, i, mencao;
		
		System.out.println("Digite o número de alunos com menção MB:");
		mb = leitura.nextInt();
		System.out.println("Digite o número de alunos com menção B:");
		b = leitura.nextInt();
		System.out.println("Digite o número de alunos com menção R");
		r = leitura.nextInt();
		System.out.println("Digite o número de alunos com menção I");
		i = leitura.nextInt();
		
		total = mb + b + r + i;
		
		double porcMb, porcB, porcR, porcI;
		porcMb = (double) mb/total * 100;            
		porcB= (double) b/total * 100;
		porcR = (double) r/total * 100;
		porcI =  (double) i/total * 100;
		
		System.out.println("De qual das menções deseja saber a porcentgem?  Digite o número correspondente: MB (1) B (2) R (3) I (4)");
		mencao = leitura.nextInt();

		switch (mencao) {
        case 1:
            System.out.println("A porcentagem é de: " + porcMb + "%");   
            break;
            
        case 2:
            System.out.println("A porcentagem é de: " + porcB  + "%");
            break;
            
        case 3:
            System.out.println("A porcentagem é de: " + porcR  + "%");
            break; 
            
        case 4:
            System.out.println("A porcentagem é de: " + porcI  + "%");
            break; 
            
        default:
            System.out.println("Número inválido!");
		}

	}

}
