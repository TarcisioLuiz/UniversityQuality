package com.university.repositorio;

import java.util.ArrayList;

import com.university.modelo.Departamento;

public class RepositorioDepartamento {
private ArrayList<Departamento> departamentosArray;
	
	//Construtor
	public RepositorioDepartamento() {
		this.departamentosArray = new ArrayList<Departamento>();
	}
	
	public void inserirDeparetamento(Departamento novoDepartamento) {
		this.departamentosArray.add(novoDepartamento);
	}
	
	public void removerDepartamento(int index) {
		this.departamentosArray.remove(index);
	}
	
	public ArrayList<Departamento> retornarListaDepartamento() {
		return departamentosArray;
	}

	@Override
	public String toString() {
		return "" + departamentosArray + "";
	}
	
	
	

}
