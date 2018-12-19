import java.util.Date;

import javax.ejb.Stateless;

import is.unican.es.IGestionReservasEJBRemote;
import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.TipoHabitacion;

@Stateless
public class GestionReservas implements IGestionReservasEJBRemote{

	@Override
	public Reserva consultaReserva(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cancelarReserva(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarReservaHabitaciones(int id, int numHabitaciones, TipoHabitacion tipo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarReservaFecha(int id, Date fecha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Reserva reservar(TipoHabitacion tH, String nombre, String dni, int tarjeta, int numHabitaciones) {
		// TODO Auto-generated method stub
		return null;
	}

}
