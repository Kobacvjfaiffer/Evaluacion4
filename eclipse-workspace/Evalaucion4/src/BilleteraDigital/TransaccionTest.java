package BilleteraDigital;

import static org.junit.Assert.*;
import org.junit.Test;

public class DepositoTest {

    @Test
    public void testEjecutar() {
        Cuenta cuenta = new Cuenta(100, "USD");
        Transaccion deposito = new Deposito(cuenta, 50);
        deposito.ejecutar();
        assertEquals(150, cuenta.getSaldo(), 0.01);
    }
}



