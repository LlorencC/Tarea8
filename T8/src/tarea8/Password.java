package tarea8;

import java.util.Random;

public class Password {
	Random alea=new Random(System.currentTimeMillis());
	int longitud=8, contraseña;
	
	//default Password builder
	public Password() {
		int num=0,pass=0,tmp=1;
		for (int i=0;i<longitud;i++) { //in this for-loop we generate a random number that is multiplied by tmp variable that adds tenths to the total to increase the number
			num=alea.nextInt(9)+1;
			num=num*tmp;
			pass=pass+num;
			tmp=tmp*10;
			num=0;
		}
		contraseña=pass;
	}
	
	//Selected length Password builder
	public Password(int Usrlongitud) { //it do the same as the other loop
		int num=0,pass=0,tmp=1;
		for (int i=0;i<Usrlongitud;i++) {
			num=alea.nextInt(9)+1;
			num=num*tmp;
			pass=pass+num;
			tmp=tmp*10;
			num=0;
		}
		contraseña=pass;
	}
	
	//testing method to print the atributes
	public void mostrarPassword() {
		System.out.print(this.contraseña);
	}
	
}
