import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.DatosHoteles;
import is.unican.es.IGestionHotelesEJBRemote;
import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.Reserva;
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
	public List<TipoHabitacion> verDisponibilidad(Hotel h, Date fechaInicial, Date fechaFinal) {
		
		//TO DO MAS ADELANTE
		return null;
	}
	
	@Override
	public List<Hotel> consultarHotelLocalidad(String localidad){
		return dh.hotelLocalidad(localidad);
	}

}
