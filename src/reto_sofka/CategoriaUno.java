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
		opcionesUno.add("La pi�a.");
		//Creo mi primera opci�n de pregunta
		preguntaUno=new Pregunta("�Cu�l de estas frutas debe necesariamente ser pelada antes de ser consumida?",opcionesUno,"d");
		//Agrego la pregunta creada a mi lista de preguntas.
		preguntas.add(preguntaUno);
		
		//Nota: Sigo con la misma l�gica hasta llenar las 5 posibles preguntas de esta categor�a.
		
		//PREGUNTA DOS.
		opcionesDos=new ArrayList<String>();
		opcionesDos.add("Una persona con gusto.");
		opcionesDos.add("Una tela fina.");
		opcionesDos.add("Un instrumento afinado.");
		opcionesDos.add("Una persona muerta.");
		preguntaDos=new Pregunta("�Un finado es:",opcionesDos,"d");
		preguntas.add(preguntaDos);
		
		//PREGUNTA TRES.
		opcionesTres=new ArrayList<String>();
		opcionesTres.add("Enviarlo a una enfermer�a.");
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
		opcionesCuatro.add("Hacer un env�o.");
		preguntaCuatro=new Pregunta("Hacer 'un catorce' significa:",opcionesCuatro,"c");
		preguntas.add(preguntaCuatro);
		
		//PREGUNTA CINCO.
		opcionesCinco=new ArrayList<String>();
		opcionesCinco.add("Un tibur�n.");
		opcionesCinco.add("Un b�ho.");
		opcionesCinco.add("Un canguro.");
		opcionesCinco.add("Una cabra.");
		preguntaCinco=new Pregunta("Complete la frase: 'Est� m�s loco que...",opcionesCinco,"d");
		preguntas.add(preguntaCinco);
		
	}
	
	//Sobreescribo el m�todo de mensaje de bienvenida.
	
	
	@Override
	public void mensaje(){
		System.out.println("Pregunta n�mero 1, el premio si acierta es de 500.000 pesos.\n");
	}
	
	//Reescribimos el m�todo para escoger la pregunta.
	@Override
	
	public Pregunta escogerPregunta(){
		int posicion=Random.obtenerPosicion(); //M�todo est�tico que me devuelve un n�mero aleatorio entre 0 y 4.
		return preguntas.get(posicion);
	}

}
