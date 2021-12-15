package fr.solutec;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Memo;
import fr.solutec.entities.Person;
import fr.solutec.repository.MemoRepository;
import fr.solutec.repository.PersonRepository;

@SpringBootApplication
public class PrimoSpDev6Application implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepo;
	@Autowired
	private MemoRepository memoRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(PrimoSpDev6Application.class, args);
		System.out.println("lancement ok");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("debut de lancement");
		Person p1 = new Person(null, "CAGE ", "Nicolas", 57, "azerty", "qwerty");
		Person p2 = new Person(null, "Yannis ", "NOA", 48, "test", "test");
		Person p3 = new Person(null, "Julliette ", "ROMEO", 79, "banane", "ananas");
		personRepo.save(p1);
		personRepo.save(p2);
		personRepo.save(p3);
		
		Memo m1 = new Memo(null, "Astalaouego", false, p1);
		Memo m2 = new Memo(null, "Bad boy, bad boy", true, p2);
		Memo m3 = new Memo(null, "Outougenedoo", false, p1);
		Memo m4 = new Memo(null, "Will est au top", false, p3);
		Memo m5 = new Memo(null, "Cooolllll", false, p1);
		Memo m6 = new Memo(null, "Azeth ohikhjvsuydv jeysgufqsj", true, p2);
		
		Stream.of(m1, m2, m3, m4, m5, m6).forEach(m -> {
			memoRepo.save(m);
		});
	}

}
