package com.university.negocio;

import java.util.ArrayList;

import com.university.modelo.Alocacao;
import com.university.repositorio.RepositorioAlocacao;


public class NegocioAlocacao {
	private static RepositorioAlocacao alocacoesNegocio = new RepositorioAlocacao();

	public String inserirAlocacao(Alocacao novaAlocacao) {
		try {
			boolean validacao = validacaoHorario(novaAlocacao);
			if (validacao == true) {
				alocacoesNegocio.inserirAlocacao(novaAlocacao);
				return "Cadastro realizado";
			}else throw new RuntimeException();
		}catch(RuntimeException e) {
			return "Erro ao cadastrar, o horário ja está ocupado pelo professor";
		}
		}
		
	
	private boolean validacaoHorario(Alocacao novaAlocacao) {
		for(Alocacao alocacao : getAlocacoesNegocio()) {
			if (alocacao.getProfessor().equals(novaAlocacao.getProfessor()) 
					&& alocacao.getDiaDaSemana().equals(novaAlocacao.getDiaDaSemana()) 
					&& alocacao.getHorario().equals(novaAlocacao.getHorario())) {
				return false;
			}
		}return true;
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

