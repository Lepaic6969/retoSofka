package test;

import java.util.ArrayList;
import java.util.Scanner;

import reto_sofka.Categoria;
import reto_sofka.CategoriaCinco;
import reto_sofka.CategoriaCuatro;
import reto_sofka.CategoriaDos;
import reto_sofka.CategoriaTres;
import reto_sofka.CategoriaUno;
import reto_sofka.Persona;
import reto_sofka.Pregunta;

public class Juego {
	
	
	public static void jugar(Scanner sc,Persona persona){
		CategoriaUno categoriaUno=new CategoriaUno();     //Instancio las categor�as y las llevo a un ArrayList
		CategoriaDos categoriaDos=new CategoriaDos();    //Para que en cada ronda se escoja la pregunta de la categor�a correcta.
		CategoriaTres categoriaTres=new CategoriaTres();
		CategoriaCuatro categoriaCuatro=new CategoriaCuatro();
		CategoriaCinco categoriaCinco=new CategoriaCinco();
		ArrayList<Categoria> categorias=new ArrayList<Categoria>();
		//Agrego las diferentes categor�as.
		categorias.add(categoriaUno);
		categorias.add(categoriaDos);
		categorias.add(categoriaTres);
		categorias.add(categoriaCuatro);
		categorias.add(categoriaCinco);
		
		boolean flag=true; //Este es el responsable de que el juego continue.
		int contador=0;  //Esta va a ser la posici�n de la categor�a que quiero utilizar
		Categoria categoria;//Categor�a que depende de cuantas preguntas se haya contestado correctamente previamente.
		ArrayList<String> opcionesValidas=new ArrayList<String>(); //Para validar que la opci�n ingresada por el usuario est� entre las posibles respuestas.
		opcionesValidas.add("a");
		opcionesValidas.add("b");
		opcionesValidas.add("c"); //Opciones v�lidas.
		opcionesValidas.add("d");
		opcionesValidas.add("r");
		while(flag && contador<categorias.size()){
			categoria=categorias.get(contador);
			categoria.mensaje();
			Pregunta pregunta=categoria.escogerPregunta();
			System.out.println(pregunta);
			if(contador>0){ //Para que la opci�n de retirarse se haga desde la segunda pregunta
				            //ya que, en la primera no tendr�a sentido, no habr�a ganado nada.
				
				System.out.println("\n");
				System.out.println("NOTA: Si desea retirarse, ingrese 'r'. Recuerde que su acumulado es: $"+persona.getAcumulado());
				System.out.println("Si gana tendr�a: $"+(persona.getAcumulado()+categoria.getPremio())+" Si pierde se ir�a sin nada.");
			}
			
			String respuesta=sc.nextLine().toLowerCase();
			if(opcionesValidas.contains(respuesta)){
				if(pregunta.getOpcionCorrecta().equals(respuesta) && contador<categorias.size()-1){
					persona.setAcumulado(persona.getAcumulado()+categoria.getPremio());
					System.out.println("USTED ACERT�,FELICITACIONES; HA GANADO: $"+categoria.getPremio()+".");
					System.out.println("SU ACUMULADO ES DE: $"+persona.getAcumulado()+".\n");
					contador++;
					
				}else if(respuesta.equals("r") && contador>0){
					System.out.println("FELICITACIONES");
					System.out.println("USTED SE LLEVA UN ACUMULADO DE: $"+persona.getAcumulado()+".\n");
					System.out.println("Gracias por participar "+persona.getNombre());
					System.out.println("Fin del juego.");
					flag=false;
					
					
				}else if(respuesta.equals("r") && contador==0){
					System.out.println(persona.getNombre()+", la opci�n de rendirse no est� habilitada para la primera pregunta.");
					System.out.println("Por lo anterior se la concidera un dato inv�lido y usted queda descalificad@.");
					System.out.println("Fin del juego.");
					persona.setAcumulado(0);
					flag=false;
				}else if(pregunta.getOpcionCorrecta().equals(respuesta) && contador==categorias.size()-1){ //Para dar un mensaje al ganador del premio mayor.
					System.out.println("� FELICITACIONES "+persona.getNombre().toUpperCase()+", USTED HA GANADO EL PREMIO MAYOR DE 40`000.000 DE PESOS! ");
					System.out.println("GRACIAS POR PARTICIPAR, ES USTED UN(A) GENIO.");
					contador++;
				}else{
					
					System.out.println("Lamentablemente usted perdi�,la respuesta correcta era: "+pregunta.getOpcionCorrecta());
					System.out.println(persona.getNombre()+" Gracias por participar.");
					System.out.println("Fin del Juego.");
					persona.setAcumulado(0);
					flag=false;
				   }
			}else{
				System.out.println("Lamentablemente "+respuesta+", no corresponde a ninguna opci�n v�lida entre las posibles respuestas.");
				System.out.println(persona.getNombre()+" gracias por participar,ha sido descalificad@.");
				System.out.println("Fin del juego");
				persona.setAcumulado(0);
				flag=false;
			}
			
		}
		
		//Aqu� debe ir la conexi�n con la base de datos, donde le mandamos el nombre del usuario y el dinero que gan�.
			
		
	}
	public static void reglamento(Scanner sc,Persona persona){
		System.out.println("************************************************************************************************************************************************");
		System.out.println("REGLAMENTO:");
		System.out.println("Conteste las preguntas de selecci�n m�ltiple, hay s�lo una respuesta correcta entre 4 opciones posibles.");
		System.out.println("Son 5 preguntas en total.");
		System.out.println("Cada pregunta nueva ser� m�s dif�cil que la pregunta anterior.");
		System.out.println("A partir de la pregunta 2 tiene la opci�n de retirarse o de jugar, si se retira se lleva el acumulado, si juega y pierde, LO PIERDE TODO.");
		System.out.println("Por otro lado si juega y gana en las 5 preguntas se llevar� el premio mayor de 40 millones de pesos.");
		System.out.println("Si ingresa en el sistema una opci�n que no corresponde con las posibles respuestas, queda autom�ticamente descalificado.");
		System.out.println("************************************************************************************************************************************************");
		System.out.println("Ya conocido el regamento, vamos a jugar.");
		
		System.out.println("\n");
		
		//Una vez dado lectura al reglamento se procede a jugar.
		jugar(sc,persona);
	}

