import javax.ejb.Stateless;

import is.unican.es.IGestionHabitacionesEJBRemote;
import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.TipoHabitacion;

@Stateless
public class GestionHabitaciones implements IGestionHabitacionesEJBRemote{

	@Override
	public boolean modificarHabitaciones(Hotel h, int numHabitaciones, double precio, TipoHabitacion tH) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Hotel[] consultaHoteles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hotel consultaHotel(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addTipoHabitacion(String descripcion, int disponibles, double precio, Hotel hotel) {
		// TODO Auto-generated method stub
		return false;
	}

}
