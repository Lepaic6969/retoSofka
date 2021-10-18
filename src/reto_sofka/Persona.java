package reto_sofka;

public class Persona {
	private String nombre;
	private int acumulado;
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		acumulado = 0 ;
	}
	
	//Saludo personalizado a cada participante.
	
	public void saludar(){
		System.out.println("***********************************************");
		System.out.println("Bienvenid@ "+nombre+", al programa 'SABER PAGA'");
		System.out.println("El programa que premia su conocimiento.");
		
		System.out.println("***********************************************");
	}

	
	
	//Métodos Getter y Setter para poder obtener y alterar el acumulado.
	
	
	public int getAcumulado() {
		return acumulado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setAcumulado(int acumulado) {
		this.acumulado = acumulado;
	}

}
