package com.nutricionista.digital.NutricionistaDigital;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NutricionistaDigitalApplication {

	@Bean
	public CommandLineRunner execultar(){
		return args -> {
			System.out.println("Testando Spring");
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(NutricionistaDigitalApplication.class, args);
	}

}
