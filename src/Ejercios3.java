import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercios3 {
    public static void main(String[] args) throws IOException {
        String[] lista = new String[6];
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));


        for(int contador = 0; contador < 6; contador++){

            System.out.println("ingrese una palabra");
            lista[contador] = lector.readLine();
        }
        for (int i = 0; i < 6; i++){
            String palabraABuscar = lista[i];
            for(int j= i + 1 ; j < 6; j++ ){
                if(palabraABuscar.equals(lista[j]) ){
                    lista[j] = "repetido";

                }


            }

        }
       for(int i = 0; i < 6; i++){
           System.out.println(lista[i]);

       }


    }

}
