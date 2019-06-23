package entidade;

import java.util.HashSet;
import java.util.Set;

public class AgendaTelefonica {
	
	//Interface Set Sobrescreve objetos iguais na lista
	private Set<Contato> contatos = new HashSet<>();

	public AgendaTelefonica() {
		this.contatos = new HashSet<>();

	}

	public Set<Contato> getContatos() {
		return contatos;
	}

	public void inserirTelefone(Contato contato, String telefone) {
		contato.getTelefones().add(telefone);
		contatos.add(contato);

	}

	public void removerTelefone(Contato contato, String telefone) {

		contato.getTelefones().remove(telefone);
		contatos.add(contato);

	}

	public void removerContato(Contato contato) {
		contatos.remove(contato);

	}

	public int qtdTelefonesPorContato(Contato contato) {
		return contato.qtd();
	}

	// Metodo para mostrar os contatos e a quantidade de contatos no console
	public void mostrar() {
		for (Contato cont : contatos) {
			System.out.println(cont);
		}

		System.out.println("Quantidade de contatos:" + contatos.size());

	}

}
