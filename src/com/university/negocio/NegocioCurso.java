package com.university.negocio;

import java.util.ArrayList;

import com.university.modelo.Curso;
import com.university.repositorio.RepositorioCurso;


public class NegocioCurso {
	private static RepositorioCurso cursosNegocio = new RepositorioCurso();

	
	public void inserirCurso(Curso novoCurso) {
		cursosNegocio.inserirCurso(novoCurso);
	}
	
	public void removerCurso(int index) {
		cursosNegocio.removerCurso(index);
	}

	public ArrayList<Curso> getCursosNegocio(){
		return cursosNegocio.retornarListaCurso();
	}

	@Override
	public String toString() {
		return "" + cursosNegocio  + "";
	}
	
	
	
}
