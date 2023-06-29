package ProyectoBeatBank;

public class PruebaMetodos {
    
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta(4);
        miCuenta.depositar(300);

        System.out.println(miCuenta.getSaldo());
        
        miCuenta.retirar(100);
        System.out.println(miCuenta.getSaldo());

        Cuenta CuentaFernanda = new Cuenta(5);
        CuentaFernanda.depositar(1000);

        boolean puedeTranferir = CuentaFernanda.transferir(200, miCuenta);
    
        if(puedeTranferir){
            System.out.println("Transferencia exitosa");
        }
        else{
            System.out.println("Fondos insuficientes");
        }

        System.out.println("Saldo de mi cuenta: " + miCuenta.getSaldo());
        System.out.println("Saldo cuenta de Fernanda: " + CuentaFernanda.getSaldo());
    }
}
