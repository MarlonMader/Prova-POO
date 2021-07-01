package br.com.aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.cursos.curso;
import br.com.cursos.curso.Curso;
import br.com.cursos.cursoController;
import br.com.aluno.alunos;

public class alunoController extends Curso {

	Scanner in;
	private static Scanner tec;
	
	List<alunos> alunos = new ArrayList<>();
	List<Curso> cursos = new ArrayList<>();
	
	public alunoController() {
		tec = new Scanner(System.in);
	}
	
	public static int leOpcao() {
		System.out.println("\n");
		System.out.print("Informe a opção desejada -> ");
		return tec.nextInt();
	}
	
	public void menu(List<alunos> alunos) {
		
		boolean sair = false;
		
		do {
		
			System.out.print("\n");
			System.out.println("|---------- MENU ALUNOS --------|");
			System.out.println("|1 -> Cadastrar Alunos          |");
			System.out.println("|2 -> Listar Alunos             |");
			System.out.println("|3 -> Editar Alunos             |");
			System.out.println("|4 -> Excluir Alunos            |");
			System.out.println("|------------------------------ |");
			System.out.print("\n");
			
			int opcao = leOpcao();
			switch(opcao) {
			
			case 1:
				System.out.println("\n");
				alunos.add(cadastarAluno());
				break;
				
			case 2:
				listarAlunos(alunos);
				break;
				
			case 3:
				editarAluno(alunos);
				break;
			
			case 4:
				excluirAluno(alunos);
				break;
				
			default:
				System.out.println("Opção Invalida!!!");
				break;
		}
	
			System.out.print("Deseja retornar ao MENU PRINCIPAL? [S/N] -> ");
			String resposta = tec.next();
			sair = resposta.equalsIgnoreCase("n") ? true : false;
			System.out.println("\n");
		
		}while (sair);
	
	}
			
