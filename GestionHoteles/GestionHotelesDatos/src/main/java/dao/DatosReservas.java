package dao;

import java.util.Date;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import is.unican.es.IReservasDAO;
import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.ReservaTipoHabitacion;
import is.unican.es.dominio.TipoHabitacion;

@Stateless
public class DatosReservas implements IReservasDAO{
	
	@PersistenceContext(unitName="HotelesPU")
	private EntityManager e;
	
	public ReservaTipoHabitacion consultaReserva(int id) { 
		return e.find(ReservaTipoHabitacion.class, id);
	}

	public ReservaTipoHabitacion eliminarReserva(int id) {
		ReservaTipoHabitacion res = e.find(ReservaTipoHabitacion.class, id);
		if (res == null) {
			return null;
		}
		e.remove(res);
		return res;
	}

	public void addReserva(ReservaTipoHabitacion res) {
		e.persist(res);
	}

	public void modificarReserva(ReservaTipoHabitacion reservaNueva) {
		e.merge(reservaNueva);
	}

	public ReservaTipoHabitacion[] reservaPorFecha(Date fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	public ReservaTipoHabitacion[] reservaPorRangoFecha(Date fechaIni, Date fechaFin) {
		// TODO Auto-generated method stub
		return null;
	}

}
