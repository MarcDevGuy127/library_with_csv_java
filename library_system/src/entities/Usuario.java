package entities;

public abstract class Usuario {
	String matricula, nome, tipoUsuario;
	
	// definindo o corpo de cada usuário
	public Usuario(String matricula, String nome, String tipoUsuario) {
		this.matricula = matricula;
		this.nome = nome;
		this.tipoUsuario = tipoUsuario;
	}
	
	// abstract method
	// public abstract double calcSomething();
}
