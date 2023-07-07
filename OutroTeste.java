package JustTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OutroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
		
			int count1 = 0;
	        int count2 = 0;
	        int n = 9;
	        int i = 0;
	        int j = 0;
	        String movimentoJ1;
	        String movimentoJ2;
	        int resultado = 0;
	        int position = 0;

	        List<String> jogoVelha = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));

	       // List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8));
	        List<Integer> list1 = new ArrayList<>();
	        List<Integer> list2 = new ArrayList<>();
	        
	        int[] vect1 = { 0, 1, 2, 1, 2, 3, 2, 3, 4 };
	        int[] vect2 = { 0, 1, 2, 1, 2, 3, 2, 3, 4 };
	        int aux = 0;

	        do {
	            do {
	                System.out.print("\nJogador1, informe seu movimento: ");
	                movimentoJ1 = sc.next();
	                position = jogoVelha.indexOf(movimentoJ1);
	                if (position != -1) {
	                    jogoVelha.set(position, "X");
	                    list1.add(position);
	                    //count1 += vect1[position];
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

	            for (int k = 0; k < 3; k++) {
					for (int k2 = 0; k2 < 3-1; k2++) {
						
						if(list1.get(k2))
						
						
					}
				}
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            if (i >= 3 && list1.get(0)==0&& list1.get(1)==1&& list1.get(2)==2&&
	            		 list1.get(4)==4&& list1.get(5)==5&& list1.get(6)==6&&
	            		 list1.get(6)==6&& list1.get(7)==7&& list1.get(8)==8&&
	            		 list1.get(0)==0&& list1.get(4)==4&& list1.get(8)==8&&
	            		 list1.get(6)==6&& list1.get(4)==4&& list1.get(2)==2&&
	            		 list1.get(0)==0&& list1.get(1)==1&& list1.get(2)==2&&
	            		 list1.get(0)==0&& list1.get(3)==3&& list1.get(6)==6&&
	            		 list1.get(1)==1&& list1.get(4)==4&& list1.get(7)==7&&
	            		 list1.get(2)==2&& list1.get(5)==5&& list1.get(8)==8) {
	                System.out.println("\nJOGADOR1 VENCEU!!!\n");
	                resultado = -1;
	                aux = 0;
	            } else {
	                aux = -1;

	                if (aux == -1) {
	                    do {
	                        System.out.print("\nJogador2, informe seu movimento: ");
	                        movimentoJ2 = sc.next();
	                        position = jogoVelha.indexOf(movimentoJ2);
	                        if (position != -1) {
	                            jogoVelha.set(position, "O");
	    	                    
	                            list2.add(position);

	                            //count2 += vect2[position];
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

	                    if (j >= 3 && list2.get(0)==0&& list2.get(1)==1&& list2.get(2)==2&&
	    	            		 list2.get(4)==4&& list2.get(5)==5&& list2.get(6)==6&&
	    	            		 list2.get(6)==6&& list2.get(7)==7&& list2.get(8)==8&&
	    	            		 list2.get(0)==0&& list2.get(4)==4&& list2.get(8)==8&&
	    	            		 list2.get(6)==6&& list2.get(4)==4&& list2.get(2)==2&&
	    	            		 list2.get(0)==0&& list2.get(1)==1&& list2.get(2)==2&&
	    	            		 list2.get(0)==0&& list2.get(3)==3&& list2.get(6)==6&&
	    	            		 list2.get(1)==1&& list2.get(4)==4&& list2.get(7)==7&&
	    	            		 list2.get(2)==2&& list2.get(5)==5&& list2.get(8)==8) {
	                        System.out.println("\nJOGADOR2 VENCEU!!!\n");
	                        resultado = -1;
	                    }

	                    if (j == 4) {
	                        System.out.println("\nEMPATE\n");
	                        resultado = -1;
	                    }
	                }
	            }
	        } while (resultado != -1);

	        System.out.println("Programa Encerrado");
	        
	        
	sc.close();
	}

}
