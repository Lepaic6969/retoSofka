package reto_sofka;

import java.util.ArrayList;

public class CategoriaTres extends Categoria{
	public CategoriaTres(){
		super();//Llamo al constructor de la clase padre Categoria.
		premio=3500000; //3.5 millones de pesos por acertar la pregunta 3.
		//Opciones pregunta-PREGUNTA UNO.
		opcionesUno=new ArrayList<String>();
		opcionesUno.add("Talero.");
		opcionesUno.add("Florín.");
		opcionesUno.add("Colombiano.");
		opcionesUno.add("Real.");
		//Creo mi primera opción de pregunta
		preguntaUno=new Pregunta("Antes del peso, la moneda colombiana era el: ",opcionesUno,"d");
		//Agrego la pregunta creada a mi lista de preguntas.
		preguntas.add(preguntaUno);
		
		//Nota: Sigo con la misma lógica hasta llenar las 5 posibles preguntas de esta categoría.
		
		//PREGUNTA DOS.
		opcionesDos=new ArrayList<String>();
		opcionesDos.add("Blanco.");
		opcionesDos.add("Negro.");
		opcionesDos.add("Verde Azuloso.");
		opcionesDos.add("Violeta.");
		preguntaDos=new Pregunta("¿De qué color se ve la estatua de la libertad actualmente?",opcionesDos,"c");
		preguntas.add(preguntaDos);
		
		//PREGUNTA TRES.
		opcionesTres=new ArrayList<String>();
		opcionesTres.add("Irán.");
		opcionesTres.add("Arabia Saudita.");
		opcionesTres.add("Irak.");
		opcionesTres.add("Siria.");
		preguntaTres=new Pregunta("Saddan Hussein fue dictador de: ",opcionesTres,"c");
		preguntas.add(preguntaTres);
		
		//PREGUNTA CUATRO.
		opcionesCuatro=new ArrayList<String>();
		opcionesCuatro.add("Un reptil.");
		opcionesCuatro.add("Un ave.");
		opcionesCuatro.add("Un mamífero.");
		opcionesCuatro.add("Un insecto.");
		preguntaCuatro=new Pregunta("Un galápago es:",opcionesCuatro,"a");
		preguntas.add(preguntaCuatro);
		
		//PREGUNTA CINCO.
		opcionesCinco=new ArrayList<String>();
		opcionesCinco.add("Cinética.");
		opcionesCinco.add("Acústica.");
		opcionesCinco.add("Química.");
		opcionesCinco.add("Mecánica.");
		preguntaCinco=new Pregunta("¿Una batería genera energía eléctrica a partir de qué tipo de energía?",opcionesCinco,"c");
		preguntas.add(preguntaCinco);
		
	}
	
	//Sobreescribo el método de mensaje de bienvenida.
	
	
	@Override
	public void mensaje(){
		System.out.println("Pregunta número 3, el premio si acierta es de 3'500.000 pesos.\n");
	}
	
	//Reescribimos el método para escoger la pregunta.
	@Override
	
	public Pregunta escogerPregunta(){
		int posicion=Random.obtenerPosicion(); //Método estático que me devuelve un número aleatorio entre 0 y 4.
		return preguntas.get(posicion);
	}

}
