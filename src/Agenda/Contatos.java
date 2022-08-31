package Agenda;

public class Contatos {
	private long numero;
	private String nome;
	
	
	public Contatos(long numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome: "+nome+" Número: "+numero);
		return builder.toString();
	}
	
	
	
	
}
