package com.university.modelo;

public class Departamento {
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.length() == 0) {
			System.out.println("informe um nome");
		} else {
			this.nome = nome;
		}
	}

	@Override
	public String toString() {
		return nome;
	}
	
	
}
