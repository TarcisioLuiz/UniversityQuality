package com.university.ui;

import java.util.Scanner;

import com.university.negocio.NegocioCurso;
import com.university.negocio.NegocioDepartamento;
import com.university.negocio.NegocioProfessor;
import com.university.negocio.NegocioAlocacao;

public class RemoverDados {
	private static Scanner scan = new Scanner(System.in);
	private int valorSelecionado;
	
	public RemoverDados(NegocioDepartamento dept, NegocioProfessor prof, NegocioCurso crs) {
		super();
	}

	public void removendoCurso(NegocioCurso crs) {
		while (true){
			System.out.println("Qual curso você deseja remover: ");

			for(int i = 0; i < crs.getCursosNegocio().size(); i++)
			{
				System.out.println(i+" - "+crs.getCursosNegocio().get(i).getNome());
			}
			System.out.println("Digite o indice relativo ao curso quer deletar: ");
			valorSelecionado = scan.nextInt();
			if (valorSelecionado < -1 || valorSelecionado > crs.getCursosNegocio().size()) {
				continue;
			}else break;	
		}crs.removerCurso(valorSelecionado);	
	}

	public void removendoProfessor(NegocioProfessor prof) {

		while(true) {
			System.out.println("Qual Professor você deseja remover: ");

			for(int i = 0; i < prof.getProfessorNegocio().size(); i++)
			{
				System.out.println(i+" - "+prof.getProfessorNegocio().get(i).getNome());
			}
			System.out.println("Digite o indice relativo ao Professor que quer deletar: ");
			valorSelecionado = scan.nextInt();
			if (valorSelecionado < -1 || valorSelecionado > prof.getProfessorNegocio().size()) {
				continue;
			}else break;
		}prof.removerProfessor(valorSelecionado);
	}

	public void removendoAlocacao(NegocioAlocacao aloc) {
		while (true) {
			System.out.println("Qual Alocacao você deseja remover: ");

			for(int i = 0; i < aloc.getAlocacoesNegocio().size(); i++)
			{
				System.out.println(i+" - "+aloc.getAlocacoesNegocio().get(i).getDiaDaSemana());
			}
			System.out.println("Digite o indice relativo a Alocacao que quer deletar: ");
			valorSelecionado = scan.nextInt();
			if (valorSelecionado < -1 || valorSelecionado > aloc.getAlocacoesNegocio().size()) {
				continue;
			}else break;

		}aloc.removerAlocacao(valorSelecionado);
	}

	public void removendoDepartamento(NegocioDepartamento dept) {
		while (true) {
			System.out.println("Qual departamento você deseja remover: ");

			for(int i = 0; i < dept.getDepartamentosNegocio().size(); i++)
			{
				System.out.println(i+" - "+dept.getDepartamentosNegocio().get(i).getNome());
			}
			System.out.println("Digite o indice relativo ao Professor que quer deletar: ");
			valorSelecionado = scan.nextInt();
			if (valorSelecionado < -1 || valorSelecionado > dept.getDepartamentosNegocio().size()) {
				continue;
			}else break;

		}		dept.removerDepartamento(valorSelecionado);

	}
}
