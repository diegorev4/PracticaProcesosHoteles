import javax.ejb.Stateless;

import is.unican.es.IGestionLoginEJBRemote;

@Stateless
public class GestionLogin implements IGestionLoginEJBRemote{

	@Override
	public boolean iniciarSesion(String usuario, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cerrarSesion() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean estadoSesion() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
