package dao;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	public ReservaTipoHabitacion modificarReserva(ReservaTipoHabitacion reservaNueva) {
		return e.merge(reservaNueva);
	}

	public List<ReservaTipoHabitacion> reservaPorFecha(Date fecha) {
		Query q = e.createQuery("SELECT r FROM ReservaTipoHabitacion r WHERE r.fechaEntrada = :fecha");
		q.setParameter("fecha",fecha);
		List<ReservaTipoHabitacion> reservasPorFecha = q.getResultList();
		if(reservasPorFecha != null) {
			return reservasPorFecha;
		}
		return null;
	}

	public List<ReservaTipoHabitacion> reservaPorRangoFecha(Date fechaIni, Date fechaFin) {
		Query q = e.createQuery("SELECT r FROM ReservaTipoHabitacion r WHERE r.fechaEntrada = :fechaentrada"
				+ " and r.fechaSalida = :fechaSalida");
		q.setParameter("fechaEntrada",fechaIni);
		q.setParameter("fechaSalida",fechaFin);
		List<ReservaTipoHabitacion> reservasPorFecha = q.getResultList();
		if(reservasPorFecha != null) {
			return reservasPorFecha;
		}
		return null;
	}

}
