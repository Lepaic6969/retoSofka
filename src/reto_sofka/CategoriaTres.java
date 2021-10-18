package reto_sofka;

import java.util.ArrayList;

public class CategoriaTres extends Categoria{
	public CategoriaTres(){
		super();//Llamo al constructor de la clase padre Categoria.
		premio=3500000; //3.5 millones de pesos por acertar la pregunta 3.
		//Opciones pregunta-PREGUNTA UNO.
		opcionesUno=new ArrayList<String>();
		opcionesUno.add("Talero.");
		opcionesUno.add("Flor�n.");
		opcionesUno.add("Colombiano.");
		opcionesUno.add("Real.");
		//Creo mi primera opci�n de pregunta
		preguntaUno=new Pregunta("Antes del peso, la moneda colombiana era el: ",opcionesUno,"d");
		//Agrego la pregunta creada a mi lista de preguntas.
		preguntas.add(preguntaUno);
		
		//Nota: Sigo con la misma l�gica hasta llenar las 5 posibles preguntas de esta categor�a.
		
		//PREGUNTA DOS.
		opcionesDos=new ArrayList<String>();
		opcionesDos.add("Blanco.");
		opcionesDos.add("Negro.");
		opcionesDos.add("Verde Azuloso.");
		opcionesDos.add("Violeta.");
		preguntaDos=new Pregunta("�De qu� color se ve la estatua de la libertad actualmente?",opcionesDos,"c");
		preguntas.add(preguntaDos);
		
		//PREGUNTA TRES.
		opcionesTres=new ArrayList<String>();
		opcionesTres.add("Ir�n.");
		opcionesTres.add("Arabia Saudita.");
		opcionesTres.add("Irak.");
		opcionesTres.add("Siria.");
		preguntaTres=new Pregunta("Saddan Hussein fue dictador de: ",opcionesTres,"c");
		preguntas.add(preguntaTres);
		
		//PREGUNTA CUATRO.
		opcionesCuatro=new ArrayList<String>();
		opcionesCuatro.add("Un reptil.");
		opcionesCuatro.add("Un ave.");
		opcionesCuatro.add("Un mam�fero.");
		opcionesCuatro.add("Un insecto.");
		preguntaCuatro=new Pregunta("Un gal�pago es:",opcionesCuatro,"a");
		preguntas.add(preguntaCuatro);
		
		//PREGUNTA CINCO.
		opcionesCinco=new ArrayList<String>();
		opcionesCinco.add("Cin�tica.");
		opcionesCinco.add("Ac�stica.");
		opcionesCinco.add("Qu�mica.");
		opcionesCinco.add("Mec�nica.");
		preguntaCinco=new Pregunta("�Una bater�a genera energ�a el�ctrica a partir de qu� tipo de energ�a?",opcionesCinco,"c");
		preguntas.add(preguntaCinco);
		
	}
	
	//Sobreescribo el m�todo de mensaje de bienvenida.
	
	
	@Override
	public void mensaje(){
		System.out.println("Pregunta n�mero 3, el premio si acierta es de 3'500.000 pesos.\n");
	}
	
	//Reescribimos el m�todo para escoger la pregunta.
	@Override
	
	public Pregunta escogerPregunta(){
		int posicion=Random.obtenerPosicion(); //M�todo est�tico que me devuelve un n�mero aleatorio entre 0 y 4.
		return preguntas.get(posicion);
	}

}
