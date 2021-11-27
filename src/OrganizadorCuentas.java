public class OrganizadorCuentas {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.ingresar(100000f);
        cuenta1.ingresar(6790000f);
        cuenta1.titular = "Johana Castaño";
        System.out.println(cuenta1.titular + " " + "su saldo es: " + " " + cuenta1.devolverSaldo());

        Cuenta cuenta2 = new Cuenta();
        cuenta2.ingresar(1000000f);
        cuenta2.retirar(500000f);
        cuenta2.titular = "jhonatan castaño";
        System.out.println(cuenta2.titular + cuenta2.devolverSaldo());
        float saldoConInteres = cuenta2.liquidar(0.05f);
        System.out.println("el saldo con intereses es: " + saldoConInteres);
    }




    }

