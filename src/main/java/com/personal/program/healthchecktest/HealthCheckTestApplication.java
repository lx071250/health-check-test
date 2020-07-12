package com.personal.program.healthchecktest;

import com.personal.program.healthchecktest.dao.StudentMapper;
import com.personal.program.healthchecktest.entity.Student;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;
@MappedTypes(Student.class)

@MapperScan("com.personal.program.healthchecktest.dao")
@SpringBootApplication
public class HealthCheckTestApplication {


	public static void main(String[] args) {
		SpringApplication.run(HealthCheckTestApplication.class, args);
	}

}
