public class GestionCalculdora {
    public static void main(String[] args){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.duenio = "jhonatan";
        calculadora1.marca = "texas";

        Calculadora calculadora2 = new Calculadora();
        calculadora2.duenio = "johana";
        calculadora2.marca = "casio";

        System.out.println(calculadora1.sumar(8,9));

        String resultadoDivision = calculadora2.dividir(3,3);
        if(resultadoDivision.equals("?")){
            System.out.println("error matematatico");
        } else {
            System.out.println(resultadoDivision);
        }
    }
    }

