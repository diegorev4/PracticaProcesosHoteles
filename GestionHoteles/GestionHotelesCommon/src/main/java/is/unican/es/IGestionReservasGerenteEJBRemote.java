package is.unican.es;

import java.util.List;
import java.util.Date;

import javax.ejb.Remote;

import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.ReservaTipoHabitacion;

@Remote
public interface IGestionReservasGerenteEJBRemote {
	
	public List<Reserva> consultarReservas(Date fecha);
	public List<Reserva> consultarReservasRAngo(Date fechaIni, Date fechaFin);
}
