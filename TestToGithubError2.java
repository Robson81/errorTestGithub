package JustTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classesBPM.Matrizes;

public class TestToGithubError2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		int n = 9;
		int i = 0;
		int j = 0;
		int aux = 0;
		String movimentoJ1;
		String movimentoJ2;
		int resultado = 0;
		
		List<String> jogoVelha = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));
		
		
		int[] vect1 = {0,1,2,1,2,3,2,3,4};
		int[] vect2 = {0,1,2,1,2,3,2,3,4};
		System.out.println("\n    JOGO DA VELHA\n");
	
		System.out.printf("  %s ||   %s  || %s \n",jogoVelha.get(0),jogoVelha.get(1),jogoVelha.get(2));
		System.out.println("====||======||====");
		System.out.printf("  %s ||   %s  || %s \n",jogoVelha.get(3),jogoVelha.get(4),jogoVelha.get(5));
		System.out.println("====||======||====");
		System.out.printf("  %s ||   %s  || %s \n", jogoVelha.get(6),jogoVelha.get(7),jogoVelha.get(8));
	    System.out.println();
		System.out.println("Os jogadores deverão informar seus movimentos, de acordo com o número do quadrante exemplificado acima:");
		System.out.println();

		   int position;
		
		   do {
				do {
					System.out.print("\nJogador1, informe seu movimento: ");
					movimentoJ1 = sc.next();
					position = jogoVelha.indexOf(movimentoJ1);
					if (position != -1) {
						jogoVelha.set(position, "X");
						count1 += vect1[position];
						i++;
					} else
						System.out.println("\nERRO: Movimento indisponível\n");
				} while (position == -1);

				System.out.println("\n");
				System.out.printf("  %s ||   %s  || %s \n", jogoVelha.get(0), jogoVelha.get(1), jogoVelha.get(2));
				System.out.println("====||======||====");
				System.out.printf("  %s ||   %s  || %s \n", jogoVelha.get(3), jogoVelha.get(4), jogoVelha.get(5));
				System.out.println("====||======||====");
				System.out.printf("  %s ||   %s  || %s \n", jogoVelha.get(6), jogoVelha.get(7), jogoVelha.get(8));
				if (i >= 3 && count1 == 3 || i >= 3 && count1 == 6 || i >= 3 && count1 == 9) {
					System.out.println("\nJOGADOR1 VENCEU!!!\n");
					resultado = -1;
					aux = 0;
				} else
					aux = -1;

				if (aux == -1) {
					do {
						System.out.print("\nJogador2, informe seu movimento: ");
						movimentoJ2 = sc.next();
						position = jogoVelha.indexOf(movimentoJ2);
						if (position != -1) {
							jogoVelha.set(position, "O");
							count2 += vect1[position];
							j++;
						} else
							System.out.println("\nERRO: Movimento indisponível\n");
					} while (position == -1);

					System.out.println("\n");
					System.out.printf("  %s ||   %s  || %s \n", jogoVelha.get(0), jogoVelha.get(1), jogoVelha.get(2));
					System.out.println("====||======||====");
					System.out.printf("  %s ||   %s  || %s \n", jogoVelha.get(3), jogoVelha.get(4), jogoVelha.get(5));
					System.out.println("====||======||====");
					System.out.printf("  %s ||   %s  || %s \n", jogoVelha.get(6), jogoVelha.get(7), jogoVelha.get(8));
					if (j >= 3 && count2 == 3 || j >= 3 && count2 == 6 || j >= 3 && count2 == 9) {
						System.out.println("\nJOGADOR2 VENCEU!!!\n");
						resultado = -1;
						//aux = 0;
					}
					if(j==4) {
						System.out.println("\nEMPATE\n");
						resultado = -1;
					}
				}
			} while (resultado != -1);

			System.out.println("Programa Encerado");
			  
			
		
		
		sc.close();

	}

}
