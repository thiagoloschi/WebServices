package tsi.web.tipo;

public class Turma {
	private String nome, ano, curso;
	private int matriculados,capacidade=30;
	private Aluno[] alunos;

	public Turma() {
		super();
		matriculados=0;
		alunos=new Aluno[capacidade];
	}
	
	public Turma(String nome, String ano, String curso) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.curso = curso;
	}

	public void matricular(Aluno aluno){
		alunos[matriculados++]=aluno;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String toString() {
		return nome + " " + ano + " " + curso + " " + capacidade + " " + matriculados;
	}
	
}
