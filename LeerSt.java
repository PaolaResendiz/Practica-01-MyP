import java.io.*;
import java.util.Scanner;
/**
*
* @author Diana Isabel Ramírez García
* @version
*/
class LeerSt {
      public String LeerString(String nombreArchivo){
        String linea = null;
        Scanner in = null;
        FileReader archivo = null;
        try{
			//Creamos el archivo en donde leeremos
			archivo=new FileReader(nombreArchivo);
			//Creamos el objeto de lectura
			in = new Scanner(archivo);
			//ciclo para leer todo el archivo
			while (in.hasNext()) {
				//recuperamos el objeto
				linea = in.nextLine();
			}
        } catch(FileNotFoundException e) {
            System.out.println("No se encontró tal archivo");
        } finally {
            if (in!= null) {
                // System.out.println("Vamos a cerrar el flujo de "+ nombreArchivo);
                //usamos try porque puede suceder algún error
                try {
                    // Cerramos el flujo del in
                    in.close();
                    // Cerramos el flujo del archivo
                    archivo.close();
                    // System.out.println("Se recuperó con éxito");
                } catch (IOException e) {
                    System.out.println(e);
                }//cerramos catch dentro de finally
            }else {
                // System.out.println("No hay ningun archivo abierto.");
            }//cerramos la condicional
        }
        return linea;//cerramos finally
    }

}
