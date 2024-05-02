package BilleteraDigital;

        public class Main {
	    public static void main(String[] args) {
	        // Crear una cuenta para un usuario
	        Cuenta cuenta = new Cuenta(100, "USD");

	        // Crear un usuario con la cuenta creada
	        Usuario usuario = new Usuario("Mike Zayers", cuenta);

	        // Mostrar información del usuario y su cuenta
	        System.out.println("Bienvenido, " + usuario.getNombre() + "!");
	        System.out.println("Su saldo actual es: " + usuario.getCuenta().getSaldo() + " " + usuario.getCuenta().getMoneda());

	        // Realizar algunas transacciones (por ejemplo, depositar y retirar)
	        usuario.getCuenta().depositar(50);
	        usuario.getCuenta().retirar(30);

	        // Mostrar el saldo actualizado después de las transacciones
	        System.out.println("Después de las transacciones:");
	        System.out.println("Saldo actual: " + usuario.getCuenta().getSaldo() + " " + usuario.getCuenta().getMoneda());
	    }
	
       }


