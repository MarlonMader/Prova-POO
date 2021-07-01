package br.com.senai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.aluno.alunoController;
import br.com.aluno.alunos;
import br.com.cursos.curso.Curso;
import br.com.cursos.cursoController;

public class ProgramaPrincipal {
 
	public static void main(String[] args) {
		
		System.out.print( "\n" );
		System.out.println("|-------------- MENU PRINCIPAL ---------------|");
		System.out.println("| 1 -> Menu Alunos                            |");
		System.out.println("| 2 -> Menu Cursos                            |");
		System.out.println("| 0 -> Sair                                   |");
		System.out.println("|---------------------------------------------|");                                                                                                                                                                                                                                                                                                              	
		System.out.print("\n");	
		
			Scanner tec = new Scanner(System.in);

			List<alunos> alunos = new ArrayList<>();
			List<Curso> cursos = new ArrayList<Curso>();
			
			alunoController alunoController = new alunoController();
			cursoController cursoController = new cursoController();
			
			boolean sair = false;
			
			do {
				
				ProgramaPrincipal.menuPrincipal();
				System.out.println("\n");
				System.out.print("Informe a opção desejada -> ");
				int opcao = tec.nextInt();
				System.out.println("\n");
			
			switch (opcao) {
		
		case 1:
			alunoController.menu(alunos);
			break;
		
		case 2:
			cursoController.menu(cursos, alunos);
			break;
		
		case 0:
			sair = true;
			break;
		
		default:
			System.out.println("\n");
			System.out.println("Opção Invalida!!!");
			break;
		}
		
		} while(!sair);
		
		System.out.println("\n");
		System.out.println("Sistema Finalizado");
		
		tec.close();
	}

	private static void menuPrincipal() {
		
	}
}
