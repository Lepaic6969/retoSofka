package reto_sofka;

import java.util.ArrayList;

public class Pregunta {
	//Atributos encapsulados
   private String enunciado;
   private ArrayList<String> opcionesDeRespuesta;
   private String opcionCorrecta;
   
   //Constructor
public Pregunta(String enunciado, ArrayList<String> opcionesDeRespuesta, String opcionCorrecta) {
	super();
	this.enunciado = enunciado;
	this.opcionesDeRespuesta = opcionesDeRespuesta;
	this.opcionCorrecta = opcionCorrecta;
}

//Metodo Getter para optener la opción correcta.

public String getOpcionCorrecta() {
	return opcionCorrecta;
}

//Reescribo el método toString() para imprimir en consola la pregunta con sus opciones de respuesta.

@Override
public String toString() {
	return enunciado + "\n"+"\n"+"a)"+opcionesDeRespuesta.get(0)+"\n"+"b)"+opcionesDeRespuesta.get(1)+ 
			"\n"+"c)"+opcionesDeRespuesta.get(2)+"\n"+"d)"+opcionesDeRespuesta.get(3);
}



   
   
}
