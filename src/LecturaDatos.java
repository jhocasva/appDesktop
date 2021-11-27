import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class LecturaDatos {
    public static void main (String[] args) throws IOException {
      String  nombre;
      System.out.println("ingrese su nombre: ");
      //nombre = System.console().readLine();
        BufferedReader lector =  new BufferedReader(new InputStreamReader(System.in));
        nombre = lector.readLine();
      System.out.println("el nombre ingresado es: " + nombre);

      String edad;
      System.out.println("ingrese su edad:");

      edad = lector.readLine();
      int edadConvertida = Integer.parseInt(edad);
      System.out.println("su nueva edad es: " + (edadConvertida + 5 ) );

      int [] enteros;
      enteros = new int[3];
      System.out.println("ingrese el numero 1: ");
      String numero1 = lector.readLine();
      enteros[0] =  Integer.parseInt(numero1);

      System.out.println("ingrese el numero 2: ");
      String numero2 = lector.readLine();
      enteros[1] = Integer.parseInt(numero2);

      System.out.println("ingrese el numero 3 : ");
      String numero3 = lector.readLine();
      enteros[2] = Integer.parseInt(numero3);

      System.out.println(enteros[0]);
      System.out.println(enteros[1]);
      System.out.println(enteros[2]);

      String[] palabras = new String[2];
      System.out.println("ingrese la palabra 1 : ");
      String palabra1 = lector.readLine();
      palabras[0] = palabra1;

      System.out.println("ingrese la palabra 2: ");
      String palabra2 = lector.readLine();
      palabras[1] = palabra2;

      System.out.println(palabras[0] + " " + palabras[1]);
      String[] dias = new String[] {"lunes", "jueves", "sabado"};
      System.out.println("dia 1: " + dias[0]);
      System.out.println("dia 2: " + dias[1]);
      System.out.println("dia 3: " + dias[2]);

      Usuario usuarioJhonatan = new Usuario();
      usuarioJhonatan.nombre = "jhonatan";
      usuarioJhonatan.cedula =  "1.047.969.122";
      usuarioJhonatan.cuenta = "418.984.863";

      Usuario usuarioJohana = new Usuario();
      usuarioJohana.nombre = "Johana";
      usuarioJohana.cedula= "1234";
      usuarioJohana.cuenta = "12345667";

      Usuario[] listaUsuarios = new Usuario[]{usuarioJhonatan, usuarioJohana};
      Usuario primerUsuario = listaUsuarios[0];
      System.out.println(primerUsuario.nombre);









    }
}

