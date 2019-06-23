package entidade;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Contato {
	   private String nome;
	    private String sobreNome;
	    private Set<String> telefones = new HashSet<String>();

	    public Contato(String nome, String sobreNome) {
	        this.nome = nome;
	        this.sobreNome = sobreNome;
	    }

	    public Contato() {
	        this.telefones = new TreeSet<>();
	    }

	    public String getNome() {
	        return nome;
	    }

	    public int qtd() {
	        return telefones.size();
	    }

	    public String getSobreNome() {
	        return sobreNome;
	    }

	    public Set<String> getTelefones() {
	        return telefones;
	    }

	    @Override
	    public String toString() {
	        return "\n" + "Nome:" + nome + ".\nSobreNome:" + sobreNome + ".\nTelefones:" + telefones + ".\n";
	}	
}
