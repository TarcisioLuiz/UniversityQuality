package com.university.repositorio;

import java.util.ArrayList;

import com.university.modelo.Curso;

public class RepositorioCurso {
	private ArrayList<Curso> cursosArray;
	
	//Constructor
	public RepositorioCurso() {
		this.cursosArray = new ArrayList<Curso>();
	}
	
	public void inserirCurso(Curso novoCurso) {
		this.cursosArray.add(novoCurso);
	}
	
	public void removerCurso(int index) {
		this.cursosArray.remove(index);
	}
	
	public ArrayList<Curso> retornarListaCurso() {
		return cursosArray;
	}

	@Override
	public String toString() {
		return "" + cursosArray + "";
	}

	
	
	
	
}
