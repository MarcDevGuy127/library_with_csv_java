package entities;

public abstract class Usuario {
	private String matricula, nome, tipoUsuario;
	
	// definindo o corpo de cada usuario
	public Usuario(String matricula, String nome, String tipoUsuario) {
		this.matricula = matricula;
		this.nome = nome;
		this.tipoUsuario = tipoUsuario;
	}

	// adicionando getters para apenas efetuar leitura das propriedades de Usuario
	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	
	// abstract method
	// public abstract double calcSomething();
}
