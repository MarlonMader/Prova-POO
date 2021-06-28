package br.com.cursos;

import java.util.List;
import java.util.Scanner;

import br.com.cursos.curso.Curso;

public class cursoController {

	private static Scanner tec;
	
	public cursoController() {
		tec = new Scanner(System.in);
		
	}

	public static int leOpcao() {
		System.out.println("Informe a opcao desejada -> ");
		return tec.nextInt();
	
	}
	
	public void menu(List<Curso>cursos) {
		
		System.out.println("\n");
		System.out.println("|---------- MENU CURSOS ---------");
		System.out.println("|1 -> Cadastrar Cursos          |");
		System.out.println("|2 -> Listar Cursos             |");
		System.out.println("|3 -> Editar Cursos             |");
		System.out.println("|4 -> Excluir Cursos            |");
		System.out.println("|------------------------------ |");
		System.out.println("\n");
		System.out.println("Informe a Opção desejada: ");
		
		int opcao = tec.nextInt();
		switch(opcao) {
		
		case 1:
			cursos.add(cadastrarCurso());
			break;
		
		case 2:
			listarCursos(cursos);
			break;
		
		case 3:
			editarCurso(cursos);
			break;
	
		case 4:
			excluirCurso(cursos);
			break;
		}
	
	}

	
	private curso cadastrarCurso() {
		curso curso = new curso();
		
		System.out.print("\n");
		System.out.println("---- CADASTRAR CURSOS ----");
		System.out.print("\n");
		
		System.out.println("Informe o nome do curso que deseja Cadastrar: ");
		tec.nextLine();
		curso.setNomeCurso(tec.nextLine());
		
		return curso;
	}
	private void listarCursos(List<Curso> cursos) {
		
	}
	private void editarCurso(List<Curso> cursos) {
		
	}
	private void excluirCurso(List<Curso> cursos) {
		
	}
}


