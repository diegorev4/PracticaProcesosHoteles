import java.util.Date;

import javax.ejb.Stateless;

import is.unican.es.IGestionReservasGerenteEJBRemote;
import is.unican.es.dominio.Reserva;

@Stateless
public class GestionReservasGerente implements IGestionReservasGerenteEJBRemote{


	public Reserva[] consultarReservas(Date fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	public Reserva[] consultarReservasRAngo(Date fechaIni, Date fechaFin) {
		// TODO Auto-generated method stub
		return null;
	}

}
