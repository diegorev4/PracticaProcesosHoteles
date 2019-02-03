import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;

import org.junit.BeforeClass;
import org.junit.Test;

import dao.DatosHoteles;
import is.unican.es.IHotelesDAO;
import is.unican.es.dominio.Hotel;

public class TestHotelesDAO {
/*
 
	private static IHotelesDAO d;
	private static EJBContainer ec;
	
	@BeforeClass
	public static void init() throws NamingException {
		Map properties = new HashMap();
		properties.put(EJBContainer.MODULES, new   File[]{new   File("classes")});
		properties.put("org.glassfish.ejb.embedded.glassfish.installation.root",
				"C:/Users/Diego/Documents/glassfish4/glassfish");
		//Creación del EJBContainer con propiedades
		ec = EJBContainer.createEJBContainer(properties);
		d = (IHotelesDAO) ec.getContext().lookup("java:global/GestionHotelesDatos-0.0.1-SNAPSHOT/DatosHoteles!is.unican.es.IHotelesDAO");
	}
	
	@Test
	public void addTest() {
		Hotel h = new Hotel("test", "localidadtest", "dir", null);
		
		d.addHotel(h);
		
		System.out.println(d.hotelPorId(0));
		
		assertTrue(h.equals(d.hotelPorId(0)));
	}
	*/
}
