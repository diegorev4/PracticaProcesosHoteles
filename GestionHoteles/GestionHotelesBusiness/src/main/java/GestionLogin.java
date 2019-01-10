import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.DatosLogin;
import is.unican.es.IGestionLoginEJBRemote;

@Stateless
public class GestionLogin implements IGestionLoginEJBRemote{


	@EJB
	private DatosLogin dl;
	@Override
	public boolean iniciarSesion(String usuario, String pass) {
		
		return dl.IniciarSesion(usuario, pass);
	}


	public boolean cerrarSesion() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean estadoSesion() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
