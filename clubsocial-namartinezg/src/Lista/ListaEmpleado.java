package Lista;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;



import dataAcces.persona;

public class ListaEmpleado extends persona{

		







public ListaEmpleado(String nombre, String sexo, int fechaNacimiento, int numeroEmpleado, String puestoT) {
		super(nombre, sexo, fechaNacimiento, numeroEmpleado, puestoT);
		// TODO Auto-generated constructor stub
	}

 
	
	 
	

/*public static SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/YYYY");

Date fechaActual = new Date ();



public void   DateAString(Date fecha) {
	String fechaCadena = sdf.format(fecha);
		
	}*/







public void  lisG () {

	Scanner entrada = new Scanner(System.in);
	Scanner dt= new Scanner(System.in);

	
		System.out.println("Bienveenido a la seccion de rejistro por favor ingrese los datos correspondientes");
		System.out.println("Nombre completo");
		String nombre=entrada.nextLine();
		System.out.println("Genero");
		String sexo = entrada.nextLine();
		System.out.println("Fecha de nacimiento");
		int setfechaNacimiento = entrada.nextInt();
		System.out.println("Indique el numero de empleado");
		int numeroEmpleado = entrada.nextInt(); 
		System.out.println( "Puesto de trabajo");
		String puestoT = dt.nextLine();
		
	
		
	
		
		ListaEmpleado we = new ListaEmpleado(nombre, sexo, setfechaNacimiento, numeroEmpleado, puestoT);
		
		
		we.setNombre(nombre);
		we.setFechaNacimiento(setfechaNacimiento);
		
		we.setSexo(sexo);
		we.setNumeroEmpleado(numeroEmpleado);
		we.setPuestoT(puestoT);	
} 
ArrayList<persona> lista;
public void agenda() {

	lista = new ArrayList<persona>();
}
public void agregarPersona( String nombre,String sexo, int fechaNacimiento, int numeroEmpleado,String  puestoTrabajo) {
	
	persona guardar= new persona(nombre,sexo, fechaNacimiento, numeroEmpleado, puestoTrabajo );
	lista.add(guardar);
	
	
}
public void mostrar() {
	for(int i=0; i< lista.size(); i++) {
		System.out.println("Nombre"+lista.get(i).getNombre());
	}
	
}

	


		
	
}
	
		

