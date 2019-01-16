package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import is.unican.es.IHotelesDAO;
import is.unican.es.dominio.Hotel;

@Stateless
public class DatosHoteles implements IHotelesDAO {

	@PersistenceContext(unitName="HotelesPU")
	private EntityManager e;
	
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
		Query q = e.createQuery("SELECT h FROM Hotel WHERE h.localidad = :localidad");
		q.setParameter("localidad", localidad);
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

}
