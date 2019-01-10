import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.DatosHoteles;
import is.unican.es.IGestionHotelesEJBRemote;
import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.TipoHabitacion;

@Stateless
public class GestionHoteles implements IGestionHotelesEJBRemote{

	@EJB
	private DatosHoteles dh;
	@Override
	public Hotel consultarHotel(String hotel) {
		return dh.hotelPorNombre(hotel);
	}

	@Override
	public TipoHabitacion[] verDisponibilidad(Hotel h, Date fechaInicial, Date fechaFinal) {
		return null;
	}

}
