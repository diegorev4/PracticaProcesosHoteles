package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
		return e.find(Hotel.class, nombre);
	}

	public void modificarHotel(Hotel nuevo) {
		e.merge(nuevo);
	}

	public Hotel[] hoteles() {
		return null;
	}

	public void addHotel(Hotel h) {
		e.persist(h);
	}

	public void removeHotel(Hotel h) {
		e.remove(h);
	}

}
