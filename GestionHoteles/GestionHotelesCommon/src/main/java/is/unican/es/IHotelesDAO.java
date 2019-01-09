package is.unican.es;

import is.unican.es.dominio.Hotel;

public interface IHotelesDAO {

	public abstract Hotel hotelPorId(int id);
	public Hotel hotelPorNombreLocalidad(String nombre, String localidad);
	public Hotel modificarHotel(Hotel nuevo);
	public Hotel[] hoteles();
}
