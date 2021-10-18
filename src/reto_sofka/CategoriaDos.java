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
		//Creo mi primera opci�n de pregunta
		preguntaUno=new Pregunta("En la educaci�n infantil la ludoteca es el espacio destinado para:",opcionesUno,"a");
		//Agrego la pregunta creada a mi lista de preguntas.
		preguntas.add(preguntaUno);
		
		//Nota: Sigo con la misma l�gica hasta llenar las 5 posibles preguntas de esta categor�a.
		
		//PREGUNTA DOS.
		opcionesDos=new ArrayList<String>();
		opcionesDos.add("Word.");
		opcionesDos.add("Excel.");
		opcionesDos.add("Power Point.");
		opcionesDos.add("Photoshop.");
		preguntaDos=new Pregunta("Si la extensi�n de un archivo es '.xls', debe ser de:",opcionesDos,"b");
		preguntas.add(preguntaDos);
		
		//PREGUNTA TRES.
		opcionesTres=new ArrayList<String>();
		opcionesTres.add("La s�ntesis de la informaci�n.");
		opcionesTres.add("La firma del periodista investigador.");
		opcionesTres.add("Las recomendaciones para el lector.");
		opcionesTres.add("Las fuentes plenamente identificadas.");
		preguntaTres=new Pregunta("El titular de un peri�dico debe tener:",opcionesTres,"a");
		preguntas.add(preguntaTres);
		
		//PREGUNTA CUATRO.
		opcionesCuatro=new ArrayList<String>();
		opcionesCuatro.add("Arpa.");
		opcionesCuatro.add("Redoblante.");
		opcionesCuatro.add("Acorde�n.");
		opcionesCuatro.add("Platillos.");
		preguntaCuatro=new Pregunta("Este instrumento hace parte obligatoria de un conjunto tradicional de Joropo.",opcionesCuatro,"a");
		preguntas.add(preguntaCuatro);
		
		//PREGUNTA CINCO.
		opcionesCinco=new ArrayList<String>();
		opcionesCinco.add("Aj�.");
		opcionesCinco.add("Tomat�n.");
		opcionesCinco.add("Jitomate.");
		opcionesCinco.add("Tomat�n.");
		preguntaCinco=new Pregunta("�C�mo se le dice al tomate en M�xico?",opcionesCinco,"c");
		preguntas.add(preguntaCinco);
		
	}
	
	//Sobreescribo el m�todo de mensaje de bienvenida.
	
	
	@Override
	public void mensaje(){
		System.out.println("Pregunta n�mero 2, el premio si acierta es de 2'000.000 de pesos.\n");
	}
	
	//Reescribimos el m�todo para escoger la pregunta.
	@Override
	
	public Pregunta escogerPregunta(){
		int posicion=Random.obtenerPosicion(); //M�todo est�tico que me devuelve un n�mero aleatorio entre 0 y 4.
		return preguntas.get(posicion);
	}

}
