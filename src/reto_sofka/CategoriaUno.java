package reto_sofka;

import java.util.ArrayList;

public class CategoriaUno extends Categoria{
	
	
	public CategoriaUno(){
		super();//Llamo al constructor de la clase padre Categoria.
		premio=500000; //500 mil pesos por acertar la pregunta 1.
		//Opciones pregunta-PREGUNTA UNO.
		opcionesUno=new ArrayList<String>();
		opcionesUno.add("La pera.");
		opcionesUno.add("La manzana.");
		opcionesUno.add("La uva.");
		opcionesUno.add("La piña.");
		//Creo mi primera opción de pregunta
		preguntaUno=new Pregunta("¿Cuál de estas frutas debe necesariamente ser pelada antes de ser consumida?",opcionesUno,"d");
		//Agrego la pregunta creada a mi lista de preguntas.
		preguntas.add(preguntaUno);
		
		//Nota: Sigo con la misma lógica hasta llenar las 5 posibles preguntas de esta categoría.
		
		//PREGUNTA DOS.
		opcionesDos=new ArrayList<String>();
		opcionesDos.add("Una persona con gusto.");
		opcionesDos.add("Una tela fina.");
		opcionesDos.add("Un instrumento afinado.");
		opcionesDos.add("Una persona muerta.");
		preguntaDos=new Pregunta("¿Un finado es:",opcionesDos,"d");
		preguntas.add(preguntaDos);
		
		//PREGUNTA TRES.
		opcionesTres=new ArrayList<String>();
		opcionesTres.add("Enviarlo a una enfermería.");
		opcionesTres.add("Evitarlo con un amague.");
		opcionesTres.add("No darle ni gota de agua.");
		opcionesTres.add("Dejarlo sentado en la banca.");
		preguntaTres=new Pregunta("Romperle la cintura a un futbolista quiere decir:",opcionesTres,"b");
		preguntas.add(preguntaTres);
		
		//PREGUNTA CUATRO.
		opcionesCuatro=new ArrayList<String>();
		opcionesCuatro.add("Hacer un desplante.");
		opcionesCuatro.add("Hacer un cumplido.");
		opcionesCuatro.add("Hacer un favor.");
		opcionesCuatro.add("Hacer un envío.");
		preguntaCuatro=new Pregunta("Hacer 'un catorce' significa:",opcionesCuatro,"c");
		preguntas.add(preguntaCuatro);
		
		//PREGUNTA CINCO.
		opcionesCinco=new ArrayList<String>();
		opcionesCinco.add("Un tiburón.");
		opcionesCinco.add("Un búho.");
		opcionesCinco.add("Un canguro.");
		opcionesCinco.add("Una cabra.");
		preguntaCinco=new Pregunta("Complete la frase: 'Está más loco que...",opcionesCinco,"d");
		preguntas.add(preguntaCinco);
		
	}
	
	//Sobreescribo el método de mensaje de bienvenida.
	
	
	@Override
	public void mensaje(){
		System.out.println("Pregunta número 1, el premio si acierta es de 500.000 pesos.\n");
	}
	
	//Reescribimos el método para escoger la pregunta.
	@Override
	
	public Pregunta escogerPregunta(){
		int posicion=Random.obtenerPosicion(); //Método estático que me devuelve un número aleatorio entre 0 y 4.
		return preguntas.get(posicion);
	}

}
