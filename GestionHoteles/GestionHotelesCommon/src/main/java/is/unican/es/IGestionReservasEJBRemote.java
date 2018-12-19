package is.unican.es;

import java.util.Date;

import javax.ejb.Remote;

import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.TipoHabitacion;

@Remote
public interface IGestionReservasEJBRemote {

	public Reserva consultaReserva(int id);
	public boolean cancelarReserva(int id);
	public boolean modificarReservaHabitaciones(int id, int numHabitaciones, TipoHabitacion tipo);
	public boolean modificarReservaFecha(int id, Date fecha);
	public Reserva reservar(TipoHabitacion tH, String nombre, String dni, int tarjeta, int numHabitaciones);
}
