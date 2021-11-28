import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Factura {

    private float totalCompra;
    private List<Producto> listaProductos = new ArrayList<>();
    private Cliente cliente;
    private String numeroFactura;

    public Factura( List<Producto> listaProductos, Cliente cliente) {
        this.listaProductos = listaProductos;
        this.cliente = cliente;
        this.numeroFactura = asignarNumeroFactura();
        this.totalCompra = calcularTotalFactura();
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public float getTotalCompra() {
        return totalCompra;
    }


    public List<Producto> getListaProductos() {

        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        String encabezado = " numero factura: " + numeroFactura + "\n";
        String acumuladorProductos = "";
        String totalCompra = "el total es : " +  this.totalCompra;
        String raya = "________________________________________________" + "\n";
        String dueno = "factura a nombre de: " + cliente.getNombre() +"    " + cliente.getCedula() + "\n";
        String encabezadoProductos = "producto cantidad pUnitario pTotal"+ "\n";

        for(Producto producto : listaProductos){
           acumuladorProductos = acumuladorProductos + producto.getNombre()+"    " + producto.getCantidad() + "    " + producto.getPrecio() + "    " + producto.calcularPrecioTotalProducto() + "\n";
        }
        String facturaString = encabezado + dueno +  encabezadoProductos + acumuladorProductos + raya +  totalCompra;
        return facturaString ;
    }

    public float calcularTotalFactura(){
        float acumuladorProductos = 0;

        for(Producto producto : listaProductos){
            float precioFinalProducto = producto.calcularPrecioTotalProducto();
            acumuladorProductos = acumuladorProductos + precioFinalProducto;

        }

        totalCompra = acumuladorProductos;

        return totalCompra;

    }

    public String asignarNumeroFactura(){

        String numero = UUID.randomUUID().toString();


        return numero;



    }


}
