package ProyectoBeatBank;

public class TestReferencia {
    
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(6);
        primeraCuenta.depositar(100);
        System.out.println("Saldo primera cuenta: " + primeraCuenta.getSaldo());

        Cuenta segundaCuenta = primeraCuenta;
        System.out.println("Saldo segunda cuenta: " + segundaCuenta.getSaldo());
        segundaCuenta.depositar(100);;
        System.out.println("Nuevo saldo segunda cuenta: " + segundaCuenta.getSaldo());


        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);

        if( primeraCuenta == segundaCuenta ){
            System.out.println("Son el mismo objeto");
        } else {
            System.out.println("Son diferentes");
        }
    }
}
