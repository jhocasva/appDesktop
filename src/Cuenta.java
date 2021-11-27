
public class Cuenta {
    String titular;
    private float saldo;

    void ingresar(Float monto){

        if (monto > 0){
            saldo = saldo + monto;
            System.out.println("el nuevo saldo es: " + saldo);
        }
        else{
            System.out.println("el monto debe ser mayor a 0$");
        }

    }

    Float retirar(Float montoAretirar){
        if (montoAretirar <= saldo){
            saldo = saldo - montoAretirar;
        }
        else {
            System.out.println("el monto a retirar es superior al saldo");
        }
        return saldo;
    }

    float devolverSaldo(){
        return saldo;
    }

    float liquidar(float interes){
        if (interes >0){
            float interes1 = saldo * interes;
            saldo = saldo + interes1;
        }
        return saldo;
    }
}
