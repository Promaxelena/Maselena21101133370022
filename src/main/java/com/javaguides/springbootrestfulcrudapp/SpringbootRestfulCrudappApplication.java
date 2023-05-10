package com.javaguides.springbootrestfulcrudapp;

import com.javaguides.springbootrestfulcrudapp.model.Compliance;
import com.javaguides.springbootrestfulcrudapp.repository.ComplianceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRestfulCrudappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulCrudappApplication.class, args);
	}

	@Autowired
	private ComplianceRepository complianceRepository;
	@Override
	public void run(String... args) throws Exception {
		Compliance compliance = new Compliance();
		compliance.setFirstName("muss");
		compliance.setLastName("peter");
		compliance.setEmailId("maz@gmail.com");
		complianceRepository.save(compliance);


		Compliance compliance1 = new Compliance();
		compliance1.setFirstName("max");
		compliance1.setLastName("pet");
		compliance1.setEmailId("man@gmail.com");
		complianceRepository.save(compliance1);
	}
}
