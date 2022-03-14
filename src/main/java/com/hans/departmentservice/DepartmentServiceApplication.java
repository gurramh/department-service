package com.hans.departmentservice;

import com.hans.departmentservice.model.Department;
import com.hans.departmentservice.repositories.DepartmentRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
@EnableJpaRepositories("com.hans.departmentservice.*")
@EntityScan("com.hans.departmentservice.*")
public class DepartmentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartmentServiceApplication.class, args);
    }


    @Bean
    ApplicationRunner runner(DepartmentRepository departmentRepository) {
        return args -> {
            Stream.of("IT", "Administration", "Sales", "Marketing", "Risk")
                    .map(name -> new Department(null, name, name + " Department"))
                    .forEach(departmentRepository::save);

            System.out.println("Departments from DB:: " +departmentRepository.findAll());
        };
    }

}
