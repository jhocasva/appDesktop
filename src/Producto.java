public class Producto {

    private String nombre;
    private float precio;
    private  int cantidad;

    public Producto(String nombre, float precio,int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre(){
        return nombre;
    }


    public void setNombre(String tipo){
        this.nombre = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float calcularPrecioTotalProducto(){
        float precioFinalProducto = cantidad * precio;
        return precioFinalProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "tipo='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
