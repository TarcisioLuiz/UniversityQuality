package com.university.negocio;

import java.util.ArrayList;

import com.university.modelo.Departamento;
import com.university.repositorio.RepositorioDepartamento;


public class NegocioDepartamento {
	private static RepositorioDepartamento departamentosNegocio = new RepositorioDepartamento();

	
	public void inserirDeparetamento(Departamento novoDepartamento) {
		departamentosNegocio.inserirDeparetamento(novoDepartamento);
	}
	
	public void removerDepartamento(int index) {
		departamentosNegocio.removerDepartamento(index);
		}
	
	public ArrayList<Departamento> getDepartamentosNegocio() {
		return departamentosNegocio.retornarListaDepartamento();
	}

	@Override
	public String toString() {
		return "" + departamentosNegocio + "";
	}
	
	

}
