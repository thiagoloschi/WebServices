package tsi.web.tipo;

import static javax.swing.JOptionPane.*;

public class AbrirTurma {
	static  String NOMEPROGRAMA = "Turmas";
	
	public static Turma criarTurma(){
		Turma turma= null;
		String nome, ano, curso;
		nome=ler("Nome da turma: ");
		ano=ler("Ano da turma: ");
		curso=ler("Nome do curso: ");
		
		turma=new Turma(nome, ano, curso);
		return turma;
	}

	public static Aluno criarAluno(){
		String id, nome;
	}
	
	public static String ler(String msg){
		return showInputDialog(null, msg, NOMEPROGRAMA, QUESTION_MESSAGE);
	}
}
