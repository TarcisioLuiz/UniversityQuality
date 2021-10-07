package com.university.ui;

import java.time.DayOfWeek;
import java.util.Scanner;

import com.university.modelo.Alocacao;
import com.university.modelo.Curso;
import com.university.modelo.Departamento;
import com.university.modelo.Professor;
import com.university.negocio.NegocioCurso;
import com.university.negocio.NegocioDepartamento;
import com.university.negocio.NegocioProfessor;
import com.university.negocio.negocioAlocacao;



public class AdicionarDados {
	private static 	Scanner scan = new Scanner(System.in);
	private static NegocioDepartamento dept;
	private static NegocioProfessor prof;
	private static NegocioCurso crs;

	public static  Curso adicionandoCurso(NegocioCurso crs) {
		Curso curso = new Curso();

		System.out.println("digite o nome do curso: ");
		curso.setNome(scan.nextLine());			
		crs.inserirCurso(curso);
		return curso;
	}

	public static Professor adicionandoProfessor(NegocioProfessor prof) {
		Professor professor = new Professor();
		int valorSelecionado = 0;

		System.out.println("Digite o nome do professor: ");
		professor.setNome(scan.nextLine());
		System.out.println("Digite o CPF do professor: ");
		professor.setCpf(scan.nextLine());
		System.out.println("selecione o Departamento que o professor esta: ");
		while (true) {
			for(int i = 0; i < dept.getDepartamentosNegocio().size(); i++) {
				System.out.println(i + " - " + dept.getDepartamentosNegocio().get(i).getNome());
			}
			valorSelecionado = scan.nextInt();
			scan.nextLine();
			if (valorSelecionado < -1 || valorSelecionado >= dept.getDepartamentosNegocio().size()) {
				continue;
			} else break;
		}
		Departamento item = dept.getDepartamentosNegocio().get(valorSelecionado);
		professor.setDepartamento(item);

		prof.inserirProfessor(professor);
		return professor;
	}

	public static Alocacao adicionandoAlocacao(negocioAlocacao aloc) {
		Alocacao alocacao = new Alocacao();
		int valorSelecionado = 0;

		System.out.println("Horario do curso: ");
		alocacao.setHorario(scan.nextLine());

		System.out.println("Dia da semana desse curso: ");
		int codDia = scan.nextInt();
		scan.nextLine();
		alocacao.setDiaDaSemana(DayOfWeek.of(codDia));

		System.out.println("Digite o professor que estará nesse horario: ");
		while (true) {
			for(int i = 0; i < prof.getProfessorNegocio().size(); i++) {
				System.out.println(i + " - " + prof.getProfessorNegocio().get(i).getNome());
			}
			valorSelecionado = scan.nextInt();
			scan.nextLine();
			if (valorSelecionado < -1 || valorSelecionado >= prof.getProfessorNegocio().size()) {
				continue;
			} else break;
		}


		Professor itemProfessor = prof.getProfessorNegocio().get(valorSelecionado);
		alocacao.setProfessor(itemProfessor);
		System.out.println("Digite o curso que será realizado nessa dia e horario: ");
		while (true) {
			for (int i = 0; i < crs.getCursosNegocio().size(); i++) {
				System.out.println(i + " - " + crs.getCursosNegocio().get(i).getNome());
			}
			valorSelecionado = scan.nextInt();
			scan.nextLine();

			if (valorSelecionado < -1 || valorSelecionado >= crs.getCursosNegocio().size()) {
				continue;
			} else break;
		}
			Curso itemCurso = crs.getCursosNegocio().get(valorSelecionado);
			alocacao.setCurso(itemCurso);


		if (aloc.inserirAlocacao(alocacao) == true) {
			System.out.println("Professor cadastrado com sucesso");
			return alocacao;
		}else
			System.out.println("O professor ja está cadastrado nesse horario");
			return alocacao;



	}
	
	public static Departamento adicionandoDepartamento(NegocioDepartamento dept) {
		Departamento departamento = new Departamento();
		
		System.out.println("Digite o nome do departamento: ");
		departamento.setNome(scan.nextLine());
		dept.inserirDeparetamento(departamento);
		return departamento;
	}
}
