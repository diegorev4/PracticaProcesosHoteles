package is.unican.es;

import javax.ejb.Remote;

import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.TipoHabitacion;

@Remote
public interface IGestionHabitacionesEJBRemote {
	
	public boolean modificarHabitaciones(Hotel h, int numHabitaciones, double precio, TipoHabitacion tH);
	public Hotel[] consultaHoteles();
	public Hotel consultaHotel(int id);
	public boolean addTipoHabitacion(String descripcion, int disponibles, double precio, Hotel hotel);
}
