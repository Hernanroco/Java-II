package ProyectoBeatBank;

public class TestReferencia2 {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.setNombre("Hernan");
        cliente.setDocumento("1016065162");
        cliente.setTelefono("3204908455");


        System.out.println(cliente.getNombre());
        System.out.println(cliente.getDocumento());
    }
    
}
