package es.cj.dao;

import es.cj.bean.Conexion;
import es.cj.bean.Usuarios;

public interface UsuariosDAO {
	
	public Usuarios comprobarUsuario (String login, String password, Conexion c);

}
