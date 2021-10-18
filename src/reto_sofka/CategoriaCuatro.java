package reto_sofka;

import java.util.ArrayList;

public class CategoriaCuatro extends Categoria{
	public CategoriaCuatro(){
		super();//Llamo al constructor de la clase padre Categoria.
		premio=9000000; //9 millones de pesos por acertar la pregunta 4.
		//Opciones pregunta-PREGUNTA UNO.
		opcionesUno=new ArrayList<String>();
		opcionesUno.add("Una vez.");
		opcionesUno.add("Dos veces.");
		opcionesUno.add("Tres veces.");
		opcionesUno.add("Cuatro veces.");
		//Creo mi primera opci�n de pregunta
		preguntaUno=new Pregunta("�Cu�ntas veces fue llevado al cine el libro 'Charlie y la F�brica de Chocolate', escrito por Roald Dahl en 1964?",opcionesUno,"b");
		//Agrego la pregunta creada a mi lista de preguntas.
		preguntas.add(preguntaUno);
		
		//Nota: Sigo con la misma l�gica hasta llenar las 5 posibles preguntas de esta categor�a.
		
		//PREGUNTA DOS.
		opcionesDos=new ArrayList<String>();
		opcionesDos.add("EEUU.");
		opcionesDos.add("Rusia.");
		opcionesDos.add("China.");
		opcionesDos.add("Alemania.");
		preguntaDos=new Pregunta("Seg�n el diario 'El Pa�s' de Espa�a, �desde mediados de la d�cada pasada cu�l es la principal potencia \n emisora de di�xido de carbono en el mundo, con el 28% del total del planeta?",opcionesDos,"c");
		preguntas.add(preguntaDos);
		
		//PREGUNTA TRES.
		opcionesTres=new ArrayList<String>();
		opcionesTres.add("Abierto de EEUU.");
		opcionesTres.add("Roland Garros.");
		opcionesTres.add("Wimbledon.");
		opcionesTres.add("Abierto de Australia.");
		preguntaTres=new Pregunta("�Cu�l es el torneo de Grand Slam que menos veces gan� el tenista espa�ol Rafael Nadal?",opcionesTres,"d");
		preguntas.add(preguntaTres);
		
		//PREGUNTA CUATRO.
		opcionesCuatro=new ArrayList<String>();
		opcionesCuatro.add("1903.");
		opcionesCuatro.add("1911.");
		opcionesCuatro.add("1895.");
		opcionesCuatro.add("1921.");
		preguntaCuatro=new Pregunta("�En qu� a�o se realiz� el primer vuelo a motor por parte los hermanos Wright?",opcionesCuatro,"a");
		preguntas.add(preguntaCuatro);
		
		//PREGUNTA CINCO.
		opcionesCinco=new ArrayList<String>();
		opcionesCinco.add("HTML.");
		opcionesCinco.add("CSS.");
		opcionesCinco.add("Visual Studio Code.");
		opcionesCinco.add("JavaScript.");
		preguntaCinco=new Pregunta("�Cu�l de los siguientes es considerado un lenguaje de programaci�n?",opcionesCinco,"d");
		preguntas.add(preguntaCinco);
		
	}
	
	//Sobreescribo el m�todo de mensaje de bienvenida.
	
	
	@Override
	public void mensaje(){
		System.out.println("Pregunta n�mero 4, el premio si acierta es de 9'000.000 de pesos.\n");
	}
	
	//Reescribimos el m�todo para escoger la pregunta.
	@Override
	
	public Pregunta escogerPregunta(){
		int posicion=Random.obtenerPosicion(); //M�todo est�tico que me devuelve un n�mero aleatorio entre 0 y 4.
		return preguntas.get(posicion);
	}


}
