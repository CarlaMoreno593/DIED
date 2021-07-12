package prueba.claseFile;

import java.io.File;

public class ClaseFileEjemplos {

	public static void main(String[] args) {

		System.out.println("C:\\hola\\quehace");
		
		
		//Estos archivos no existen, por lo que si hago exists() va a dar false. Puedo crear el archivo con createNewFile() para archivo
		//o mkdirs() para directorios-> Crea en el FS el archivo físico.
		
		File f1 = new File("E:\\Documentos\\Directorio2");
		File f2 = new File(f1, "docprueba.txt");
		
		System.out.println("Imprime lo que tiene "+f1.getName() + "en " + f1.getAbsolutePath());
		
		for(String unnombre: f1.list()) {
			
			System.out.println(unnombre);
			
		}
		
		System.out.println("Nombre: " + f1.getName() + " se convierte a: " + f1.renameTo(new File("E:\\Documentos\\Directorio3")));
		System.out.println(f1.getName());
		System.out.println(f1.getName());
		
	
	}

}
