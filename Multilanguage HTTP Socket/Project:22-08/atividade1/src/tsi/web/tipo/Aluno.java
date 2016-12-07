package tsi.web.tipo;

public class Aluno {
	private String id, nome;
	private boolean matriculado;
	public Aluno() {
		super();
	}
	
	public Aluno(String id, String nome, boolean matriculado) {
		super();
		this.id = id;
		this.nome = nome;
		this.matriculado = matriculado;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isMatriculado() {
		return matriculado;
	}
	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", matriculado="
				+ matriculado + "]";
	}
	
}
