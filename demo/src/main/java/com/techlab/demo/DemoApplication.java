package com.techlab.demo;

import com.techlab.demo.entity.Role;
import com.techlab.demo.entity.Usuario;
import com.techlab.demo.repository.RoleRepository;
import com.techlab.demo.repository.UserRepository;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();
		String dbPassword = dotenv.get("MY_CONTRASENA");

		if (dbPassword != null) {
			System.setProperty("MY_CONTRASENA", dbPassword);
		}

		SpringApplication.run(DemoApplication.class, args);
	}
/*
	@Bean
	CommandLineRunner initAdmin(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder password){
		return args ->{
			if(userRepository.findByUsername("admin").isEmpty()){
				Role adminRole = roleRepository.findByName("ROLE_ADMIN")
						.orElseGet(() -> roleRepository.save(new Role(null, "ROLE_ADMIN")));

				Usuario admin = new Usuario();
				admin.setUsername("admin");
				admin.setPassword(password.encode("admin123"));
				admin.setRoles(List.of(adminRole));

				userRepository.save(admin);
				System.out.println("admin creado con exito");
			}
		};
	}*/

}
