package Agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class funcionalidades {
	Scanner leitor = new Scanner(System.in);
	
	public void imprimeLista(ArrayList<Contatos> c) {
		for(int i=0; i<c.size(); i++) {
			System.out.print(i+1+"- ");
			System.out.println(c.toString());
		}
	}
	public void imprimeNaoAtendidas(ArrayList<Long> c, ArrayList<Contatos> d) {
		for(int i=0; i<c.size(); i++) {
			for(int j=0; j<=d.size(); j++) {
				if(d.size()!=0) {
					if(c.get(i) == d.get(j).getNumero()) {
						System.out.print(i+1+"- ");
						System.out.println(d.get(j).toString());
					}else {
						System.out.print(i+1+"- ");
						System.out.println(c.get(i));
					}
				}else {
					System.out.print(i+1+"- ");
					System.out.println(c.get(i));
				}		
			}
		}
	}
	
	public void cadastaContato(ArrayList<Contatos> contatos) {
		System.out.println("Escreva o número que deseja cadastrar:");
		long cadastra = leitor.nextLong();
		System.out.println("Escreva o nome do contato que deseja cadastrar:");
		String cadastraNome = leitor.next();
		Contatos c = new Contatos(cadastra, cadastraNome);
		contatos.add(c);
	}
	public void removeContato(ArrayList<Contatos> c) {
		if(c.size() == 0) {
			System.out.println("Nenhum contato cadastrado.");
		}
		else{imprimeLista(c);
		System.out.println("Escolha o número do contato que você deseja remover: ");
		int num = leitor.nextInt();
		c.remove(num-1);
	}}
	public void cadastraNaoAtendida(ArrayList<Long> c) {
		System.out.println("Escreva o número da chamada perdida:");
		long num = leitor.nextLong();
		c.add(num);
	}
	public void excluirTodasNaoAtendidas(ArrayList<Long> c) {
		c.clear();
	}

}
