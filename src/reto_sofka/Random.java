package reto_sofka;

public class Random {
	//Creo un método estático para poder usarlo sin necesidad de instanciar esta clase.
	public static int obtenerPosicion(){
		int valor=(int)(Math.random()*5); //Devuelve un número aleatorio entre 0 y 4 que corresponderá a la
		return valor;                    //posición de la pregunta escogida.
	}
}
