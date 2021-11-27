import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios1 {
    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese un texto: ");
        String texto = lector.readLine();

        Boolean resultado = texto.startsWith("p") || texto.startsWith("P");

        if (resultado == true){
            System.out.println("el texto si empienza con p, P : ");

        }else{
            System.out.println("el texto no empieza por P,p : ");
        }

        System.out.println("ingrese otro texto: ");
        texto = lector.readLine();
        resultado = texto.endsWith(".");

        if (resultado){
            System.out.println("el texto termina en .");

        }else{
            System.out.println("el texto no termina en . ");
        }

        System.out.println("ingrese un correo: ");
        String email = lector.readLine();

        String[] emailDividido = email.split("@");
        System.out.println("su correo es: " + emailDividido[0]);
        System.out.println("su dominio es: " + emailDividido[1]);

        System.out.println("ingrese un texto: ");
        String texto2 = lector.readLine();
        String textoConvertido = texto2.toLowerCase();

       int posicion =  textoConvertido.indexOf("a");
        System.out.println("la letra a esta en la posicion: " + posicion);

        System.out.println("ingrese una palabra de 4 letras: " );
        String palabra = lector.readLine();

        //String palabraReves = ((char)palabra.charAt(3) +  (char)palabra.charAt(2) + (char)palabra.charAt(1) + (char)palabra.charAt(0));
        String palabraReves = String.valueOf(palabra.charAt(3)) + String.valueOf(palabra.charAt(2)) + String.valueOf(palabra.charAt(1)) +
                String.valueOf(palabra.charAt(0));
        System.out.println(palabraReves);

        StringBuffer string = new StringBuffer(palabra);
        string.reverse();
        System.out.println(string);

        String parrafo = new String();

        System.out.println("ingrese un parrafo: ");
        parrafo = lector.readLine();

        String[] listaPlabras =  parrafo.split(" ");
        int cantidad = listaPlabras.length;
        System.out.println(cantidad);

        String nombre;
        System.out.println("ingrese un nombre de dos nombres y 2 apellidos: ");
        nombre = lector.readLine();
        String[] nombreDividido = nombre.split(" ");
        String nombre1 = nombreDividido[0];
        String nombre2 = nombreDividido[1];
        String apellido1 = nombreDividido[2];
        String apellido2 = nombreDividido[3];

        char inicialNombre1 = nombre1.charAt(0);
        char inicialNombre2 = nombre2.charAt(0);
        char inicailApellido1 = apellido1.charAt(0);
        char inicialApellido2 = apellido2.charAt(0);

        System.out.println(inicialNombre1 + "." + inicialNombre2 + "." + inicailApellido1 + "." + inicialApellido2);

        String fraseAprobar;
        System.out.println("ingrese una frase: ");
        fraseAprobar = lector.readLine();
        String fraseEnMinuscula = fraseAprobar.toLowerCase();
        String fraseSinEspacio  = fraseEnMinuscula.replace(" ", "");

        StringBuffer palabraAProbarBuffer = new StringBuffer(fraseAprobar);
        String palabraReversada = palabraAProbarBuffer.reverse().toString();
        String fraseAlReves = palabraReversada.toLowerCase().replace(" ", "");

        if (fraseSinEspacio.equals(fraseAlReves)){
            System.out.println("la frase  es palindromo");
        }else {
            System.out.println("no es palindromo");
        }






    }
}
