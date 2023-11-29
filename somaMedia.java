package arranjoMedia;

import java.util.Scanner;

public class somaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			double media = 0;
			double soma = 0;
		
			System.out.print("Quantos  Numeros vc ira digitar : ");
			int n = sc.nextInt();
			System.out.println();
			 double[] vect = new double[n];
			 
			 for (int i = 0; i < vect.length; i++) {
				
				 System.out.print("Digite uma nota : ");
				 double nota = sc.nextDouble();
				 System.out.println();
				 
				 if (nota <= 10 && nota >= 0) {
					vect[i] = nota;
					soma += nota;
				}else {
					System.out.println("Nota invalida");
					System.out.println("Tente novamente");
					i--;
				} 
			}
			 
			 media = soma / vect.length;
			 
			 System.out.printf("VALORES = " );
			 for (int i = 0; i < vect.length; i++) {
				System.out.print(vect[i] + " | ");	
			}
			 System.out.printf("\nSOMA = %.2f" , soma);
			 System.out.printf("\nMEDIA = %.2f" , media);		 
	}
}
