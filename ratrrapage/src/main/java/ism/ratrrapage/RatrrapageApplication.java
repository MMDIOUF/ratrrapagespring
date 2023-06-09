package ism.ratrrapage;

import ism.ratrrapage.entities.Classe;
import ism.ratrrapage.entities.Etudiant;
import ism.ratrrapage.entities.Inscription;
import ism.ratrrapage.repository.ClasseRepository;
import ism.ratrrapage.repository.EtudiantRepository;
import ism.ratrrapage.repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@SpringBootApplication
public class RatrrapageApplication implements CommandLineRunner {

	@Autowired
	private ClasseRepository classeRepository;



	@Autowired
	private EtudiantRepository etudiantRepository;

	@Autowired
	private InscriptionRepository inscriptionRepository;

	@DateTimeFormat(pattern = "dd/mm/yyyy")

	public static void main(String[] args) {
		SpringApplication.run(RatrrapageApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		for (int i = 1; i < 5; i++) {
			Classe cl=new Classe();
			cl.setFiliere("GLRS-"+i);
			cl.setNiveau("L"+i);
			cl.setLibelle(cl.getNiveau() + cl.getFiliere());

			classeRepository.save(cl);


			Etudiant etu = new Etudiant();
			etu.setMatricule("MAT_00" + i);
			etu.setNomComplet("etudiant" + i);
			etu.setTuteur("tuteur" + i);
			etu.setClasse(cl);
			etu.setLogin("etudiant" + i);
			etu.setPassword("password");
			etudiantRepository.save(etu);

			Inscription inscription=new Inscription();
			inscription.setDate(LocalDate.of(202+i,1+i,6+i)
			);
			inscription.setClasse(cl);
			inscription.setEtudiant(etu);
			inscriptionRepository.save(inscription);
		}

	}
}
