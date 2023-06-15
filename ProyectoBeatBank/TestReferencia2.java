package ProyectoBeatBank;

public class TestReferencia2 {

    public static void main(String[] args) {
        
        Cliente hernan = new Cliente();
        hernan.nombre = "Hernan";
        hernan.documento = "1016065162";
        hernan.telefono = "3204908455";
       

        Cuenta cuentaHernan = new Cuenta();
        cuentaHernan.setAgencia(1);
        cuentaHernan.titular = hernan;

        System.out.println(cuentaHernan.titular.documento);
        System.out.println(cuentaHernan.titular);
    }
    
}
