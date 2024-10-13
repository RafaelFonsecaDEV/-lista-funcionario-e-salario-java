package registro;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exerciciolista.funcionario;

public class salario {

	public static void main(String[] args) {
		
		
		 Locale.setDefault(Locale.US);
	     Scanner sc = new Scanner(System.in);

	     System.out.println("Quantos funcionarios seram registrados? ");
         int N = sc.nextInt();
	     
	     
	     
	     List<funcionario> list = new ArrayList<>();
	    
	     
	     for (int i=0; i<N; i++) {
	    	 
	    	 System.out.println();
	    	 System.out.println("funcionario #" + (i+1) + ":" );
	    	 System.out.println("ID: ");
	    	 Integer ID = sc.nextInt();
	    	 System.out.println("nome: ");
	    	 sc.nextLine();
	    	 String nome = sc.nextLine();
	    	 System.out.println("salario: ");
	    	 Double salario = sc.nextDouble();
	    	 
	    	 
	    	 funcionario fun = new funcionario(ID,nome,salario);
	    	 
	    	 list.add(fun);
	     }
	     
	     
         System.out.println("Enter the funcionario id that will have salary increase: ");
	     int idsalario = sc.nextInt();
	     Integer pos = posicao(list ,idsalario);
	     if(pos == null) {
	    	 System.out.println("this is does not exist");
	     }
	     else {
	    	 System.out.println("enter the percentage");
	    	 double percent = sc.nextDouble();
	         list.get(pos).incrementarsalario(percent);
	     }
	     
	     System.out.println();    
	     System.out.println("lista de funcionario");
	     for(funcionario fun : list) {
	    	 System.out.println(fun);
	     }
	     
	     
	     sc.close();
	
	}
   
	public static Integer posicao(List<funcionario> list, int ID) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getID() == ID) {
				return i;
			}
		}
		return null;
	}
}
