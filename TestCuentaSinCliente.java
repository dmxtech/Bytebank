public class TestCuentaSinCliente {

    public static void main(String[] args) {
        Cuenta cuentaDeJimena = new Cuenta();
        System.out.println(cuentaDeJimena.saldo);

        cuentaDeJimena.titular = new Cliente();

        System.out.println(cuentaDeJimena.titular);

        cuentaDeJimena.titular.nombre = "Jimena";
        System.out.println(cuentaDeJimena.titular.nombre);
    }
}