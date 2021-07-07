
package escribe;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ClaseFlieReader {
    public static void main(String[] escribir) {
        String texto="";
        try{
            BufferedReader br;
            FileReader fr = new FileReader("leer.txt");
            br=new BufferedReader(fr);
            System.out.println("El texto contenido en el archivo leer.txt es:");
            String linea = br.readLine();
            while(linea !=null){
                System.out.println(linea);
                linea=br.readLine();
            }
            br.close();
        }catch(IOException ioe){
            System.out.println("Error al abrir o guardar el archivo");
            ioe.printStackTrace();
        }catch(Exception e){
            System.out.println("Error al leer del teclado");
            e.printStackTrace();
        }
            
    }
}
