import java.util.Date;

import javax.ejb.Stateless;

import is.unican.es.IGestionHotelesEJBRemote;
import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.TipoHabitacion;

@Stateless
public class GestionHoteles implements IGestionHotelesEJBRemote{

	@Override
	public Hotel consultarHotel(String hotel, String localidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoHabitacion[] verDisponibilidad(Hotel h, Date fechaInicial, Date fechaFinal) {
		// TODO Auto-generated method stub
		return null;
	}

}
