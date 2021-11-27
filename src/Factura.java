import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Factura {

    private float totalCompra;
    private List<Producto> listaProductos = new ArrayList<>();
    private Cliente cliente;
    private String numeroFactura;

    public Factura( List<Producto> listaProductos, Cliente cliente,String numeroFactura) {
        this.listaProductos = listaProductos;
        this.cliente = cliente;
        this.numeroFactura = numeroFactura;
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
        return "Factura{" +
                "totalCompra=" + totalCompra +
                ", listaProductos=" + listaProductos +
                ", cliente=" + cliente +
                ", numeroFactura=" + numeroFactura +
                '}';
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

    public void asignarNumeroFactura(){

        String numero = UUID.randomUUID().toString();
        numeroFactura  = String.valueOf(numero);



    }


}
