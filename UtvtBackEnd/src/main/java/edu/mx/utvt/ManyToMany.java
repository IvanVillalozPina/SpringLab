package edu.mx.utvt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mx.utvt.data.entities.Alumn;
import edu.mx.utvt.data.entities.Categoria;
import edu.mx.utvt.data.repositories.CategoriaRepository;
import edu.mx.utvt.data.repositories.UserRepository;

@SpringBootTest
public class ManyToMany {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Test
	public void addCategorias() {
		
		Alumn alumn = null;
		Categoria categoria1 = null;
		Categoria categoria2 = null;
		List<Categoria> categorias = null;
		
		// Obtenemos el alumno al cual se relacionaran las categorías
		alumn = (Alumn) this.userRepository.findById(11L).orElse(null);
		
		//Nuevas categorías
		categoria1 = new Categoria("Deportes", "Eventos deportivos");
		categoria2 = new Categoria("Fiestas", "Eventos de fin de semana");
		
		//Asignacion de categorias al listado
		categorias = new ArrayList<Categoria>();
		categorias.add(categoria1);
		categorias.add(categoria2);
		
		//Creacion de categoria y relacion de estas con el obj alumno
		alumn.setCategorias(categorias);
		this.userRepository.save(alumn);
	}
	@Test
	public void findOutUserAndCategorias() {
		Alumn alumn = null;
		//obtenemos el alumno
		alumn = (alumn) this.userRepository.findById(11L).orElse(null);
		//Imprimir categoriaws relacionadas
		alumn.getCategorias().forEach(e -> System.out.println(e));
	}
	
	@Test
	public void deleteLinkingUserCategoria() {
		
		Alumn alumn = null;
		//Obtenemos el alumno al cual se le eliminará la relacion con sus categorias
		alumn = (Alumn) this.userRepository.findById(11L).orElse(null);
		alumn.setCategorias(null);
		
		//Se eliminan las relaciones entre User y Categoria
		this.userRepository.save(alumn);
	}
	
	@Test
	public void deleteCategoria() {
		Long categoriaId = 5L;
		Categoria categoria = null;
		
		categoria = this.categoriaRepository.findById(categoriaId).orElse(null);
		
		if(categoria != null)
			this.categoriaRepository.deleteById(categoriaId);
	}
	
	
	
	
}
