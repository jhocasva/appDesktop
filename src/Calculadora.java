public class Calculadora {

    String marca;
    String duenio;

    public int sumar(int numero1, int numero2){
        int resultadoSuma = numero1 + numero2;
        return resultadoSuma;

    }
    public int restar(int numero1, int numero2){
        int resultadoResta = numero2 -numero1;
        return resultadoResta;
    }
    public int multiplicar(int numero1, int numero2){
        int resultadoMultiplicacion = numero1 * numero2;
        return resultadoMultiplicacion;

    }
    public String dividir(int numero1, int numero2){
        if (numero2 == 0 ){
            return "?";
        }else {
            float resultadoDivision = numero1 / numero2;
            String resultadoConvertido = String.valueOf(resultadoDivision);
            return resultadoConvertido;
        }


    }


}
