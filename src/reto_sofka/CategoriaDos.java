package reto_sofka;

import java.util.ArrayList;

public class CategoriaDos extends Categoria{
	public CategoriaDos(){
		super();//Llamo al constructor de la clase padre Categoria.
		premio=2000000; //2 millones de pesos por acertar la pregunta 2.
		//Opciones pregunta-PREGUNTA UNO.
		opcionesUno=new ArrayList<String>();
		opcionesUno.add("Aprender jugando.");
		opcionesUno.add("Practicar la lectura.");
		opcionesUno.add("Hacer tareas.");
		opcionesUno.add("Preparar las onces.");
		//Creo mi primera opción de pregunta
		preguntaUno=new Pregunta("En la educación infantil la ludoteca es el espacio destinado para:",opcionesUno,"a");
		//Agrego la pregunta creada a mi lista de preguntas.
		preguntas.add(preguntaUno);
		
		//Nota: Sigo con la misma lógica hasta llenar las 5 posibles preguntas de esta categoría.
		
		//PREGUNTA DOS.
		opcionesDos=new ArrayList<String>();
		opcionesDos.add("Word.");
		opcionesDos.add("Excel.");
		opcionesDos.add("Power Point.");
		opcionesDos.add("Photoshop.");
		preguntaDos=new Pregunta("Si la extensión de un archivo es '.xls', debe ser de:",opcionesDos,"b");
		preguntas.add(preguntaDos);
		
		//PREGUNTA TRES.
		opcionesTres=new ArrayList<String>();
		opcionesTres.add("La síntesis de la información.");
		opcionesTres.add("La firma del periodista investigador.");
		opcionesTres.add("Las recomendaciones para el lector.");
		opcionesTres.add("Las fuentes plenamente identificadas.");
		preguntaTres=new Pregunta("El titular de un periódico debe tener:",opcionesTres,"a");
		preguntas.add(preguntaTres);
		
		//PREGUNTA CUATRO.
		opcionesCuatro=new ArrayList<String>();
		opcionesCuatro.add("Arpa.");
		opcionesCuatro.add("Redoblante.");
		opcionesCuatro.add("Acordeón.");
		opcionesCuatro.add("Platillos.");
		preguntaCuatro=new Pregunta("Este instrumento hace parte obligatoria de un conjunto tradicional de Joropo.",opcionesCuatro,"a");
		preguntas.add(preguntaCuatro);
		
		//PREGUNTA CINCO.
		opcionesCinco=new ArrayList<String>();
		opcionesCinco.add("Ají.");
		opcionesCinco.add("Tomatín.");
		opcionesCinco.add("Jitomate.");
		opcionesCinco.add("Tomatón.");
		preguntaCinco=new Pregunta("¿Cómo se le dice al tomate en México?",opcionesCinco,"c");
		preguntas.add(preguntaCinco);
		
	}
	
	//Sobreescribo el método de mensaje de bienvenida.
	
	
	@Override
	public void mensaje(){
		System.out.println("Pregunta número 2, el premio si acierta es de 2'000.000 de pesos.\n");
	}
	
	//Reescribimos el método para escoger la pregunta.
	@Override
	
	public Pregunta escogerPregunta(){
		int posicion=Random.obtenerPosicion(); //Método estático que me devuelve un número aleatorio entre 0 y 4.
		return preguntas.get(posicion);
	}

}
