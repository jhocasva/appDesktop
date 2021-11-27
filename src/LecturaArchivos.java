import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LecturaArchivos {
    public static void main (String[] arg) throws IOException {
        File archivo = new File("personas.txt");
        FileReader lectorArchivo = new FileReader(archivo);
        BufferedReader lectorBuffer = new BufferedReader(lectorArchivo);
        /*int letra = lector.read();

        while (letra != -1){
            System.out.print((char) letra);
            letra = lector.read();

        }*/
        String linea = lectorBuffer.readLine();
        List<Persona> listaPersonas= new ArrayList<>();

        while (linea != null){
            String[] lineaDividida = linea.split(",");
            //System.out.println(linea);
            linea =lectorBuffer.readLine();

            Persona persona = new Persona();
            persona.nombre = lineaDividida[0];
            persona.edad = Integer.valueOf(lineaDividida[1]) ;
            persona.genero = lineaDividida[2];
            persona.peso = Float.valueOf(lineaDividida[3]);
            persona.altura = Float.valueOf(lineaDividida[4]);
            persona.documentoIdentidad = lineaDividida[5];

            byte imc = persona.calcularIMC();
            if(imc == -1){
                System.out.println(persona.nombre + "esta por debajo del peso");
            } else if (imc == 0){
                System.out.println(persona.nombre + "esta en el peso normal ");
            }else if (imc == 1){
                System.out.println(persona.nombre + "tiene sobrepeso");
            }else {
                System.out.println(persona.nombre + "tiene obesidad ");
            }

            listaPersonas.add(persona);//

        }
        System.out.println(listaPersonas);
    }

}
