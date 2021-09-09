import java.util.Locale;
import java.util.Scanner;

// DESENVOLVIDO PELOS ALUNOS DA FATEC PRAIA GRANDE- PERIODO TARDE/ 2 SEMESTRE
// Aluna: Daiana da Silva Alves
// Aluna: Alice Christovam Constantino
// Aluno: Pedro Henrique Marques Burghi dos Santos

class Main {  
  public static void main(String args[]) { 
   Scanner in = new Scanner(System.in);
   int  orcam, hotel,  participante, camas, contador;
   
   
   
			
	  System.out.println("Digite a quantidade de participantes:");
	  participante = in.nextInt();
	  
      System.out.println("Digite a quantidade de hoteis consultados:");
	  hotel = in.nextInt();

	
	  if(participante >= 1 && participante <= 200) {
		System.out.println("Siga para a proxima etapa...");
	      }// final if 1
	  else {
       System.out.println("Número de participantes ultrapassa o regulamento, tente novamente!");
	  }//final else 1
	  
	  if( hotel>= 1 && hotel <= 18) {
		int menor = 1000;
		for(int i = 0; i < hotel; i++){
		System.out.println("Digite o valor unitario de hospedagem :R$");
	     int unitario = in.nextInt();
	  if(menor > unitario){ 
		 menor = unitario; 
		   
	  }
			}//final para  
		   System.out.println("O menor valor encontrado foi: R$" + menor );
		  

	    orcam = menor * participante;
		  System.out.println("O menor  orçamento encontrado para o grupo foi de:R$" + orcam );
		  }
	  System.out.println("Desenvoldio pelos Alunos do 2 ciclo ADS:");
      System.out.println("Alice Christovam Constantino ");
      System.out.println("Daiana da Silva Alves");
	  System.out.println("Pedro Henrique Marques Burghi dos Santos");
	  }
}