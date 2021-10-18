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
		CategoriaUno categoriaUno=new CategoriaUno();     //Instancio las categorías y las llevo a un ArrayList
		CategoriaDos categoriaDos=new CategoriaDos();    //Para que en cada ronda se escoja la pregunta de la categoría correcta.
		CategoriaTres categoriaTres=new CategoriaTres();
		CategoriaCuatro categoriaCuatro=new CategoriaCuatro();
		CategoriaCinco categoriaCinco=new CategoriaCinco();
		ArrayList<Categoria> categorias=new ArrayList<Categoria>();
		//Agrego las diferentes categorías.
		categorias.add(categoriaUno);
		categorias.add(categoriaDos);
		categorias.add(categoriaTres);
		categorias.add(categoriaCuatro);
		categorias.add(categoriaCinco);
		
		boolean flag=true; //Este es el responsable de que el juego continue.
		int contador=0;  //Esta va a ser la posición de la categoría que quiero utilizar
		Categoria categoria;//Categoría que depende de cuantas preguntas se haya contestado correctamente previamente.
		ArrayList<String> opcionesValidas=new ArrayList<String>(); //Para validar que la opción ingresada por el usuario esté entre las posibles respuestas.
		opcionesValidas.add("a");
		opcionesValidas.add("b");
		opcionesValidas.add("c"); //Opciones válidas.
		opcionesValidas.add("d");
		opcionesValidas.add("r");
		while(flag && contador<categorias.size()){
			categoria=categorias.get(contador);
			categoria.mensaje();
			Pregunta pregunta=categoria.escogerPregunta();
			System.out.println(pregunta);
			if(contador>0){ //Para que la opción de retirarse se haga desde la segunda pregunta
				            //ya que, en la primera no tendría sentido, no habría ganado nada.
				
				System.out.println("\n");
				System.out.println("NOTA: Si desea retirarse, ingrese 'r'. Recuerde que su acumulado es: $"+persona.getAcumulado());
				System.out.println("Si gana tendría: $"+(persona.getAcumulado()+categoria.getPremio())+" Si pierde se iría sin nada.");
			}
			
			String respuesta=sc.nextLine().toLowerCase();
			if(opcionesValidas.contains(respuesta)){
				if(pregunta.getOpcionCorrecta().equals(respuesta) && contador<categorias.size()-1){
					persona.setAcumulado(persona.getAcumulado()+categoria.getPremio());
					System.out.println("USTED ACERTÓ,FELICITACIONES; HA GANADO: $"+categoria.getPremio()+".");
					System.out.println("SU ACUMULADO ES DE: $"+persona.getAcumulado()+".\n");
					contador++;
					
				}else if(respuesta.equals("r") && contador>0){
					System.out.println("FELICITACIONES");
					System.out.println("USTED SE LLEVA UN ACUMULADO DE: $"+persona.getAcumulado()+".\n");
					System.out.println("Gracias por participar "+persona.getNombre());
					System.out.println("Fin del juego.");
					flag=false;
					
					
				}else if(respuesta.equals("r") && contador==0){
					System.out.println(persona.getNombre()+", la opción de rendirse no está habilitada para la primera pregunta.");
					System.out.println("Por lo anterior se la concidera un dato inválido y usted queda descalificad@.");
					System.out.println("Fin del juego.");
					persona.setAcumulado(0);
					flag=false;
				}else if(pregunta.getOpcionCorrecta().equals(respuesta) && contador==categorias.size()-1){ //Para dar un mensaje al ganador del premio mayor.
					System.out.println("¡ FELICITACIONES "+persona.getNombre().toUpperCase()+", USTED HA GANADO EL PREMIO MAYOR DE 40`000.000 DE PESOS! ");
					System.out.println("GRACIAS POR PARTICIPAR, ES USTED UN(A) GENIO.");
					contador++;
				}else{
					
					System.out.println("Lamentablemente usted perdió,la respuesta correcta era: "+pregunta.getOpcionCorrecta());
					System.out.println(persona.getNombre()+" Gracias por participar.");
					System.out.println("Fin del Juego.");
					persona.setAcumulado(0);
					flag=false;
				   }
			}else{
				System.out.println("Lamentablemente "+respuesta+", no corresponde a ninguna opción válida entre las posibles respuestas.");
				System.out.println(persona.getNombre()+" gracias por participar,ha sido descalificad@.");
				System.out.println("Fin del juego");
				persona.setAcumulado(0);
				flag=false;
			}
			
		}
		
		//Aquí debe ir la conexión con la base de datos, donde le mandamos el nombre del usuario y el dinero que ganó.
			
		
	}
	public static void reglamento(Scanner sc,Persona persona){
		System.out.println("************************************************************************************************************************************************");
		System.out.println("REGLAMENTO:");
		System.out.println("Conteste las preguntas de selección múltiple, hay sólo una respuesta correcta entre 4 opciones posibles.");
		System.out.println("Son 5 preguntas en total.");
		System.out.println("Cada pregunta nueva será más difícil que la pregunta anterior.");
		System.out.println("A partir de la pregunta 2 tiene la opción de retirarse o de jugar, si se retira se lleva el acumulado, si juega y pierde, LO PIERDE TODO.");
		System.out.println("Por otro lado si juega y gana en las 5 preguntas se llevará el premio mayor de 40 millones de pesos.");
		System.out.println("Si ingresa en el sistema una opción que no corresponde con las posibles respuestas, queda automáticamente descalificado.");
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
		
		//Menú
		System.out.println("Por favor seleccione la acción que desea realizar:");
		System.out.println("1.Jugar.");
		System.out.println("2.Consultar reglamento antes de jugar.");
		System.out.println("ADVERTENCIA:");
		System.out.println("Cualquier otro número o caracter ingresado terminará el juego. ¡TENGA CUIDADO!");
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
				System.out.println("El número ingresado no corresponde con las opciones dadas.");
				System.out.println("Gracias por participar "+nombre+", ha sido descalificad@.");
				System.out.println("Fin del juego.");
			}
		}catch(Exception e){
			System.out.println("El dato ingresado no es numérico.");
			System.out.println("Gracias por participar "+nombre+", ha sido descalificad@.");
			System.out.println("Fin del juego.");
			
		}
		
	
		

	}

	
}

