package BilleteraDigital;

import org.junit.jupiter.api.Test;

public class CuentaTest  {

    @Test
    public void testDepositar() {
        Cuenta cuenta = new Cuenta(100, "USD");
        cuenta.depositar(50);
        assertEquals(150, cuenta.getSaldo(), 0.01);
    }

  

	private void assertEquals(int i, double saldo, double d) {
		// TODO Auto-generated method stub
		
	}



	@Test
    public void testRetirar() {
        Cuenta cuenta = new Cuenta(100, "USD");
        cuenta.retirar(50);
        assertEquals(50, cuenta.getSaldo(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRetirarSaldoInsuficiente() {
        Cuenta cuenta = new Cuenta(100, "USD");
        cuenta.retirar(150);
    }

    @Test
    public void testConvertirSaldo() {
        Cuenta cuenta = new Cuenta(100, "USD");
        cuenta.convertirSaldo("EUR", 0.85); // 1 USD = 0.85 EUR
        assertEquals("EUR", cuenta.getMoneda());
        assertEquals(85, cuenta.getSaldo(), 0.01);
    }



	private void assertEquals(String string, String moneda) {
		// TODO Auto-generated method stub
		
	}
}
