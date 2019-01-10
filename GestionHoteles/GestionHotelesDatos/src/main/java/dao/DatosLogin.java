package dao;

import javax.ejb.Stateless;

import is.unican.es.ILoginDAO;

@Stateless
public class DatosLogin implements ILoginDAO{

	protected static DatosLogin instancia = null;
	
	protected DatosLogin() {
		
	}
	
	public DatosLogin getInstance() {
		if(instancia == null) {
			instancia = new DatosLogin();
		}
		return instancia;
	}
	
	public boolean comprobarUsuario(String user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean IniciarSesion(String user, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean comprobarEstado(String user) {
		// TODO Auto-generated method stub
		return false;
	}

}
