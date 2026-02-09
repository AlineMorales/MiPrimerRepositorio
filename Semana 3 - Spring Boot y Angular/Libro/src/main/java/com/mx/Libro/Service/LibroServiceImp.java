package com.mx.Libro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Libro.Dao.ILibroDao;
import com.mx.Libro.Dominio.Libro;

@Service //esta anotacion indica que mi clase es una clase de servicio y que esta contiene logica
//de noegicios y configuracion importante que despues sera inyectada en otra clase

public class LibroServiceImp implements ILibroService{
	
	@Autowired //es la anotacion que intidca que voy a inyectar una clase o metodo
	//tipo de patron de diseño, inyeccion de depenciad(DI)
	private ILibroDao dao;
	//estoy declrando que voy a ocupar los metodos que me ofrece el CRUDRepository para 
	//modificar la base de datos

	@Override
	public void guardar(Libro libro) {
		dao.save(libro);
		
	}

	@Override
	public void editar(Libro libro) {
		dao.save(libro);
		
	}

	@Override
	public void eliminar(Libro libro) {
		dao.delete(libro);
		
	}

	@Override
	public Libro buscar(Libro libro) {
		
		return dao.findById(libro.getIdLibro()).orElse(null);
	}

	@Override
	public List<Libro> mostrar() {
		
		return (List<Libro>) dao.findAll() ;
	}

}
