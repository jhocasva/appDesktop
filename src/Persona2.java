public class Persona2 {

    private int edad;

    public Persona2(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona2{" +
                "edad=" + edad +
                '}';
    }
}
