package Agenda;

import java.util.ArrayList;
import java.util.Scanner;


public class controlador {
	Scanner leitor = new Scanner(System.in);
	ArrayList<Contatos> contatos = new ArrayList<>();
	ArrayList<Long> naoAtendidas = new ArrayList<Long>();
	funcionalidades f = new funcionalidades();
	
	public void controlador() {
		System.out.print("Agenda de contatos. ");
		
		while(true) {
			System.out.println("Escolha a sua op��o:\n"
					  + "[1] Cadastrar contato\n"
					  + "[2] Remover contato\n"
					  + "[3] Cadastrar chamada n�o atendidan\n"
					  + "[4] Mostrar lista de chamadas n�o atendidas\n"
					  + "[5] Excluir todas chamadas n�o atendidas\n"
					  + "[6] Sair");
			int escolha = leitor.nextInt();
			if (escolha == 1) {
				f.cadastaContato(contatos);
				System.out.println();
			}else if(escolha == 2) {
				f.removeContato(contatos);
				System.out.println();
			}else if(escolha == 3) {
				f.cadastraNaoAtendida(naoAtendidas);
				System.out.println();
			}else if(escolha == 4) {
				f.imprimeNaoAtendidas(naoAtendidas, contatos);
				System.out.println();
			}else if(escolha == 5) {
				f.excluirTodasNaoAtendidas(naoAtendidas);
				System.out.println();
			}else if(escolha == 6) {
				break;
			}else {System.out.print("Op��o inv�lida.");}
			
			
			
		}
		
		
		
		
		
		
	}
}
