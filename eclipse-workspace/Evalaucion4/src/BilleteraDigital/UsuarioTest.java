package BilleteraDigital

	import static org.junit.Assert.*;
	import org.junit.Test;

	public class UsuarioTest {

	    @Test
	    public void testGetNombre() {
	        Usuario usuario = new Usuario("Mike Zayers", new Cuenta(100, "USD"));
	        assertEquals("Mike Zayers", usuario.getNombre());
	    }

	    private void assertEquals(String string, String nombre) {
			// TODO Auto-generated method stub
			
		}

		@Test
	    public void testGetCuenta() {
	        Cuenta cuenta = new Cuenta(100, "USD");
	        Usuario usuario = new Usuario("Mike Zayers", cuenta);
	        assertEquals(cuenta, usuario.getCuenta());
	    }
	


	}


