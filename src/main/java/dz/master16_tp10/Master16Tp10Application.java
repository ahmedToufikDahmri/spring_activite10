package dz.master16_tp10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;



@SpringBootApplication
public class Master16Tp10Application implements CommandLineRunner{
	
	@Autowired
	
	PatientsRepository patientsRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(Master16Tp10Application.class, args);
		}
	


	@Override
	public void run(String... args) throws Exception {		
		
		 List<Patients> p = patientsRepository.findAll();
		 System.out.println(p);	
		
	}
	

	
}
