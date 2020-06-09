package teste;

import model.Cursos;

public class TestaEnum {

	/**
	 * Classe para demonstrar os testes do conceito ENUM
	 * 
	 * @author JPBonfa
	 * @since 28/05/2020
	 */
	public static void main(String[] args) {
		System.out.println("Curso de " + Cursos.COBOL + " tem a dura��o de "
				+ Cursos.COBOL.getHoras() + " horas.");
		System.out.println("Curso de " + Cursos.JAVA + " tem a dura��o de "
				+ Cursos.JAVA.getHoras() + " horas.");
		System.out.println("Curso de " + Cursos.PHP + " tem a dura��o de "
				+ Cursos.PHP.getHoras() + " horas.");
		System.out.println("Curso de " + Cursos.UNITY + " tem dura��o de "
				+ Cursos.UNITY.getHoras() + " horas.");

		System.out.println("\nTodos os cursos: ");
		for (Cursos c : Cursos.values()) {
			System.out.print(c + " com total de horas " + c.getHoras() + "\n");
		}

	}

}
