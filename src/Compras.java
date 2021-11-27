public class Compras {
    public static void main(String[] args){

        Usuario usuarioJhonatan = new Usuario();
        usuarioJhonatan.nombre = "jhonatan";
        usuarioJhonatan.cedula =  "1.047.969.122";
        usuarioJhonatan.cuenta = "418.984.863";

        Usuario usuarioJohana = new Usuario();
        usuarioJohana.nombre = "Johana";
        usuarioJohana.cedula= "1234";
        usuarioJohana.cuenta = "12345667";

        System.out.println("la cedula del usuario jhonatan es: " + usuarioJhonatan.cedula);

        System.out.println("el numero de cuenta de johana es: "+  usuarioJohana.cuenta);

        Zapato zapato1 =  new Zapato();
        zapato1.marca = "nike";
        zapato1.precio = (float) 345.000;
        zapato1.referencia = "ref. 123";

        Zapato zapato2 = new Zapato();
        zapato2.marca = "reebook";
        zapato2.precio = 234.500f;
        zapato2.referencia = "ref2. 456";


       System.out.println("el precio del zapato 1 es: " + zapato1.precio);

       Carrito carrito1 = new Carrito();
       carrito1.zapatoComprado  = zapato2;
       carrito1.propietario = usuarioJhonatan;

       String nombrepropietario = carrito1.propietario.nombre;

       System.out.println("el nombre del propietario dl carrito 1 es: " + nombrepropietario);

         float preciozapatocarrito1 =  carrito1.zapatoComprado.precio;

       System.out.println("el precio del zapato del carrito 1 es: "+ preciozapatocarrito1);



    }

}
