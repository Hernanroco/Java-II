package ProyectoBeatBank;

public class PruebaEncapsulamiento {
    

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setNombre("Hernan");;
        cliente.setDocumento("1016065162"); 

        cuenta.setTitular(cliente);

        System.out.println(cliente.getNombre());
        System.out.println(cuenta.getTitular().getNombre());
        System.out.println(cuenta.getTitular().getDocumento());
    }
}
