import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraArchivos {
    public static void main (String[] args) throws IOException {
        File archivo = new File("personas.txt");
        if(!archivo.exists()){
            System.out.println("el archivo no exista");
           archivo.createNewFile();
        }
        String textoAGuardar = "Jhonatan";
        FileWriter escritor  = new FileWriter(archivo,false);
        try{
            escritor.append(textoAGuardar);
        } catch(IOException error){
            error.getMessage();
        } finally {
            escritor.close();
        }


    }
}
