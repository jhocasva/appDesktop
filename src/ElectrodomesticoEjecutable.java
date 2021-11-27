public class ElectrodomesticoEjecutable {

    public static void main(String[] args) {

        Electrodomestico electrodomestico1 = new Electrodomestico("gris",50,"lavadora","d");
        Electrodomestico electrodomestico2 = new Electrodomestico("negro",80,"f");
        Electrodomestico electrodomestico3 = new Electrodomestico("rojo",120,"j");

        electrodomestico2.setTipo("nevera");

        if(electrodomestico1.validarColor()){
            System.out.println("el color del electrodomestico1 esta disponible");
        } else{
            System.out.println("ese color no esta disponoble");
        }

        if(electrodomestico1.validarConsumoEnergitico()){
            System.out.println("el consumo energetico es valido");
        }else{
            System.out.println("el consumo es invalido");
        }

        float precioFinal = electrodomestico1.calcularPrecioFinal();
        System.out.println("el precio final del electrodomestico1 es " + precioFinal);

        if(electrodomestico2.validarColor()){
            System.out.println("el color esta disponible");
        }else {
            System.out.println("el color no esta disponoble");
        }

        if(electrodomestico2.validarConsumoEnergitico()){
            System.out.println("el consumo energetico es valido");
        }else{
            System.out.println("el consumo es invalido");
        }

         precioFinal = electrodomestico2.calcularPrecioFinal();
        System.out.println("el precio del electrodomestico2 es" + precioFinal);

        if(electrodomestico3.validarColor()){
            System.out.println("el color esta disponible");
        }else{
            System.out.println("el color no esta disponible");
        }

        if(electrodomestico3.validarConsumoEnergitico()){
            System.out.println("el consumo es valido");
        }else{
            System.out.println("el consumo es invalido");
        }

        precioFinal = electrodomestico3.calcularPrecioFinal();


        if(precioFinal == 0){
            System.out.println("no se puede ejecutar el calculo");
        }else{
            System.out.println("se puedo calcular bien");
        }




    }
}
