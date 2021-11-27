import java.util.Objects;

public class Empleado {

    private String nombre;
    private String cedula;
    private String codigoEmpleado;
    private String cargo;

    public Empleado(String nombre, String cedula, String codigoEmpleado, String cargo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigoEmpleado = codigoEmpleado;
        this.cargo = cargo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", codigoEmpleado='" + codigoEmpleado + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object objeto){
        Empleado empleado = (Empleado) objeto;
        if(//this.nombre.equals(empleado.getNombre()) &&
                 this.cedula.equals(empleado.getCedula())
                && this.codigoEmpleado.equals(empleado.getCodigoEmpleado())
                //&& this.cargo.equals(empleado.getCargo())
        ){
            return true;
        }else {
            return  false;
        }

    }


}





