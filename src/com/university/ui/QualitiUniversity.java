package com.university.ui;
import java.util.Scanner;

import com.university.modelo.Alocacao;
import com.university.modelo.Curso;
import com.university.modelo.Departamento;
import com.university.modelo.Professor;
import com.university.negocio.NegocioCurso;
import com.university.negocio.NegocioDepartamento;
import com.university.negocio.NegocioProfessor;
import com.university.negocio.NegocioAlocacao;


public class QualitiUniversity {
	private static Scanner scan = new Scanner(System.in);
	private static NegocioCurso cursos;
	private static NegocioProfessor professores;
	private static NegocioAlocacao alocacoes;
	private static NegocioDepartamento departamentos;


	public static void main(String[] args) throws InterruptedException {
		cursos = new NegocioCurso();
		professores = new NegocioProfessor();
		alocacoes = new NegocioAlocacao();
		departamentos = new NegocioDepartamento();
		AdicionarDados ad = new AdicionarDados(departamentos, professores, cursos);
		RemoverDados rd = new RemoverDados(departamentos, professores, cursos);
		ConsultarDados cd = new ConsultarDados(cursos, professores);

		while (true) {
			System.out.println("Ola, bem vindo ao sistema de cadastro da Qualiti University");
			System.out.println("Escolha a opcao desejada: ");
			System.out.println("1- Cadastrar Professor/Alocacao/Curso/Departamento");
			System.out.println("2- Remover Professor/Alocacao/Curso/Departamento");
			System.out.println("3- Ve dados ja cadastrados");
			System.out.println("4- Buscar");
			System.out.println();

			String escolhaacao = scan.nextLine();

			if (escolhaacao.equals("1")) {
				System.out.println("Escolha a opcao desejada:");
				System.out.println("1- Cadastrar novo curso");
				System.out.println("2- Cadastrar novo professor");
				System.out.println("3- Cadastrar nova alocacao");
				System.out.println("4- Cadastrar novo departamento");
				System.out.println("5- Sair");
				System.out.println();

				String escolhacadastro = scan.nextLine();

				if (escolhacadastro.equals("1")) {
					System.out.println(ad.adicionandoCurso(cursos));
					Thread.sleep(1000);

				} else if (escolhacadastro.equals("2")) {
					System.out.println(ad.adicionandoProfessor(professores));
					Thread.sleep(1000);

				} else if (escolhacadastro.equals("3")) {	
					ad.adicionandoAlocacao(alocacoes);
					Thread.sleep(1000);

				} else if (escolhacadastro.equals("4")) {
					System.out.println(ad.adicionandoDepartamento(departamentos));
					Thread.sleep(1000);


				} else if (escolhacadastro.equals("5")) {
					break;
				}
			} else if (escolhaacao.equals("2")) {
				System.out.println("Escolha a opcao desejada:");
				System.out.println("1- Remover curso");
				System.out.println("2- Remover professor");
				System.out.println("3- Remover alocacao");
				System.out.println("4- Remover departamento");
				System.out.println("5- Sair");
				System.out.println();

				String escolhacadastro = scan.nextLine();

				if (escolhacadastro.equals("1")) {
					rd.removendoCurso(cursos);
					for(Curso aux : cursos.getCursosNegocio()) {
						System.out.println(aux.getNome());
					}Thread.sleep(1000);

				} else if (escolhacadastro.equals("2")) {
					rd.removendoProfessor(professores);
					for(Professor aux : professores.getProfessorNegocio()) {
						System.out.println(aux.getNome());	
					}Thread.sleep(1000);

				} else if (escolhacadastro.equals("3")) {
					rd.removendoAlocacao(alocacoes);
					for(Alocacao aux : alocacoes.getAlocacoesNegocio()) {
						System.out.println(aux.getDiaDaSemana());
					}Thread.sleep(1000);

				} else if (escolhacadastro.equals("4")) {
					rd.removendoDepartamento(departamentos);
					for(Departamento aux : departamentos.getDepartamentosNegocio()) {
						System.out.println(aux.getNome());	
					}Thread.sleep(1000);

				} else if (escolhacadastro.equals("5")) {
					continue;
				}
			} else if (escolhaacao.equals("3")) {
				System.out.println("Escolha a opcao desejada:");
				System.out.println("1- ve curso");
				System.out.println("2- ve professor");
				System.out.println("3- ve alocacao");
				System.out.println("4- ve departamento");
				System.out.println("5- Sair");

				String escolhaDadoscadastro = scan.nextLine();

				if (escolhaDadoscadastro.equals("1")) {
					for(Curso aux : cursos.getCursosNegocio()) {
						System.out.println(aux.getNome());
					}Thread.sleep(1000);

				} else if (escolhaDadoscadastro.equals("2")) {
					for(Professor aux : professores.getProfessorNegocio()) {
						System.out.println(aux.getNome());	
					}Thread.sleep(1000);

				} else if (escolhaDadoscadastro.equals("3")) {
					for(Alocacao aux : alocacoes.getAlocacoesNegocio()) {
						System.out.println(aux.getDiaDaSemana());
					}Thread.sleep(1000);

				} else if (escolhaDadoscadastro.equals("4")) {
					for(Departamento aux : departamentos.getDepartamentosNegocio()) {
						System.out.println(aux.getNome());	
					}Thread.sleep(1000);

				} else if (escolhaDadoscadastro.equals("5")) {
					continue;
				}

			}else if (escolhaacao.equals("4")) {
				System.out.println("Escolha a opcao desejada:");
				System.out.println("1- Buscar curso por nome");
				System.out.println("2- Buscar professor por cpf");

				String escolhaBusca = scan.nextLine();

				if (escolhaBusca.equals("1")) {
					System.out.println("Escreva o nome do curso para a busca: ");
					System.out.println(cd.consultarCursoPorNome(scan.nextLine()));
					Thread.sleep(1000);


				}else if (escolhaBusca.equals("2")){
					System.out.println("Digite o CPF do professor:");
					System.out.println(cd.consultarProfessorPorCpf(scan.nextLine()));
					Thread.sleep(1000);
				}
			}else break;
		}
	}
}
