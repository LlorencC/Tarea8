package tarea8;

public class Persona {
	private String nombre="",DNI;
	private int edad=0;
	private final char sexoDefault='H';
	private char sexo;
	private double peso=0, altura=0;
	
	//default Persona builder
	public Persona() {
		sexo=sexoDefault;
	}
	
	//Persona builder with the atributes name, age and gender given by the user
	public Persona(String nombre, int edad, char sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}
	
	//Persona builder with all the atributes given by the user
	public Persona(String nombre, String DNI, int edad, char sexo, double peso, double altura) {
		this.nombre=nombre;
		this.DNI=DNI;
		this.edad=edad;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
	}
	
	//testing method to print the atributes
	public void mostrarPersona() {
		System.out.println(this.nombre);
		System.out.println(this.DNI);
		System.out.println(this.edad);
		System.out.println(this.sexo);
		System.out.println(this.peso);
		System.out.println(this.altura);
	}
}
