import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//public class EstructurasDeControl{
//    public static void main(String[] args) throws IOException {




        /*System.out.println("ingrese un numero: " );
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String numero = lector.readLine();
        int numeroConvertidoAString = Integer.parseInt(numero);

        if (numeroConvertidoAString < 10){
            System.out.println("el numero es menor que 10");

        } else if (numeroConvertidoAString >= 10 && numeroConvertidoAString <= 20){
            System.out.println("el numero esta entre 10 y 20");

        }else {
            System.out.println("el numero es mayor que 20 ");
        }

        int numeroInicial = 100;

        for (int iterador = 0; iterador <= 99; iterador++){
           // System.out.println(iterador);
            System.out.println(numeroInicial);
            numeroInicial++;
            //System.out.println(iterador);
        }

        int suma = 0 ;
        int iterador = 0;
        int valorActual = 1000;
        int tercerOperador = 0;

        while (iterador <= 100){
            suma = suma + valorActual + tercerOperador;
            tercerOperador++;
            iterador++;
        }
        System.out.println("la suma total es : " + suma);

        int[] numeros = new int[1001];
        int iterador;
        int indice = 0;

        for (iterador = 1000; iterador <= 2000; iterador++){
            numeros[indice] = iterador;
            System.out.println(numeros[indice]);
            indice++;

        }
        iterador =  1000;
        int suma = 0;
        indice = 0;

        while(iterador <= 2000){
            suma = suma + numeros[indice];
            indice++;
            iterador++;



        }

        System.out.println(suma);

        System.out.println("ingrese el valor inical ");
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        int valorInicial = Integer.parseInt(lector.readLine()) ;

        System.out.println("ingrese el valor final");
        int valorFinal  =Integer.parseInt(lector.readLine());

        int valorIntermedio = valorInicial - 1;
        int sumatoriaGeneral ;
        int sumatoriaARestar;
        int sumatoriaFinal;

        sumatoriaGeneral =  (valorFinal * (valorFinal + 1)) /2;
        sumatoriaARestar=  (valorIntermedio * (valorInicial + 1)) / 2;
        sumatoriaFinal = sumatoriaGeneral - sumatoriaARestar;

        System.out.println(sumatoriaFinal);

        int respuesta = 17;

        System.out.println("ingrese un numero entre o y 20:");
        int valorIngresado = Integer.parseInt(lector.readLine());

        List<Integer> lista = new ArrayList<>();

        while (respuesta != valorIngresado){
           if (lista.contains(valorIngresado)){
               System.out.println("ya ingreso el valor");
           }else{
               lista.add(valorIngresado);
           }

            System.out.println("no le pego, ingrese otro numero entre 0 y 20:");
            valorIngresado = Integer.parseInt(lector.readLine());
        }

        System.out.println("has ganado");


        //System.out.println("ingrese 1 para sumar, 2 para restar, 3 para multiplicar o 4 para salir");
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String opcionElegida= lector.readLine();

        while (!opcionElegida.equals("4")){
            System.out.println("ingrese el numero 1:");
            int numero1 =  Integer.parseInt(lector.readLine());

            System.out.println("ingrese el numero 2: ");
            String numero2S = lector.readLine();
            int numero2 = Integer.parseInt(numero2S);

            if (opcionElegida.equals("1")){
                int suma = numero1 + numero2;
                System.out.println(suma);

            }else if (opcionElegida.equals("2")){

                int resta = numero1 - numero2;
                System.out.println(resta);
            } else{
                int multiplicación = numero1 * numero2;
                System.out.println(multiplicación);
            }
            System.out.println("ingrese 1 para sumar, 2 para restar, 3 para multiplicar o 4 para salir");
            opcionElegida= lector.readLine();

        }
        String opcionElegida = " ";
        do{
            System.out.println("ingrese 1 para sumar, 2 para restar, 3 para multiplicar o 4 para salir");
            opcionElegida= lector.readLine();

            System.out.println("ingrese el numero 1:");
            int numero1 =  Integer.parseInt(lector.readLine());

            System.out.println("ingrese el numero 2: ");
            String numero2S = lector.readLine();
            int numero2 = Integer.parseInt(numero2S);

            if(opcionElegida.equals("1")){
                int suma = numero1 + numero2;
                System.out.println(suma);
            }else if (opcionElegida.equals("2")){
                int resta = numero2 - numero1;

                System.out.println(resta);
            }else if (opcionElegida.equals("3")){
                int multiplicacion = numero1 * numero2;
                System.out.println(multiplicacion);
            }else{
                System.out.println("esta saliendo del programa");

            }

        }while(!opcionElegida.equals("4"));
        System.out.println();

        System.out.println("ingrese un mes en minuscula: ");
        String mes = lector.readLine();


        switch (mes){
            case "enero":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
            case "marzo":
                System.out.println("tiene 31 dias");
                break;

            case "febrero":
                System.out.println("tiene 28 dias");
                break;

            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":

                System.out.println("tiene 30");
                break;

            default:
                System.out.println("el valor ingresado no correponde a un mes ");
                break;

        System.out.println("ingrese la cantidad de lados que contiene la figura: ");
        String cantidadLados = lector.readLine();
        int lados = Integer.parseInt(cantidadLados);

        switch (lados){
            case 1:
            case 2:
                System.out.println("no es una figura geometrica");
                break;

            case 3 :
                System.out.println(" es un trainagulo");
                break;
            case 4:
                System.out.println("es un rectangulo o cuadrado");
                break;
            case 5:
                System.out.println("es un pentagono");
                break;
            case 6:
                System.out.println("es un hexagono");
                break;
            case 7:
                System.out.println("es un heptagono");
                break;
            case 8:
                System.out.println("es un octagono");
                break;
            case 9:
                System.out.println("es un nonagono");
                break;
            case 10:
                System.out.println("es un decagono");
                break;

            default:
                System.out.println("es un poligono de mas de 10 lados");


        }

        System.out.println("ingrese el valor de la compra");
        String valor = lector.readLine();
        int compra= Integer.parseInt(valor);

        System.out.println("ingrese la cantdad de productos");
        String cantidad = lector.readLine();
        int numeroProductos = Integer.parseInt(cantidad);
        double compraTotal = 0;
        double descuento = 0;

        switch (numeroProductos){
            case 1:
                System.out.println("no tiene descuento");
                break;
            case 2:
               descuento = compra * 0.05;
               break;
            case 3:
                descuento = compra * 0.1;
                break;
            case 4 :
                descuento = compra * 0.15;
                break;

            default:
                System.out.println("NO PUEDE COMPRAR MAS DE 4 PRODUCTO");
               break;


        }
        compraTotal = compra - descuento;
        System.out.println("el valor final de su compra es: " + compraTotal);







        }




    }
    /*
         */


