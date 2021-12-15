package fr.solutec.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
	public List<Person> findByNom(String nom);
	
	@Query(value = "SELECT p FROM Person p WHERE p.nom = ?1")
	public List<Person> getByNom(String nom);
	
	public Optional<Person> findByLoginAndPassword(String login, String password);

}
