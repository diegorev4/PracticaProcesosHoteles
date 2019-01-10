import java.util.Date;
import java.util.List;

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
	public List<ReservaTipoHabitacion> consultarReservas(Date fecha) {
		return dr.reservaPorFecha(fecha);
	}

	@Override
	public List<ReservaTipoHabitacion> consultarReservasRAngo(Date fechaIni, Date fechaFin) {
		return dr.reservaPorRangoFecha(fechaIni, fechaFin);
	}

}
