package com.salle.menu.Implementacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.salle.menu.Dao.IUsuarioDao;
import com.salle.menu.entities.Usuario;
import com.salle.menu.Services.IUsuarioServices;

@Service
public class ClienteServices implements IUsuarioServices {
	
	@Autowired
	private IUsuarioDao clienteDao;
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
	return (List<Usuario>) clienteDao.findAll();
	}
	@Transactional(readOnly = false)
	public Usuario create(Usuario usuario){
	System.out.println(usuario.getDependencia());
	return clienteDao.save(usuario);
	}
	

}
