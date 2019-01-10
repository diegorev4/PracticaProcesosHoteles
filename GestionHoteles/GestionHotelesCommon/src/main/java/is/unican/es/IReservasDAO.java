package is.unican.es;

import java.util.Date;

import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.ReservaTipoHabitacion;
import is.unican.es.dominio.TipoHabitacion;

public interface IReservasDAO {
	public ReservaTipoHabitacion consultaReserva(int id);
	public ReservaTipoHabitacion eliminarReserva(int id);
	public void addReserva(ReservaTipoHabitacion res);
	public void modificarReserva(ReservaTipoHabitacion reservaNueva);
	public ReservaTipoHabitacion[] reservaPorFecha(Date fecha);
	public ReservaTipoHabitacion[] reservaPorRangoFecha(Date fechaIni, Date fechaFin);
}
