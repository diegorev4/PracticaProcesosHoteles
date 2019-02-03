
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.TipoHabitacion;


public class testBusiness {
	
	private static Hotel h;
	private static Reserva r;
	private static GestionHoteles gestHoteles = mock(GestionHoteles.class);
	
	@BeforeClass
	public void initClass() {
		when(gestHoteles.consultarHotel("Bahia")).thenReturn(h);
	}
	
	@Before
	public void init() {
		h = new Hotel("Bahia", "Santander", "Calle", new ArrayList<TipoHabitacion>());
	}
	
	@Test
	public void testReservas() {
		assertTrue(h.getReservas().size()==0);
		
		gestHoteles.consultarHotel("Bahia").anhadirReserva(r);
		
		assertTrue(h.getReservas().size()==1);
	}
	
	
}
