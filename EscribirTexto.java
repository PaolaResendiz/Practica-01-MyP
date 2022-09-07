import java.io.*;
/**
*
* @author Diana Isabel Ramírez García
* @version
*/
class EscribirTexto {

        BufferedWriter escritor = null;
        //Objeto del archivo
        FileWriter archivo = null;
        //cadenas a escribir
     public void EscribirString(String nombre, String linea){
        //Nombre de un archivo existente o no.
        String nombreArchivo = nombre;
        try{
			//Creamos el archivo en donde leeremos
            //Si ya existe lo sobreescribe por el contrario lo crea
			archivo=new FileWriter(nombreArchivo);
			//Creamos el objeto de lectura
			escritor=new BufferedWriter(archivo);

				//recuperamos el objeto
				escritor.write(linea);
				// escritor.write(linea2);
        } catch(FileNotFoundException e) {
            System.out.println("No se encontró tal archivo");
        } catch(IOException e) {
            System.out.println("Error "+ e);
        } finally {
            if (escritor!= null) {
                // System.out.println("Vamos a cerrar el flujo de "+ nombreArchivo);
                //usamos try porque puede suceder algún error
                try {
                    // Cerramos el flujo del escritor
                    escritor.close();
                    // Cerramos el flujo del archivo
                    archivo.close();
                    // System.out.println("Se recuperó con éxito");
                } catch (IOException e) {
                    System.out.println(e);
                }//cerramos catch dentro de finally
            }else {
                // System.out.println("No hay ningun archivo abierto.");
            }//cerramos la condicional
        }//cerramos finally
    }
}