	public static void main(String[] args) {
		
		System.out.println("Antes de empezar por favor digite su nombre: ");
		Scanner sc=new Scanner(System.in);
		String nombre=sc.nextLine();
		Persona persona=new Persona(nombre);
		persona.saludar();
		
		//Men�
		System.out.println("Por favor seleccione la acci�n que desea realizar:");
		System.out.println("1.Jugar.");
		System.out.println("2.Consultar reglamento antes de jugar.");
		System.out.println("ADVERTENCIA:");
		System.out.println("Cualquier otro n�mero o caracter ingresado terminar� el juego. �TENGA CUIDADO!");
		System.out.println("Esto aplica para cualquier etapa del juego.");
		try{
			int opcionUsuario=Integer.parseInt(sc.nextLine());
			switch (opcionUsuario){
			case 1:
				jugar(sc,persona);
				break;
			case 2:
				reglamento(sc,persona);
				break;
			default:
				System.out.println("El n�mero ingresado no corresponde con las opciones dadas.");
				System.out.println("Gracias por participar "+nombre+", ha sido descalificad@.");
				System.out.println("Fin del juego.");
			}
		}catch(Exception e){
			System.out.println("El dato ingresado no es num�rico.");
			System.out.println("Gracias por participar "+nombre+", ha sido descalificad@.");
			System.out.println("Fin del juego.");
			
		}
		
	
		

	}

	
}

