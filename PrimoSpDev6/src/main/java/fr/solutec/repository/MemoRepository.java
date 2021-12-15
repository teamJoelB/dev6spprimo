package fr.solutec.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Memo;

public interface MemoRepository extends CrudRepository<Memo, Long> {
	public List<Memo> findByPriveeIsTrue();
}
