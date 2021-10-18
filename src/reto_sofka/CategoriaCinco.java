package reto_sofka;

import java.util.ArrayList;

public class CategoriaCinco extends Categoria{
	public CategoriaCinco(){
		super();//Llamo al constructor de la clase padre Categoria.
		premio=25000000; //25 millones de pesos por acertar la pregunta 5.
		//Opciones pregunta-PREGUNTA UNO.
		opcionesUno=new ArrayList<String>();
		opcionesUno.add("Un novelista.");
		opcionesUno.add("Un dramaturgo.");
		opcionesUno.add("Un poeta.");
		opcionesUno.add("Un ensayista.");
		//Creo mi primera opci�n de pregunta
		preguntaUno=new Pregunta("�Qui�n fue el primero en recibir un premio Nobel de Literatura?",opcionesUno,"c");
		//Agrego la pregunta creada a mi lista de preguntas.
		preguntas.add(preguntaUno);
		
		//Nota: Sigo con la misma l�gica hasta llenar las 5 posibles preguntas de esta categor�a.
		
		//PREGUNTA DOS.
		opcionesDos=new ArrayList<String>();
		opcionesDos.add("Hafnio.");
		opcionesDos.add("Cobalto.");
		opcionesDos.add("Berilio.");
		opcionesDos.add("Telurio.");
		preguntaDos=new Pregunta("�Qu� elemento qu�mico fue nombrado en honor a un malvado duende del subsuelo?",opcionesDos,"b");
		preguntas.add(preguntaDos);
		
		//PREGUNTA TRES.
		opcionesTres=new ArrayList<String>();
		opcionesTres.add("M�quina segadora.");
		opcionesTres.add("Sombrero.");
		opcionesTres.add("Enfermedad.");
		opcionesTres.add("Horno.");
		preguntaTres=new Pregunta("�A qu� cosa tambi�n se lo conoce como Dalle?",opcionesTres,"a");
		preguntas.add(preguntaTres);
		
		//PREGUNTA CUATRO.
		opcionesCuatro=new ArrayList<String>();
		opcionesCuatro.add("Valent�n.");
		opcionesCuatro.add("Eugenio.");
		opcionesCuatro.add("Gregorio.");
		opcionesCuatro.add("Jorge.");
		preguntaCuatro=new Pregunta("�Qu� nombre nunca ha adoptado un papa?",opcionesCuatro,"d");
		preguntas.add(preguntaCuatro);
		
		//PREGUNTA CINCO.
		opcionesCinco=new ArrayList<String>();
		opcionesCinco.add("Tienes un ataque de p�nico.");
		opcionesCinco.add("Recuerdas un nombre.");
		opcionesCinco.add("Entiendes una broma.");
		opcionesCinco.add("Escuchas m�sica.");
		preguntaCinco=new Pregunta("�Los neur�logos creen que la corteza prefrontal del cerebro se activa cuando haces qu�?",opcionesCinco,"c");
		preguntas.add(preguntaCinco);
		
	}
	
	//Sobreescribo el m�todo de mensaje de bienvenida.
	
	
	@Override
	public void mensaje(){
		System.out.println("Pregunta n�mero 5, el premio si acierta es de 25'000.000 de pesos.");
		System.out.println("Si lo hace bien esta vez, se llevar� el PREMIO MAYOR de 40 millones de pesos.\n");
	}
	
	//Reescribimos el m�todo para escoger la pregunta.
	@Override
	
	public Pregunta escogerPregunta(){
		int posicion=Random.obtenerPosicion(); //M�todo est�tico que me devuelve un n�mero aleatorio entre 0 y 4.
		return preguntas.get(posicion);
	}

}
