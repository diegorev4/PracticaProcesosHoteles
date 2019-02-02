package is.unican.es;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.ReservaTipoHabitacion;
import is.unican.es.dominio.TipoHabitacion;

@Remote
public interface IReservasDAO {
	public List<ReservaTipoHabitacion> consultaReservaHabitaciones(int id);
	public void eliminarReservaHabitacion(int id);
	public Reserva consultaReserva(int id);
	public void eliminarReserva(int id);
	public void addReservaHabitacion(ReservaTipoHabitacion res);
	public void addReserva(Reserva res);
	public ReservaTipoHabitacion modificarReserva(ReservaTipoHabitacion reservaNueva);
	public List<Reserva> reservaPorFecha(Date fecha);
	public List<Reserva> reservaPorRangoFecha(Date fechaIni, Date fechaFin);
}
