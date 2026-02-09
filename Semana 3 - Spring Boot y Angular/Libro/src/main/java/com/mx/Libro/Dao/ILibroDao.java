package com.mx.Libro.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.Libro.Dominio.Libro;

@Repository //es una anotacion que nos indica que es un repositprio y contiene datos o metodos 
//que nos ayudaran a la configuracion de otra clase, se entien bean y pasa a ser administtrado
//por el contenedor de beans de spring y puede ser inyectado despues
public interface ILibroDao extends CrudRepository<Libro, Integer>{

}
