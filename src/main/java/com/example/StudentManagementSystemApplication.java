
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.studentmanagement")
@EnableJpaRepositories(
    basePackages = "com.example.studentmanagement.repository"
)
public class StudentManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(
            StudentManagementSystemApplication.class, args);
    }
}
