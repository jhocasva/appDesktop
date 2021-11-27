import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestionPersona {
    public static void main(String[] arg) throws IOException {
        /*Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();

        persona1.nombre = "pepe";
        persona1.altura = 1.55f;
        persona1.peso = 45;
        persona1.edad = 25;

        persona2.nombre = "jhon";
        persona2.altura  = 1.66f;
        persona2.peso = 60;
        persona2.edad = 29;

        persona3.nombre = "fulano";
        persona3.edad = 17;
        persona3.altura = 1.50f;
        persona3.peso = 70;

        persona1.asignarID();
        byte imcPersona1= persona1.calcularIMC();
        boolean mayorDeEdadPersona1 = persona1.esMayorDeEdad();

        System.out.println("documento identidad generado: " + persona1.documentoIdentidad);
        switch(imcPersona1){
            case -1:
                System.out.println("esta por debajo del peso");
                break;
            case 0:
                System.out.println("esta en el peso normal");
                break;
            case 1:
                System.out.println("tiene sobrepeso");
                break;
            case 8:
                System.out.println("tiene obesidad");
                break;
        }

        if(mayorDeEdadPersona1){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("es menor de edad");
        }*/

        System.out.println("escriba 1 para ingresar nuevo usario o 2 para salir");
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String opcionElegida= lector.readLine();
        List<Persona> listaNacidos = new ArrayList<>();
        File archivo = new File("personas.txt");
        if(!archivo.exists()){
            System.out.println("el archivo no exista");
            archivo.createNewFile();
        }
        FileWriter escritor  = new FileWriter(archivo,true);


        while(!opcionElegida.equals("2")){

            Persona persona = new Persona();

            System.out.println("ingrese un nombre:");
            String nombre1 = lector.readLine();
            persona.nombre = nombre1;
            System.out.println("ingrese una edad:");
            int edad1 =Integer.valueOf(lector.readLine() );
            persona.edad = edad1;
            System.out.println("ingrese el peso:");
            int peso1 = Integer.valueOf(lector.readLine());
            persona.peso = peso1;
            System.out.println("ingrese la estatura");
            float estatura1 = Float.valueOf(lector.readLine());
            persona.altura = estatura1;
            System.out.println("ingrese M si es masculino o F si es femenino ");
            String genero = lector.readLine();
            String generoEnMayuscula = genero.toUpperCase();
            persona.genero = generoEnMayuscula;

            persona.asignarID();
            System.out.println("documento identidad generado para la persona " + persona.nombre + ": " + persona.documentoIdentidad  );
            try{
                escritor.append(persona.toString() + "\n" );
            } catch(IOException error){
                error.getMessage();
            } //finally {

           // }

            listaNacidos.add(persona);



            byte imcPersona1= persona.calcularIMC();
            boolean mayorDeEdadPersona1 = persona.esMayorDeEdad();

            switch (imcPersona1){

                case -1:
                    System.out.println("esta por debajo del peso");
                    break;
                case 0:
                    System.out.println("esta en el peso normal");
                    break;
                case 1:
                    System.out.println("tiene sobrepeso");
                    break;
                case 8:
                    System.out.println("tiene obesidad");
                    break;

            }
            if(mayorDeEdadPersona1){
                System.out.println("es mayor de edad");
            }else{
                System.out.println("es menor de edad");
            }
            if(persona.genero.equals("M")){
                System.out.println("la persona es hombre");

            }else {
                System.out.println("la persona es mujer");
            }
            System.out.println("escriba 1 para ingresar un usuario o 2 para salir:");
            opcionElegida = lector.readLine();

        }
        System.out.println(listaNacidos);
        escritor.close();




    }

}
