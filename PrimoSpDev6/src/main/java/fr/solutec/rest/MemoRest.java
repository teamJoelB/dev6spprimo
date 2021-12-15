package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Memo;
import fr.solutec.repository.MemoRepository;

@RestController @CrossOrigin("*")
public class MemoRest {
	@Autowired
	private MemoRepository memoRepo;
	
	@GetMapping("memo/privee")
	public List<Memo> recupMemoPrivee(){
		return memoRepo.findByPriveeIsTrue();
	}
}
