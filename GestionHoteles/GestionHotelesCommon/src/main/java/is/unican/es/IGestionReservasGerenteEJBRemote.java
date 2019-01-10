package is.unican.es;

import java.util.Date;

import javax.ejb.Remote;

import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.ReservaTipoHabitacion;

@Remote
public interface IGestionReservasGerenteEJBRemote {
	
	public ReservaTipoHabitacion[] consultarReservas(Date fecha);
	public ReservaTipoHabitacion[] consultarReservasRAngo(Date fechaIni, Date fechaFin);
}
