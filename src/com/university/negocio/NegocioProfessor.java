package com.university.negocio;

import java.util.ArrayList;

import com.university.modelo.Professor;
import com.university.repositorio.RepositorioProfessor;


public class NegocioProfessor {
	private static RepositorioProfessor professoresNegocio = new RepositorioProfessor();


	public String inserirProfessor(Professor novoProfessor) {
		if(novoProfessor.getCpf().contains("abcdefghijklmnopqrstuvwxyz")) {
			return "Erro ao cadastrar, CPF inválido";
		}else
		professoresNegocio.inserirProfessor(novoProfessor);
		return "Cadastro realizado";
	}

	public void removerProfessor(int index) {
		professoresNegocio.removerProfessor(index);	}
	
	public ArrayList<Professor> getProfessorNegocio() {
		return professoresNegocio.retornarListaProfessor();
	}

	@Override
	public String toString() {
		return "" + professoresNegocio + "";
	}
}
