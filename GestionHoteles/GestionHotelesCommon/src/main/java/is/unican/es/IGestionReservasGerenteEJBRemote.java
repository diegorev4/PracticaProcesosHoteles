package is.unican.es;

import java.util.Date;

import javax.ejb.Remote;

import is.unican.es.dominio.Reserva;

@Remote
public interface IGestionReservasGerenteEJBRemote {
	
	public Reserva[] consultarReservas(Date fecha);
	public Reserva[] consultarReservasRAngo(Date fechaIni, Date fechaFin);
}
