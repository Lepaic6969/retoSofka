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
		//Creo mi primera opción de pregunta
		preguntaUno=new Pregunta("¿Quién fue el primero en recibir un premio Nobel de Literatura?",opcionesUno,"c");
		//Agrego la pregunta creada a mi lista de preguntas.
		preguntas.add(preguntaUno);
		
		//Nota: Sigo con la misma lógica hasta llenar las 5 posibles preguntas de esta categoría.
		
		//PREGUNTA DOS.
		opcionesDos=new ArrayList<String>();
		opcionesDos.add("Hafnio.");
		opcionesDos.add("Cobalto.");
		opcionesDos.add("Berilio.");
		opcionesDos.add("Telurio.");
		preguntaDos=new Pregunta("¿Qué elemento químico fue nombrado en honor a un malvado duende del subsuelo?",opcionesDos,"b");
		preguntas.add(preguntaDos);
		
		//PREGUNTA TRES.
		opcionesTres=new ArrayList<String>();
		opcionesTres.add("Máquina segadora.");
		opcionesTres.add("Sombrero.");
		opcionesTres.add("Enfermedad.");
		opcionesTres.add("Horno.");
		preguntaTres=new Pregunta("¿A qué cosa también se lo conoce como Dalle?",opcionesTres,"a");
		preguntas.add(preguntaTres);
		
		//PREGUNTA CUATRO.
		opcionesCuatro=new ArrayList<String>();
		opcionesCuatro.add("Valentín.");
		opcionesCuatro.add("Eugenio.");
		opcionesCuatro.add("Gregorio.");
		opcionesCuatro.add("Jorge.");
		preguntaCuatro=new Pregunta("¿Qué nombre nunca ha adoptado un papa?",opcionesCuatro,"d");
		preguntas.add(preguntaCuatro);
		
		//PREGUNTA CINCO.
		opcionesCinco=new ArrayList<String>();
		opcionesCinco.add("Tienes un ataque de pánico.");
		opcionesCinco.add("Recuerdas un nombre.");
		opcionesCinco.add("Entiendes una broma.");
		opcionesCinco.add("Escuchas música.");
		preguntaCinco=new Pregunta("¿Los neurólogos creen que la corteza prefrontal del cerebro se activa cuando haces qué?",opcionesCinco,"c");
		preguntas.add(preguntaCinco);
		
	}
	
	//Sobreescribo el método de mensaje de bienvenida.
	
	
	@Override
	public void mensaje(){
		System.out.println("Pregunta número 5, el premio si acierta es de 25'000.000 de pesos.");
		System.out.println("Si lo hace bien esta vez, se llevará el PREMIO MAYOR de 40 millones de pesos.\n");
	}
	
	//Reescribimos el método para escoger la pregunta.
	@Override
	
	public Pregunta escogerPregunta(){
		int posicion=Random.obtenerPosicion(); //Método estático que me devuelve un número aleatorio entre 0 y 4.
		return preguntas.get(posicion);
	}

}
