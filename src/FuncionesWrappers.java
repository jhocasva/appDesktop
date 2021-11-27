public class FuncionesWrappers {
    public static void main (String[] args){
        System.out.println(args[0] + args[1]);

        Boolean valorBooleano = false;
        Boolean comparacion= valorBooleano.equals(false);
        System.out.println(comparacion);
        Boolean deStrigABoolean = Boolean.parseBoolean("false");
        System.out.println(deStrigABoolean);

        Byte numero = 4;
        Byte numero2 = 127;
        System.out.println(numero.compareTo(numero2));
        String numeroConvertido = numero.toString();
        System.out.println(numeroConvertido + numero2);
        System.out.println(Byte.valueOf(numeroConvertido) + numero2);

        Short numero3 = 30000;
        Short numero4 = 30000;
        System.out.println(numero3.equals(numero4)) ;

        Short shortConvertido =  Short.valueOf("30000");
        System.out.println(shortConvertido);

        Integer maximoValorEntero = Integer.MAX_VALUE;
        System.out.println(maximoValorEntero);

        Integer numero5 = 40;
        Integer numero6 = new Integer(40);

        Integer suma = Integer.sum(numero5, numero6);
        System.out.println(suma);

        System.out.println(Long.MAX_VALUE);

        Long numero7 = Long.valueOf("1200000");
        System.out.println(numero7);

        Float numero8 = 89f;
        numero8 = new Float(15679.98);
        int parteEntera =  numero8.intValue();
        System.out.println(parteEntera);
        float  parteDecimal  = numero8.floatValue();
        System.out.println(parteDecimal);

        System.out.println("el valor maximo flotante es: "  + Float.MAX_VALUE);

       Double numero9= new Double(23.3674);
        numero9 = 0.5;
        System.out.println(numero9.intValue());

        System.out.println(Double.MAX_VALUE);
        System.out.println("el numero de bits de un double es: "+ Double.SIZE);

       //caracter de un codigo ascii

        Character caracter = 'S' ;
        System.out.println((char) 97);
        System.out.println(Character.getNumericValue('j'));


        //String texto = " hola señora, como le va, cuando vino?";

        String texto = new String("hola SeñoRa, Como Le Va, Cuando vino?");
        String textoCambiado =  texto.replace("señora", "señorita");
        System.out.println(textoCambiado);


        System.out.println(texto.endsWith("vino?"));

        Boolean empiezaConMundo = texto.startsWith("mundo");
        System.out.println(empiezaConMundo);

        String[] textoDivididoPorEspacio = texto.split(" ");
        System.out.println(textoDivididoPorEspacio[0]);
        System.out.println(textoDivididoPorEspacio[6]);

        System.out.println(texto.contains("como"));

        String textoEnMayuscula = texto.toUpperCase();
        System.out.println(textoEnMayuscula);
        System.out.println(texto.toLowerCase());

        char caracterEnPosicio15= texto.charAt(15);
        System.out.println(caracterEnPosicio15);

        String texto2 = "oso";
        byte[] codigoAscii = texto2.getBytes();
        System.out.println(codigoAscii[0]);
        System.out.println(codigoAscii[1]);
        System.out.println(codigoAscii[2]);
        System.out.println(codigoAscii[0] + "," + codigoAscii[1] + ","+ codigoAscii[2]);




















    }
}
