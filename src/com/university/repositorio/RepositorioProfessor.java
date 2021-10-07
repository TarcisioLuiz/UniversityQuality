package com.university.repositorio;

import java.util.ArrayList;

import com.university.modelo.Professor;

public class RepositorioProfessor {
private ArrayList<Professor> professoresArray;
	
	//Construtor
	public RepositorioProfessor() {
		this.professoresArray = new ArrayList<Professor>();
	}
	
	public void inserirProfessor(Professor novoProfessor) {
		this.professoresArray.add(novoProfessor);
	}
	
	public void removerProfessor(int index) {
		this.professoresArray.remove(index);
		
	}
	
	public ArrayList<Professor> retornarListaProfessor() {
		return professoresArray;
	}

	@Override
	public String toString() {
		return "" + professoresArray + "";
	}
	
	
}
