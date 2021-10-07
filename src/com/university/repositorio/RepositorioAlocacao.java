package com.university.repositorio;

import java.util.ArrayList;

import com.university.modelo.Alocacao;


public class RepositorioAlocacao {
private ArrayList<Alocacao> alocacoesArray;
	
	//Construtor
	public RepositorioAlocacao() {
		this.alocacoesArray = new ArrayList<Alocacao>();
	}
	
	public void inserirAlocacao(Alocacao novaAlocacao) {
		this.alocacoesArray.add(novaAlocacao);
	}
	
	public void removerAlocacao(int index) {
		this.alocacoesArray.remove(index);
	}
	
	public ArrayList<Alocacao> retornarListaAlocacao() {
		return alocacoesArray;
	}

	@Override
	public String toString() {
		return "" + alocacoesArray + "";
	}
	
	
}