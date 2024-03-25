package practica_1;
import java.util.Scanner;


/**
 * La clase Notas permite ingresar, calcular y mostrar las notas
 * y verificar si el alumno ha aprobado
 * 
 * @author Ruben Campos
 * @version 1.0
 * @since 3/16/2024
 *
 */

public class notas {
	//declaramos las variables que nos hacen falta
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;
	//utilizamos Scanner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	
	/**
	 * Metodo que se usa para ingresar las notas del alumno
	 */
	
	public void IngresaNotas() {
		
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		uf1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();
		
	
	}
	
	/**
	 * Metodo que comprueba que las notas estan correctamente ingresadas
	 */
	
	public void comprobarcion(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
	}
	
	
	/**
	 * Metodo para calcular las notas acumuladas y la definitiva
	 */
	
	public void Calculonotas() {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
	}
	
	
	public double promedio() {
		double promedio = (uf1 + uf2 + uf3);
		return promedio;
	}


	
	
	/**
	 * Metodo que muestra la notas ingresadas y calculadas
	 */
	
	public void Mostrar() {
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		System.out.println("promedio =" + promedio());
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}
	
	/**
	 * Metodo para comprobar si el alumno ha aprobado
	 */

	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
	
	
		/**
		 * Metodo principal para ejecutar el programa
		 * @param args Argumentos de linea de comandos.
		 */
		
	public static void main(String[] args) {
		
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}


