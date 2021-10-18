package reto_sofka;

import java.util.ArrayList;
//Esta es una clase padre para cada una de las 5 categor�as.
public  abstract class  Categoria {
	
	protected ArrayList<Pregunta> preguntas;
	protected int premio; //El premio ser� inicializado en cada una de las categor�as.
	protected ArrayList<String> opcionesUno,opcionesDos,opcionesTres,opcionesCuatro,opcionesCinco;
	protected Pregunta preguntaUno,preguntaDos,preguntaTres,preguntaCuatro,preguntaCinco,preguntaEscogida;
	
	public Categoria(){
		preguntas=new ArrayList<Pregunta>();//Inicializo el ArrayList para evitar errores de NullPointer
		
		
	}
	
	
	
	public int getPremio() {
		return premio;
	}



	public void mensaje(){
		System.out.println("Bienvenido a la pregunta n�mero x, el premio si aciertas es de "+premio+" pesos.");
	}
	
	public abstract Pregunta escogerPregunta();
	
	
	

}
