package reto_sofka;

public class Random {
	//Creo un m�todo est�tico para poder usarlo sin necesidad de instanciar esta clase.
	public static int obtenerPosicion(){
		int valor=(int)(Math.random()*5); //Devuelve un n�mero aleatorio entre 0 y 4 que corresponder� a la
		return valor;                    //posici�n de la pregunta escogida.
	}
}
