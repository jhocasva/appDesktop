import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) throws IOException {
        List<Integer> listaEnteros;// declarar
        listaEnteros = new ArrayList<>(); //instanciar
        String palabra = "hola"; //inicializar
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("ingrese 1 para agregar un numero o 2 para salir:");
        String opcionElegida = lector.readLine();

        while(!opcionElegida.equals("2")){
            System.out.println("ingrese un numero");
            String numero = lector.readLine();
            int numeroConvertido = Integer.valueOf(numero);

            listaEnteros.add(numeroConvertido);
            System.out.println("ingrese 1 para agregar un numero o 2 para salir");
            opcionElegida = lector.readLine();
        }
        int acumuladorNumeros = 0;

        for(Integer numero : listaEnteros ){
            acumuladorNumeros = acumuladorNumeros + numero;
        }
        if(!listaEnteros.isEmpty()){
            float promedio = acumuladorNumeros / listaEnteros.size();
            System.out.println(promedio);
        }

        List<Persona2> listaPersonas = new ArrayList<>();
        System.out.println("ingrese 0 para salir o 1 para agregar una persona");
        opcionElegida= lector.readLine();

        while(!opcionElegida.equals("0")){
            System.out.println("ingrese la edad de la persona ");
            int edadPersona =Integer.valueOf(lector.readLine()) ;
            Persona2 persona = new Persona2(edadPersona);

            listaPersonas.add(persona);

            System.out.println("ingrese 0 para salir o 1 para agregar una persona");
            opcionElegida= lector.readLine();
        }
        int acumuladorEdades = 0;

        for(Persona2 persona: listaPersonas){
            acumuladorEdades = acumuladorEdades + persona.getEdad();
        }

        if(!listaPersonas.isEmpty()){
            float promedio = acumuladorEdades / listaPersonas.size();
            System.out.println(promedio);
        }









    }
}
