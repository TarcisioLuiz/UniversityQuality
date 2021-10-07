package com.university.negocio;

import java.util.ArrayList;

import com.university.modelo.Professor;
import com.university.repositorio.RepositorioProfessor;


public class NegocioProfessor {
	private static RepositorioProfessor professoresNegocio = new RepositorioProfessor();


	public void inserirProfessor(Professor novoProfessor) {
		professoresNegocio.inserirProfessor(novoProfessor);
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
