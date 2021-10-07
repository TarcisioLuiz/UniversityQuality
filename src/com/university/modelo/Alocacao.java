package com.university.modelo;
import java.time.DayOfWeek;



public class Alocacao {
	private Professor professor;
	private Curso curso;
	private DayOfWeek diaDaSemana;
	private String horario;
	

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public DayOfWeek getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(DayOfWeek diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return professor + " " + curso + " " + diaDaSemana + " "
				+ horario;
	}

	
}
