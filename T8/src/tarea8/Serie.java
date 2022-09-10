package tarea8;

public class Serie {
	String titulo="", genero="", creador="";
	int numeroTemporadas=3;
	boolean entregado=false;
	
	//default Serie builder
	public Serie() {
		
	}
	
	//Serie builder with title and creator given by the user
	public Serie(String titulo, String creador) {
		this.titulo=titulo;
		this.creador=creador;
	}
	
	//Serie builder with all the atributes except committed given by the user
	public Serie(String titulo, String creador, String genero, int numeroTemporadas) {
		this.titulo=titulo;
		this.creador=creador;
		this.genero=genero;
		this.numeroTemporadas=numeroTemporadas;
	}
	
	//testing method to print the atributes
	public void mostrarSerie() {
		System.out.println(this.titulo);
		System.out.println(this.creador);
		System.out.println(this.genero);
		System.out.println(this.numeroTemporadas);
		System.out.println(this.entregado);
	}
}
