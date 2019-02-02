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

	public List<ReservaTipoHabitacion> consultaReservaHabitaciones(int id) { 
		Query q = e.createQuery("SELECT r FROM ReservaTipoHabitacion r WHERE r.reserva_fk = :reservaId");
		q.setParameter("reservaId", id);
		List<ReservaTipoHabitacion> reservas = q.getResultList();
		if(reservas != null) {
			return reservas;
		}
		return null;
	}

	public void eliminarReservaHabitacion(int id) {
			ReservaTipoHabitacion res = e.find(ReservaTipoHabitacion.class,id);
			e.remove(res);
	}

	public void addReservaHabitacion(ReservaTipoHabitacion res) {
		e.persist(res);
	}

	public ReservaTipoHabitacion modificarReserva(ReservaTipoHabitacion reservaNueva) {
		return e.merge(reservaNueva);
	}


	public List<Reserva> reservaPorFecha(Date fecha) {
		Query q = e.createQuery("SELECT r FROM Reserva r WHERE r.fechaEntrada = :fecha");
		q.setParameter("fecha",fecha);
		List<Reserva> reservas = q.getResultList();
		if(reservas != null) {
			return reservas;
		}
		return null;
	}

	public List<Reserva> reservaPorRangoFecha(Date fechaIni, Date fechaFin) {
		Query q = e.createQuery("SELECT r FROM Reservar WHERE r.fechaEntrada = :fechaentrada"
				+ " and r.fechaSalida = :fechaSalida");
		q.setParameter("fechaEntrada",fechaIni);
		q.setParameter("fechaSalida",fechaFin);
		List<Reserva> reservas = q.getResultList();
		if(reservas != null) {
			return reservas;
		}
		return null;
	}

	public Reserva consultaReserva(int id) {
		return e.find(Reserva.class, id);
	}

	public void eliminarReserva(int id) {
		List<ReservaTipoHabitacion> habitaciones = consultaReservaHabitaciones(id);
		for(int i=0;i<habitaciones.size();i++) {
			ReservaTipoHabitacion res = e.find(ReservaTipoHabitacion.class, habitaciones.get(i).getId());
			e.remove(res);
		}
		e.remove(e.find(Reserva.class,id));
	}


	public void addReserva(Reserva res) {
		e.persist(res);		
	}

}
