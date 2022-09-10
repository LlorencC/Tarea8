package tarea8;

public class Electrodomestico {
	final double precioBase=100, pesoDefault=5;
	final String colorDefault="blanco";
	final String[] vColoresPermitidos={"blanco","negro","azul","gris"}; //we declare this array to check if the color that is given by the user is correct
	final char consumoElectricoDefault='F';
	final char[] vConsumoPermitido={'A','B','C','D','E','F'}; //we declare this array by the same reason of the String array
	double precio, peso;
	String color;
	char consumoElectrico;
	
	//Default Electrodomestico builder
	public Electrodomestico() {
		precio=precioBase;
		peso=pesoDefault;
		color=colorDefault;
		consumoElectrico=consumoElectricoDefault;
	}
	
	//Electrodomestico builder with price and weight given by the user
	public Electrodomestico(double precio, double peso) {
		this.precio=precio;
		this.peso=peso;
	}
	
	//Electrodomestico builder with all the atributes given by the user
	public Electrodomestico(double precio, double peso, String color, char consumoElectrico) {
		boolean colorCorrecto=false,consumoCorrecto=false;
		for (int i=0;i<vColoresPermitidos.length && !colorCorrecto;i++) { //we get sure that the color given by the user is correct
			if (vColoresPermitidos[i].equalsIgnoreCase(color)) {
				this.color=color;
				colorCorrecto=true;
			}
		}
		if (!colorCorrecto) { //if the color wasn't correct we change it by the default one
			this.color=colorDefault;
			System.out.println("ERROR! The consume specified is not valid. Using the default color...");
		}	
		for (int i=0;i<vConsumoPermitido.length && !consumoCorrecto;i++) { //we get sure that the consume given by the user is correct
			if (vConsumoPermitido[i]==consumoElectrico) {
				this.consumoElectrico=consumoElectrico;
				consumoCorrecto=true;
			}
		}	
		if (!consumoCorrecto) { //it the consume wasn't correct we4 change it by the default one
			System.out.println("ERROR! The color selected is not valid. Using the default electric consume...");
			this.consumoElectrico=consumoElectricoDefault;
		}
		this.precio=precio;
		this.peso=peso;
			
		}
	
	//testing method to print the atributes
	public void mostrarElectrodomestico() {
		System.out.println(this.precio);
		System.out.println(this.peso);
		System.out.println(this.color);
		System.out.println(this.consumoElectrico);
	}
}
