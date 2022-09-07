import java.io.*;
/**
*
* @author Diana Isabel Ramírez García
* @version
*/
class LeerTexto {
        BufferedReader lector = null;
        FileReader archivo = null;
        String linea = null;
        public void LeerString(String nombreArchivo){
          try{
        //Creamos el archivo en donde leeremos
        archivo=new FileReader(nombreArchivo);
        //Creamos el objeto de lectura
        lector=new BufferedReader(archivo);
        //ciclo para leer todo el archivo
        do {
          //recuperamos el objeto
          linea = lector.readLine();
          System.out.println(linea);
        } while (linea != null);
          } catch(FileNotFoundException e) {
              System.out.println("No se encontró tal archivo");
          } catch(IOException e) {
              System.out.println("Error "+ e);
          } finally {
              if (lector!= null) {
                  // System.out.println("Vamos a cerrar el flujo de "+ nombreArchivo);
                  //usamos try porque puede suceder algún error
                  try {
                      // Cerramos el flujo del lector
                      lector.close();
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
