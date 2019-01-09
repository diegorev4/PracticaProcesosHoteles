package dao;

import is.unican.es.IHotelesDAO;
import is.unican.es.dominio.Hotel;

public class DatosHoteles implements IHotelesDAO {

	protected static DatosHoteles instancia = null;
	
	protected DatosHoteles() {
		
	}
	
	public DatosHoteles getInstance() {
		if(instancia == null) {
			instancia = new DatosHoteles();
		}
		return instancia;
	}
	
	public Hotel hotelPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Hotel hotelPorNombreLocalidad(String nombre, String localidad) {
		// TODO Auto-generated method stub
		return null;
	}

	public Hotel modificarHotel(Hotel nuevo) {
		// TODO Auto-generated method stub
		return null;
	}

	public Hotel[] hoteles() {
		// TODO Auto-generated method stub
		return null;
	}

}
