import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    public static void main(String[] args) throws IOException {
        Cliente[] listaClientes = new Cliente[5];
        int[] listaEnteros = new int[10];
        String[] listaString = new String[50];
        Cliente cliente1 = new Cliente( "jhonatan", "1047969122");
        Cliente cliente2 = new Cliente( "esteban", "6047969345");
        Cliente cliente4 = new Cliente( "pedro", "3047969345");
        Cliente cliente5 = new Cliente( "camilo", "9047969345");
        Cliente cliente6=new Cliente("juan", "4238423940349");
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));



        listaClientes[0] = cliente1;
        listaClientes[1] = cliente2;
        listaClientes[2] = cliente4;
        listaClientes[3] = cliente5;
        listaClientes[4] = cliente6;

        Cliente cliente3 = listaClientes[0];

        System.out.println(cliente3);
        System.out.println(cliente1);

        cliente3 = listaClientes[1];

        System.out.println(cliente3);
        System.out.println(cliente2);

        //listaEnteros[0] = 1000;
       // listaEnteros[1] = 2000;

        int suma = listaEnteros[0] + listaEnteros[1];
        System.out.println(suma);

        listaString[0] = "hola";
        listaString[1] = "mundo";

        System.out.println(listaString[0] + listaString[1]);

        System.out.println("ingrese la cantidad de numeros que desea ingresar: ");
        int tamanio = Integer.valueOf(lector.readLine());
        //int tamanio = listaEnteros.length;


        for(int iterador = 0; iterador < tamanio; iterador++){
            System.out.println("ingrese un numero " + (iterador+1) + ":");
            int numero = Integer.valueOf(lector.readLine());

            if(numero < 100){
                listaEnteros[iterador] = numero;
            }


        }
        int suma2 = 0;


        for(int iterador = 0; iterador < tamanio; iterador++){

            suma2 = suma2 + listaEnteros[iterador];
        }
        System.out.println(suma2);

        suma = 0;

        for (int numero : listaEnteros) {

            System.out.println(numero);
            suma = suma + numero;

        }
        System.out.println(suma);
        String acumuladorNombres = "";

        for(Cliente cliente: listaClientes){
            acumuladorNombres = acumuladorNombres + cliente.getNombre() + " ";
        }
        System.out.println("estos son los clientes " + acumuladorNombres);

        String acumuladorCedula = "";

        for(int iterador = 0; iterador <= 4; iterador++ ){
            Cliente cliente = listaClientes[iterador];

            acumuladorCedula = acumuladorCedula + cliente.getCedula() + " ";

        }
        System.out.println("las cedulas de los clientes son : " + acumuladorCedula);
        acumuladorCedula = "";

        for(Cliente cliente : listaClientes){
           acumuladorCedula = acumuladorCedula + cliente.getCedula()+ "  ";
        }
        System.out.println("loscedlas de los clientes son: " + acumuladorCedula);

    }
}
