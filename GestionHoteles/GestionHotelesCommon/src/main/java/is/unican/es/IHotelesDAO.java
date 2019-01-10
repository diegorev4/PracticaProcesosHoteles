package is.unican.es;

import javax.ejb.Remote;

import is.unican.es.dominio.Hotel;

@Remote
public interface IHotelesDAO {

	public void addHotel(Hotel h);
	public void removeHotel(Hotel h);
	public Hotel hotelPorId(int id);
	public Hotel hotelPorNombre(String nombre);
	public void modificarHotel(Hotel nuevo);
	public Hotel[] hoteles();
}
