package com.university.negocio;

import java.util.ArrayList;

import com.university.modelo.Alocacao;
import com.university.repositorio.RepositorioAlocacao;


public class negocioAlocacao {
	private static RepositorioAlocacao alocacoesNegocio = new RepositorioAlocacao();

	public boolean inserirAlocacao(Alocacao novaAlocacao) {
		for(Alocacao alocacao : getAlocacoesNegocio()) {
			if (alocacao.getProfessor().equals(novaAlocacao.getProfessor())) {
				if (alocacao.getDiaDaSemana().equals(novaAlocacao.getDiaDaSemana())){
					if (alocacao.getHorario().equals(novaAlocacao.getHorario())) {
						return false;
					}
				}
			}
		}
		alocacoesNegocio.inserirAlocacao(novaAlocacao);
		return true;
	}
	
	public void removerAlocacao(int index) {
		alocacoesNegocio.removerAlocacao(index);
	}

	public ArrayList<Alocacao> getAlocacoesNegocio() {
		return alocacoesNegocio.retornarListaAlocacao();
	}

	@Override
	public String toString() {
		return "" + alocacoesNegocio + "";
	}


	
	
	}

