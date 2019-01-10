import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.DatosHoteles;
import is.unican.es.IGestionHabitacionesEJBRemote;
import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.TipoHabitacion;

@Stateless
public class GestionHabitaciones implements IGestionHabitacionesEJBRemote{

	@EJB
	private DatosHoteles dh;
	@Override
	public void modificarHabitaciones(Hotel h, int numHabitaciones, double precio, TipoHabitacion tH) {
		h.elimnarHabitacion(tH);
		tH.setDisponibles(numHabitaciones);
		tH.setPrecioPorNoche(precio);
		h.anhadirHabitacion(tH);
		
		dh.modificarHotel(h);
		
	}

	@Override
	public List<Hotel> consultaHoteles() {
		return dh.hoteles();
	}

	@Override
	public Hotel consultaHotel(int id) {
		return dh.hotelPorId(id);
	}

	@Override
	public void addTipoHabitacion(String descripcion, int disponibles, double precio, Hotel hotel) {
		hotel.anhadirHabitacion(new TipoHabitacion(descripcion, precio, disponibles));
		dh.modificarHotel(hotel);
	}

}
