package is.unican.es;

import java.util.Date;
import java.util.List;

import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.ReservaTipoHabitacion;
import is.unican.es.dominio.TipoHabitacion;

public interface IReservasDAO {
	public ReservaTipoHabitacion consultaReserva(int id);
	public ReservaTipoHabitacion eliminarReserva(int id);
	public void addReserva(ReservaTipoHabitacion res);
	public ReservaTipoHabitacion modificarReserva(ReservaTipoHabitacion reservaNueva);
	public List<ReservaTipoHabitacion> reservaPorFecha(Date fecha);
	public List<ReservaTipoHabitacion> reservaPorRangoFecha(Date fechaIni, Date fechaFin);
}