	public alunos cadastarAluno() {
		
		alunos alunos = new alunos();
		
		System.out.print("\n");
		System.out.println("---- CADASTRAR ALUNOS ----");
		System.out.print("\n");
		
		cursoController cursoController = new cursoController();
		alunos aluno = new alunos();

		cursoController.listarCursos(cursos);

		System.out.println("---- ID DO CURSO ----");

		System.out.print("Informe o ID do curso desejado -> ");
		int idCurso = in.nextInt() - 1;
		alunos.setCurso(curso.get(idCurso));
		
		System.out.print("-> Informe o seu nome: ");
		tec.nextLine();
		alunos.setNomeAluno(tec.nextLine());
		
		System.out.print("-> Informe a idade do Aluno:  ");
		alunos.setIdadeAluno(tec.nextInt());
		
		System.out.print("-> Informe o País que você mora: ");
		tec.nextLine();
		alunos.setNomeDoPais(tec.nextLine());
		
		System.out.print("-> Informe o Estado em que você reside: ");
		alunos.setNomeDoEstado(tec.nextLine());
		
		System.out.print("-> Informe a Cidade que você reside: ");
		alunos.setNomeDaCidade(tec.nextLine());
				
		System.out.println("-> ID Do curso: ");
		alunos.setCurso(tec.nextLine());
		
		
		return alunos;
	}
	public List<alunos> listarAlunos(List<alunos> alunos) {
		
		if(alunos.isEmpty()) {
			System.out.println(" Não existem dados cadastrados");
			return null;
		}

		System.out.println("\n");
		System.out.println("----------------- PESSOAS CADASTRADADS ---------------");
		System.out.println("\n");
		
		System.out.printf("| %2s | %15s | %2s | %20s | %23s | %30s | \n" ,
				"Id","Nome" ,"Idade" , "País" , "Estado" , "Cidade" );
		
		for(int i = 0; i < alunos.size(); i++) {
			System.out.printf("| %2d | %15s | %5d | %20s | %23s | %30s | \n" ,
					i, 
					alunos.get(i).getNomeAluno(),
					alunos.get(i).getIdadeAluno(),
					alunos.get(i).getNomeDoPais(),
					alunos.get(i).getNomeDoEstado(),
					alunos.get(i).getNomeDaCidade());					
		}
		System.out.println("\n");

		return alunos;
	}
	public List<alunos> editarAluno(List<alunos> alunos) {
		
		alunos aluno = new alunos();

		listarAlunos(alunos);

		if (alunos.isEmpty()) {
			return null;
		}

		System.out.print("Informe o ID do aluno para editar -> ");
		int idAluno = tec.nextInt() - 1;
		System.out.println("\n");

		System.out.println("|--- Campos a serem editados ---|");
		System.out.println("|1 -> Nome do Aluno             |");
		System.out.println("|2 -> Idade                     |");
		System.out.println("|3 -> País                      |");
		System.out.println("|4 -> Estado                    |");
		System.out.println("|5 -> Cidade                    |");
		System.out.println("|-------------------------------|");
		System.out.println("\n");
		System.out.print("Informe o campo que deseja editar -> ");
		int opcao = tec.nextInt();
		System.out.println("\n");

		switch (opcao) {
		
		case 1:

			System.out.println("---- Editar o nome do aluno cadastrado ----");
			System.out.println("\n");
			System.out.print("Informe o novo nome do aluno -> ");
			tec.nextLine();
			aluno.setNomeAluno(tec.nextLine());

			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setNomeDoPais(alunos.get(idAluno).getNomeDoPais());
			aluno.setNomeDoEstado(alunos.get(idAluno).getNomeDoEstado());
			aluno.setNomeDaCidade(alunos.get(idAluno).getNomeDaCidade());

			alunos.set(idAluno, aluno);
			System.out.println("\n");

			break;

		case 2:

			System.out.println("---- Editar a idade do aluno cadastrado ----");
			System.out.println("\n");
			System.out.print("Informe a nova idade do aluno -> ");
			aluno.setIdadeAluno(tec.nextInt());

			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setNomeDoPais(alunos.get(idAluno).getNomeDoPais());
			aluno.setNomeDoEstado(alunos.get(idAluno).getNomeDoEstado());
			aluno.setNomeDaCidade(alunos.get(idAluno).getNomeDaCidade());

			alunos.set(idAluno, aluno);
			System.out.println("\n");

			break;

		case 3:

			System.out.println("---- Editar o nome do país cadastrado ----");
			System.out.println("\n");
			System.out.print("Informe o novo país do aluno -> ");
			tec.nextLine();
			aluno.setNomeDoPais(tec.nextLine());

			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setNomeDoEstado(alunos.get(idAluno).getNomeDoEstado());
			aluno.setNomeDaCidade(alunos.get(idAluno).getNomeDaCidade());

			alunos.set(idAluno, aluno);
			System.out.println("\n");

			break;

		case 4:

			System.out.println("---- Editar o nome do estado cadastrado ----");
			System.out.println("\n");
			System.out.print("Informe o novo nome do estado -> ");
			tec.nextLine();
			aluno.setNomeDoEstado(tec.nextLine());

			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setNomeDoPais(alunos.get(idAluno).getNomeDoPais());
			aluno.setNomeDaCidade(alunos.get(idAluno).getNomeDaCidade());

			alunos.set(idAluno, aluno);
			System.out.println("\n");

			break;

		case 5:

			System.out.println("---- Editar o nome da cidade cadastrada ----");
			System.out.println("\n");
			System.out.print("Informe o novo nome da cidade -> ");
			tec.nextLine();
			aluno.setNomeDaCidade(tec.nextLine());

			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setIdadeAluno(alunos.get(idAluno).getIdadeAluno());
			aluno.setNomeDoPais(alunos.get(idAluno).getNomeDoPais());
			aluno.setNomeDoEstado(alunos.get(idAluno).getNomeDoEstado());

			alunos.set(idAluno, aluno);
			System.out.println("\n");

			break;

		default:
			System.out.println("Opção Inválida!!!!");
			break;
		}

		return alunos;
	}

	public void excluirAluno(List<alunos> alunos) {
		
	listarAlunos(alunos);
		
		if(alunos.isEmpty()) {
			return;
		}
		
		System.out.println("------ EXCLUIR ALUNO ------");
		System.out.print("\n");
		
		System.out.print("Informe o Id do aluno para excluir: ");
		int idAluno = tec.nextInt() - 1;
		System.out.println("\n");
		
		if(alunos.size() <= idAluno) {
			System.out.println("\n");
			System.out.print("Pessoa não cadastrada");
			System.out.println("\n");
			return;
		}
		
		alunos.remove(idAluno);
	
	}
}
