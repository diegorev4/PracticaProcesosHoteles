package is.unican.es;

import java.util.Date;

import javax.ejb.Remote;

import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.ReservaTipoHabitacion;
import is.unican.es.dominio.TipoHabitacion;
import is.unican.es.dominio.TipoTarjeta;

@Remote
public interface IGestionReservasEJBRemote {

	public ReservaTipoHabitacion consultaReserva(int id);
	public boolean cancelarReserva(int id);
	public boolean modificarReservaHabitaciones(int id, int numHabitaciones, TipoHabitacion tipo);
	public boolean modificarReservaFecha(int id, Date fechaInicio,Date fechaSalida);
	public ReservaTipoHabitacion reservar(TipoHabitacion tH, String nombre, String dni, int tarjeta, int numHabitaciones,
			Date fechaEntrada, Date fechaSalida, String primerApellido, String segundoApellido, String email,
			int cvc, int mesCaducidad, int anhoCaducidad, TipoTarjeta tipo);
}
