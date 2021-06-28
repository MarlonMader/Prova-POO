package br.com.cursos;

import java.util.Calendar;

public class curso {

	//CLASSE
	public class Curso {
		
		//ATRIBUTOS
		private String nomeCurso;
		private String nomeAluno;
		private int anoDeNascimento;
		private int idadeAluno;
		private String curso;
		
		//CONSTRUTOR
		
		public Curso() {
			super();
		}
		public Curso(String nomeCurso, String nomeAluno, int anoDeNascimento, int idadeAluno, String curso) {
			super();
			this.nomeCurso = nomeCurso;
			this.nomeAluno = nomeAluno;
			this.anoDeNascimento = anoDeNascimento;
			this.idadeAluno = idadeAluno;
			this.curso = curso;
		}

		public String getNomeAluno() {
			return nomeAluno;
		}

		public void setNomeAluno(String nomeAluno) {
			this.nomeAluno = nomeAluno;
		}

		public int getAnoDeNascimento() {
			return anoDeNascimento;
		}

		public void setAnoDeNascimento(int anoDeNascimento) {
			this.anoDeNascimento = anoDeNascimento;
			setIdadeAluno(anoDeNascimento);
		}

		public int getIdadeAluno() {
			return idadeAluno;
		}

		public void setIdadeAluno(int idadeAluno) {
			Calendar calendar = Calendar.getInstance();
			
			this.idadeAluno = calendar.get(Calendar.YEAR) - getAnoDeNascimento();
		}

		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}

		public String getNomeCurso() {
			return nomeCurso;
		}

		public void setNomeCurso(String nomeCurso) {
			this.nomeCurso = nomeCurso;
		}
		
		
		
	}

	public void setNomeCurso(String nextLine) {

		
	}
}
