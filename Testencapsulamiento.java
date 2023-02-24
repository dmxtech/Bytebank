public class Testencapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setNombre("Javier");
        cliente.setDocumento("fdsafdsa324323");

        cuenta.setTitular(cliente);
        System.out.println(cliente.getNombre());
        System.out.println(cuenta.getTitular().getNombre());

    }
}
