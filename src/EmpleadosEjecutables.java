public class EmpleadosEjecutables {
    public static void main(String[] args) {
        String nombre = "jhon";
        String cedula = "12345";
        String codigoEmpleo = "0987";
        String cargo = "jefe";
        Vacio vacio1;

        Empleado empleado1 = new Empleado("pedro","1234",codigoEmpleo,"supervisor");
        Empleado empleado2 = new Empleado(nombre,cedula,codigoEmpleo, "jefe");
        Empleado empleado3 = new Empleado("carlos",cedula,codigoEmpleo, "jefe");

        empleado1.setNombre("pablo");

        if (empleado1.equals(empleado2)){
            String prueba = "23465675";
            System.out.println("son el mismo empleado");

        } else {
            System.out.println("son empleados diferentes");
        }

        if(empleado1.equals(empleado3)){
            System.out.println("son el mismo empleado");
        } else{
            System.out.println("son empleados diferentes");
        }

        if(empleado2.equals(empleado3)){
            System.out.println("son el mismo empleado");
        } else{
            System.out.println("son empleados diferentes");

        }





    }


}
