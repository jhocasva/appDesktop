import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CompraCliente {
    public static void main(String[] args) throws IOException {

        System.out.println("ingrese 1 para generar factura o 2 para salir");
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String  opcion = lector.readLine();


        while (!opcion.equals("2")){

            System.out.println("ingrese el nombre del cliente:");
            String nombreCliente = lector.readLine();

            System.out.println("ingrese la cedula del cliente ");
            String cedulaCliente = lector.readLine();

            Cliente cliente1 = new Cliente(nombreCliente,cedulaCliente);

            String opcion2;
            List<Producto> listaProductos = new ArrayList<>();

            do{
                System.out.println("ingrese el nombre de producto comprado: ");
                String nombreProducto = lector.readLine();

                System.out.println("ingrese la cantidad del producto comprado");
                String  cantidadProducto = lector.readLine();
                int cantidadProductoInt = Integer.valueOf(cantidadProducto);

                System.out.println("ingrese el precio del producto comprado");
                float precioProducto = Float.valueOf(lector.readLine());
                Producto producto1 = new Producto(nombreProducto,precioProducto, cantidadProductoInt);
                listaProductos.add(producto1);

                System.out.println( "ingrese 0 para añadir otro producto o 1 para salir");
                opcion2 = lector.readLine();

            }while (!opcion2.equals("1"));

            String numeroFactura = asignarNumeroFactura();

            Factura factura = new Factura(listaProductos,cliente1,numeroFactura);
            System.out.println(factura.getTotalCompra());
            System.out.println(factura.calcularTotalFactura());
            System.out.println(factura.getTotalCompra());

        }
    }

    public static  String asignarNumeroFactura(){

        String numero = UUID.randomUUID().toString();

        return  numero;
    }

}
