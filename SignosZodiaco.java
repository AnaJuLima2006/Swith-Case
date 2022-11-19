package listaSwitchCase;

import java.util.Scanner;

public class signosZodiaco {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		int mes, dia;
		
		System.out.println("Digite o mês em que você nasceu : ");
		mes = leitura.nextInt();
		
		System.out.println("Digite o dia em que você nasceu : ");
		dia = leitura.nextInt();
		
		System.out.println("Qual é o seu signo do zodíaco? ");
		
			switch(mes) {
			
			case 1:
                if (dia < 21) {
                    System.out.println("Seu signo é capricórnio!");
                } else if (dia >= 21) {
                    System.out.println("Seu signo é  aquário");
                }
                break;
                
			case 2:
                if (dia < 19) {
                    System.out.println("Seu signo é aquário");
                } else if (dia >= 19) {
                    System.out.println("Seu signo é peixes");
                }
                break;
                
			case 3:
	            if (dia < 21 ) {
	                System.out.println("Seu signo é peixes");
	            } else if (dia >= 21) {
	               System.out.println("Seu signo é áries");
	            }
	            break;
	            
			case 4:
                if (dia < 21) {
                    System.out.println("Seu signo é áries");
                } else if (dia >= 21) {
                    System.out.println("Seu signo é touro");
                }
                break;
                
            case 5:
                if (dia < 21) {
                    System.out.println("Seu signo é touro");
                } else if (dia >=21 ) {
                    System.out.println("Seu signo é gêmeos");
                }
                break;
                
            case 6:
                if (dia < 21) {
                    System.out.println("Seu signo é gêmeos");
                } else if (dia >= 21) {
                    System.out.println("Seu signo é câncer");
                }
                break;
                
            case 7:
                if (dia < 23) {
                    System.out.println("Seu signo é câncer");
                } else if (dia >= 23) {
                    System.out.println("Seu signo é leão");
                }
                break;
                
            case 8:
                if (dia < 23) {
                    System.out.println("Seu signo é leão");
                } else if (dia >= 23) {
                    System.out.println("Seu signo é virgem");
                }
                break;
                
            case 9:
                if (dia < 23) {
                    System.out.println("Seu signo é virgem");
                } else if (dia >= 23) {
                    System.out.println("Seu signo é libra");
                }
                break;
                
            case 10:
                if (dia < 23) {
                    System.out.println("Seu signo é libra");
                } else if (dia >= 23) {
                    System.out.println("Seu signo é escorpião");
                }
                break;
                
            case 11:
                if (dia < 22) {
                    System.out.println("Seu signo é escorpião");
                } else if (dia >= 22) {
                    System.out.println("Seu signo é sargitário");
                }
                break;
                		
            case 12:
                if (dia < 22) {
                    System.out.println("Seu signo é sargitário");
                } else if (dia >= 22) {
                    System.out.println("Seu signo é capricórnio");
                }
                break;
                
            default:
                System.out.println("O mês é inválido!");    
                
	       }
		   
	}
}
