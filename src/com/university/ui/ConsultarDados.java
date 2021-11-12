package com.university.ui;

import com.university.negocio.NegocioCurso;
import com.university.negocio.NegocioProfessor;

public class ConsultarDados {
    private NegocioCurso crs;
    private NegocioProfessor prof;
    
    public ConsultarDados(NegocioCurso crs, NegocioProfessor prof) {
		super();
		this.crs = crs;
		this.prof = prof;
	}

	public String consultarCursoPorNome(String nome){
        String upper = nome.toUpperCase();
        boolean validacao = false;
        while (true) {
            for (int i = 0; i < crs.getCursosNegocio().size(); i++) {
                if (crs.getCursosNegocio().get(i).getNome().equals(upper)) {
                    validacao = true;
                    return crs.getCursosNegocio().get(i).getNome().toLowerCase();
                } else continue;
            }
            if (validacao == false){
                break;
            }
        } return "Esse curso não existe";
    }

    public String consultarProfessorPorCpf (String cpf){
    	while (cpf.length() < 11) {
			cpf = "0" + cpf;
		}
        String cpfFormatado = cpf.substring(0, 3) + "."
                + cpf.substring(3, 6) + "."
                + cpf.substring(6, 9) + "-"
                + cpf.substring(9, 11);

        boolean validacao = false;
        while (true) {
            for (int i = 0; i < prof.getProfessorNegocio().size(); i++) {
                if (prof.getProfessorNegocio().get(i).getCpf().equals(cpfFormatado)) {
                    validacao = true;
                    return prof.getProfessorNegocio().get(i).getNome() + " " + prof.getProfessorNegocio().get(i).getCpf();
                } else continue;
            }
            if (validacao == false){
                break;
            }
        } return "Esse Professor não existe";
    }
}
