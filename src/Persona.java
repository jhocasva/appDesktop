import java.util.UUID;

public class Persona {
    String nombre = "na";
    int edad;
    String genero = "na";
    float peso;
    float altura;
    String documentoIdentidad = "na";


    // -1  indica bajo el peso
    // 0 = peso normal
    // 1= sobrepeso
    //8 = obesidad
    public byte calcularIMC(){
        float imc = peso / (altura * altura);
        if(imc < 18.5){
            return -1;

        }else if (imc >= 18.5 && imc <=24.9){
            return 0;

        }else if (imc >= 25.0 && imc <= 29.9){
            return 1;

        }else{
            return 8;
        }
    }

    public void asignarID(){
       // Double idAleatorio = (Math.random()*100+1);
        String documento = UUID.randomUUID().toString();
        documentoIdentidad = String.valueOf(documento);
       //String[] listaUUID  = documentoIdentidad.split("-");
       //documentoIdentidad = listaUUID[0] + listaUUID[1] + listaUUID[2] + listaUUID[3] + listaUUID[4];
        documentoIdentidad = documentoIdentidad.replace("-", "");
    }

    public boolean esMayorDeEdad(){
        if(edad >= 18){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                '}';
    }
}
