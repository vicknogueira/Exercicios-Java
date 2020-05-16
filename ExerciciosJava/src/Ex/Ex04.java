/*4- Ler o nome de um aluno e as suas duas notas A e B, e após calcular a média ponderada entre estas notas (A tem peso 1 e B tem peso 2).
Verifique se a nota digitada é valida, caso seja inválida, repita a leitura. 
Repetir este procedimento para uma turma composta por cinco alunos, usando o comando While .

Exemplo de tela de saída: Entre com o
nome do aluno: Fulano da Silva Entre com
o grau A: 5.0 Entre com o grau B: 6.0 O
aluno Fulano da Silva tem uma media: 5.66
Entre com o nome do aluno: Ciclano da
Silva Entre com o grau A: 12.5 Nota
invalida! Entre com o grau A: 2.5 ...
*/
package Ex;

import java.util.Scanner;

public class Ex04 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		String[] nome = new String[5];
		String a, b;
		
		float[] media = new float[5];		
		
		
		
		while(i < 5) {
			System.out.print("\nEntre com o nome do aluno: ");
			nome[i] = entrada.nextLine();
			
			System.out.print("Entre com o grau A: ");
			a = entrada.nextLine();
			
			System.out.print("Entre com o grau B: ");
			b = entrada.nextLine();
			
			
				if(validar(a) && validar(b)) {
					media[i] = (Float.parseFloat(a) * 1) + (Float.parseFloat(b) * 2) / 3;
					System.out.printf("\nO(a) %s tem média: %.2f\n", nome[i], media[i]);
					
				}else{
					System.err.print("\n-------------------------------------------------"
							+ "\n\nNota inválida, digite novamente: \n");
					entrada.nextLine();
					System.out.print("Entre com o grau A: ");
					a = entrada.nextLine();
					
					System.out.print("Entre com o grau B: ");
					b = entrada.nextLine();
					if(validar(a) && validar(b)) {
						media[i] = (Float.parseFloat(a) * 1) + (Float.parseFloat(b) * 2) / 3;
						System.out.printf("\nO(a) %s tem média: %.2f\n", nome[i], media[i]);
					
						
					}

				}		
			i++;			
		}
		System.out.println("\n----------------------------------------------------------------------\n\n"
					+ "\t\t\t\tAlunos: \n\n");
		i = 0;
		while(i < 5) {
			System.out.printf("\t\t\t   %s - média: %.2f \n", nome[i], media[i]);
			i++;
		}
	
}

	public static boolean validar(String nota) {
	        String grau = nota;
	        boolean valido = true;

	        for (int i = 0; i < grau.length(); i++) {
	            Character caractere = grau.charAt(i);
	            if (!Character.isDigit(caractere)) { //isDigit() Retorna verdadeiro se o caracter é um caracter numérico e falso caso não seja, !Character - se não for um caractere
//	 Não é um número
	                
	                valido = false; // Nesse caso se for digitado qualquer coisa menos um numero a validação vai ser false, ou seja, precisa validar
	            }
	        }
//	 Float
	        return valido == true;
	    }

}
