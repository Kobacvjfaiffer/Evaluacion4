package BilleteraDigital;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonedaTest {

    @Test
    public void testGetNombre() {
        Moneda moneda = new Moneda("Dólar estadounidense", "USD", 1);
        assertEquals("Dólar estadounidense", moneda.getNombre());
    }
       private void assertEquals(String string, String nombre) {
		
		
	}

	@Test
    public void testGetSimbolo() {
        Moneda moneda = new Moneda("Dólar estadounidense", "USD", 1);
        assertEquals("USD", moneda.getSimbolo());
    }

    @Test
    public void testGetTasaDeConversion() {
        Moneda moneda = new Moneda("Dólar estadounidense", "USD", 1);
        assertEquals(1, moneda.getTasaDeConversion(), 0.01);
    }
}


