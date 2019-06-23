package principal;

import entidade.AgendaTelefonica;
import entidade.Contato;

public class Teste {

	public static void main(String[] args) {

		AgendaTelefonica agenda = new AgendaTelefonica();

		Contato Contato1 = new Contato("Robert", "Santos");
		Contato Contato2 = new Contato("Erasmo", "Monteiro");
		Contato Contato3 = new Contato("Erasmo", "Monteiro");

		agenda.inserirTelefone(Contato1, "(81)91111-1111");
		agenda.inserirTelefone(Contato1, "(81)93333-3333");
		agenda.inserirTelefone(Contato2, "(81)92224-2224");
		agenda.inserirTelefone(Contato2, "(81)92224-2224");
		agenda.inserirTelefone(Contato3, "(81)94444-4444");

		agenda.mostrar();

		agenda.removerTelefone(Contato3, "(81)94444-4444");

		agenda.removerContato(Contato1);
		
		agenda.mostrar();

	}

}
