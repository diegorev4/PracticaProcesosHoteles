import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;


import is.unican.es.IGestionReservasGerenteEJBRemote;
import is.unican.es.IReservasDAO;
import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.ReservaTipoHabitacion;

@Stateless
public class GestionReservasGerente implements IGestionReservasGerenteEJBRemote{

	@EJB
	private IReservasDAO dr;
	@Override
	public List<Reserva> consultarReservas(Date fecha) {
		return dr.reservaPorFecha(fecha);
	}

	@Override
	public List<Reserva> consultarReservasRAngo(Date fechaIni, Date fechaFin) {
		return dr.reservaPorRangoFecha(fechaIni, fechaFin);
	}

}
