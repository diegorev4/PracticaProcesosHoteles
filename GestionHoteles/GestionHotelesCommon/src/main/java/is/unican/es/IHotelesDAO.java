package is.unican.es;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.TipoHabitacion;

@Remote
public interface IHotelesDAO {

	public void addHotel(Hotel h);
	public void removeHotel(Hotel h);
	public Hotel hotelPorId(int id);
	public Hotel hotelPorNombre(String nombre);
	public void modificarHotel(Hotel nuevo);
	public List<Hotel> hoteles();
	public List<Hotel> hotelLocalidad(String localidad);
	public List<TipoHabitacion> habitacionesDisponibles(Hotel h, Date fechaInicial, Date fechaFinal);
}
