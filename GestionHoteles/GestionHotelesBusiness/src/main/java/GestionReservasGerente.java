import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.DatosReservas;
import is.unican.es.IGestionReservasGerenteEJBRemote;
import is.unican.es.dominio.ReservaTipoHabitacion;

@Stateless
public class GestionReservasGerente implements IGestionReservasGerenteEJBRemote{

	@EJB
	private DatosReservas dr;
	@Override
	public ReservaTipoHabitacion[] consultarReservas(Date fecha) {
		return dr.reservaPorFecha(fecha);
	}

	@Override
	public ReservaTipoHabitacion[] consultarReservasRAngo(Date fechaIni, Date fechaFin) {
		return dr.reservaPorRangoFecha(fechaIni, fechaFin);
	}

}
