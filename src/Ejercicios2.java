import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios2 {
    public static void main(String[] args) throws IOException {
        System.out.println("ingrese un texto: ");
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String texto = lector.readLine();

        int tamano= texto.length();
        System.out.println("el tamano del texto es: " + tamano);





    }

}
