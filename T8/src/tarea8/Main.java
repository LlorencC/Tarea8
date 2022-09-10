package tarea8;

public class Main {

	public static void main(String[] args) {
		Persona persona=new Persona();
		persona.mostrarPersona();
		Persona persona2=new Persona("Edgar",19,'H');
		persona2.mostrarPersona();
		Persona persona3=new Persona("Edgar","39701273B",19,'H',57,1.76);
		persona3.mostrarPersona();
		
		System.out.println("----------------------------------------------------------------------------");
		
		Password contra=new Password();
		contra.mostrarPassword();
		Password contra2=new Password(10);
		contra2.mostrarPassword();
		
		System.out.println("----------------------------------------------------------------------------");
		
		Electrodomestico electro=new Electrodomestico();
		electro.mostrarElectrodomestico();
		Electrodomestico electro2=new Electrodomestico(678.4,78.1);
		electro2.mostrarElectrodomestico();
		Electrodomestico electro3=new Electrodomestico(432.1,34.4,"rosita",'Z');
		electro3.mostrarElectrodomestico();
		
		System.out.println("----------------------------------------------------------------------------");
		
		Serie serie=new Serie();
		serie.mostrarSerie();
		Serie serie2=new Serie("House", "David Shore");
		serie2.mostrarSerie();
		Serie serie3=new Serie("Casa da papé","Persona sobrevalorada","Perder el tiempo",5);
		serie3.mostrarSerie();
	}

}
