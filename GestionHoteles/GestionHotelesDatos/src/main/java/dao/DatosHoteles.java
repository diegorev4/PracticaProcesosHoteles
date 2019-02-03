package dao;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import is.unican.es.IHotelesDAO;
import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.ReservaTipoHabitacion;
import is.unican.es.dominio.TipoHabitacion;

@Stateless
public class DatosHoteles implements IHotelesDAO {

	@PersistenceContext(unitName="HotelesPU")
	private EntityManager e;
	
	private DatosReservas reservasDAO;
	
	public Hotel hotelPorId(int id) {
		return e.find(Hotel.class, id);
	}

	public Hotel hotelPorNombre(String nombre) {
		Query q = e.createQuery("SELECT h FROM Hotel h WHERE h.nombre = :nombre");
		q.setParameter("nombre", nombre);
		return (Hotel) q.getSingleResult();
	}

	public void modificarHotel(Hotel nuevo) {
		e.merge(nuevo);
	}
	
	public List<Hotel> hotelLocalidad(String localidad){
		Query q = e.createQuery("SELECT h FROM Hotel h WHERE h.localidad = :localidad");
		q.setParameter("localidad", localidad);
		@SuppressWarnings("unchecked")
		List <Hotel> resultList = q.getResultList();
		if (resultList != null) {
			return resultList;
		}
		return null;
	}

	public List<Hotel> hoteles() {
		Query q = e.createQuery("SELECT h FROM Hotel h");
		@SuppressWarnings("unchecked")
		List<Hotel> hoteles = q.getResultList();
		if(hoteles != null) {
			return hoteles;
		}
		return null;
	}

	public void addHotel(Hotel h) {
		e.persist(h);
	}

	public void removeHotel(Hotel h) {
		e.remove(h);
	}

	public List<TipoHabitacion> habitacionesDisponibles(Hotel h, Date fechaInicial, Date fechaFinal) {
		Hotel hotel = hotelPorId(h.getId());
		hotel.getHabitaciones().size();
		List<TipoHabitacion> habitaciones = hotel.getHabitaciones();
		Query q = e.createQuery("SELECT r FROM Reserva r JOIN r.hotel h WHERE h.id = :hotelId "
				+ "and r.fechaSalida > :fechaInicial");
		q.setParameter("hotelId", h.getId());
		q.setParameter("fechaInicial",fechaInicial);
		@SuppressWarnings("unchecked")
		List<Reserva> reservas = q.getResultList();
		int contador = 0;
		while(contador < reservas.size()){
			reservas.get(contador).getHabitaciones().size();
			List<ReservaTipoHabitacion> reservasHabitaciones = reservas.get(contador).getHabitaciones();
			int contadorHabitaciones = 0;
			boolean encontrado;
			int i;
			while (contadorHabitaciones < reservasHabitaciones.size()) {
				encontrado = false;
				i = 0;
				while (!encontrado && i < habitaciones.size()) {
					if(habitaciones.get(i).getId() == reservasHabitaciones.get(contadorHabitaciones).getTipoHabitacion().getId()) {
						int disponibles = habitaciones.get(i).getDisponibles() - reservasHabitaciones.get(contadorHabitaciones).getTipoHabitacion().getDisponibles();
						habitaciones.get(i).setDisponibles(disponibles);
						encontrado = true;
					}
					i++;
				}
				contadorHabitaciones++;
			}
			contador ++;
		}
		return habitaciones;
	}
	

}
