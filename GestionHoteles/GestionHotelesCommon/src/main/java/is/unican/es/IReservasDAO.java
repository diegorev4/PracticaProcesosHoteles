package is.unican.es;

import java.util.Date;

import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.TipoHabitacion;

public interface IReservasDAO {
	public Reserva consultaReserva(int id);
	public Reserva eliminarReserva(int id);
	public Reserva addReserva(TipoHabitacion th, String nombre, String dni, String tarjeta, int numHabitaciones, Hotel h, Date fecha);
	public Reserva modificarReserva(Reserva reservaNueva);
	public Reserva[] reservaPorFecha(Date fecha);
	public Reserva[] reservaPorRangoFecha(Date fechaIni, Date fechaFin);
}
