package is.unican.es;

import java.util.List;
import java.util.Date;

import javax.ejb.Remote;

import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.TipoHabitacion;

@Remote
public interface IGestionHotelesEJBRemote {

	public Hotel consultarHotel(String hotel);
	public List<TipoHabitacion> verDisponibilidad(Hotel h, Date fechaInicial, Date fechaFinal);
	public List<Hotel> consultarHotelLocalidad(String localidad);
}
