import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import is.unican.es.IGestionHotelesEJBRemote;
import is.unican.es.IHotelesDAO;
import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.TipoHabitacion;

@Stateless
public class GestionHoteles implements IGestionHotelesEJBRemote{

	@EJB
	private IHotelesDAO dh;
	@Override
	public Hotel consultarHotel(String hotel) {
		return dh.hotelPorNombre(hotel);
	}

	@Override
	public List<TipoHabitacion> verDisponibilidad(Hotel h, Date fechaInicial, Date fechaFinal) {
		return dh.habitacionesDisponibles(h, fechaInicial, fechaFinal);
	}
	
	@Override
	public List<Hotel> consultarHotelLocalidad(String localidad){
		return dh.hotelLocalidad(localidad);
	}

}
