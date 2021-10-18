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
		//Creo mi primera opción de pregunta
		preguntaUno=new Pregunta("¿Cuántas veces fue llevado al cine el libro 'Charlie y la Fábrica de Chocolate', escrito por Roald Dahl en 1964?",opcionesUno,"b");
		//Agrego la pregunta creada a mi lista de preguntas.
		preguntas.add(preguntaUno);
		
		//Nota: Sigo con la misma lógica hasta llenar las 5 posibles preguntas de esta categoría.
		
		//PREGUNTA DOS.
		opcionesDos=new ArrayList<String>();
		opcionesDos.add("EEUU.");
		opcionesDos.add("Rusia.");
		opcionesDos.add("China.");
		opcionesDos.add("Alemania.");
		preguntaDos=new Pregunta("Según el diario 'El País' de España, ¿desde mediados de la década pasada cuál es la principal potencia \n emisora de dióxido de carbono en el mundo, con el 28% del total del planeta?",opcionesDos,"c");
		preguntas.add(preguntaDos);
		
		//PREGUNTA TRES.
		opcionesTres=new ArrayList<String>();
		opcionesTres.add("Abierto de EEUU.");
		opcionesTres.add("Roland Garros.");
		opcionesTres.add("Wimbledon.");
		opcionesTres.add("Abierto de Australia.");
		preguntaTres=new Pregunta("¿Cuál es el torneo de Grand Slam que menos veces ganó el tenista español Rafael Nadal?",opcionesTres,"d");
		preguntas.add(preguntaTres);
		
		//PREGUNTA CUATRO.
		opcionesCuatro=new ArrayList<String>();
		opcionesCuatro.add("1903.");
		opcionesCuatro.add("1911.");
		opcionesCuatro.add("1895.");
		opcionesCuatro.add("1921.");
		preguntaCuatro=new Pregunta("¿En qué año se realizó el primer vuelo a motor por parte los hermanos Wright?",opcionesCuatro,"a");
		preguntas.add(preguntaCuatro);
		
		//PREGUNTA CINCO.
		opcionesCinco=new ArrayList<String>();
		opcionesCinco.add("HTML.");
		opcionesCinco.add("CSS.");
		opcionesCinco.add("Visual Studio Code.");
		opcionesCinco.add("JavaScript.");
		preguntaCinco=new Pregunta("¿Cuál de los siguientes es considerado un lenguaje de programación?",opcionesCinco,"d");
		preguntas.add(preguntaCinco);
		
	}
	
	//Sobreescribo el método de mensaje de bienvenida.
	
	
	@Override
	public void mensaje(){
		System.out.println("Pregunta número 4, el premio si acierta es de 9'000.000 de pesos.\n");
	}
	
	//Reescribimos el método para escoger la pregunta.
	@Override
	
	public Pregunta escogerPregunta(){
		int posicion=Random.obtenerPosicion(); //Método estático que me devuelve un número aleatorio entre 0 y 4.
		return preguntas.get(posicion);
	}


}
