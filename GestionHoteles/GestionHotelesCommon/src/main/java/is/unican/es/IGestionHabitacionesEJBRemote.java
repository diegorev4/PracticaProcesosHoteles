package is.unican.es;

import java.util.List;

import javax.ejb.Remote;

import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.TipoHabitacion;

@Remote
public interface IGestionHabitacionesEJBRemote {
	
	public void modificarHabitaciones(Hotel h, int numHabitaciones, double precio, TipoHabitacion tH);
	public List<Hotel> consultaHoteles();
	public Hotel consultaHotel(int id);
	public void addTipoHabitacion(String descripcion, int disponibles, double precio, Hotel hotel);
}
