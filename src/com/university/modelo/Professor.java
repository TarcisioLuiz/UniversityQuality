package com.university.modelo;

public class Professor {
	private String nome;
	private String cpf;
	private Departamento departamento;

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

	public String getCpf() {
		
		String cpfFormatado = this.cpf.substring(0, 3) + "." 
							+ this.cpf.substring(3, 6) + "."
							+ this.cpf.substring(6, 9) + "-"
							+ this.cpf.substring(9, 11);
		
		return cpfFormatado;
	}

	private String completarCPF(String cpf) {
		while (cpf.length() < 11) {
			cpf = "0" + cpf;
		}
		
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if (cpf == null || cpf.length() == 0) {
			System.out.println("informe um cpf");
		} else if (cpf.length() > 11) {
			System.out.println("CPF deve ter no máximo 11 digitos");
		} else {
			String cpfCompleto = completarCPF(cpf);
			
			this.cpf = cpfCompleto;
		}
	}
	
	public void setCpf(long cpf) {
		String cpfEmString = String.valueOf(cpf);
		this.setCpf(cpfEmString);
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return nome + " " + cpf + " " + departamento;
	}
	

	
}
