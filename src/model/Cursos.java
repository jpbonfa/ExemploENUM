package model;

public enum Cursos {
	JAVA(180, "Noturno"), COBOL(160, "Vespertino"), PHP(40, "Diurno/Noturno"), UNITY(
			100, "Noturno/Vespertino");

	private int horas;
	private String periodo;

	Cursos(int horas, String periodo) {
		this.horas = horas;
		this.periodo = periodo;
	}

	public int getHoras() {
		return horas;
	}

	public String getPeriodo() {
		return periodo;
	}
	
	
}
