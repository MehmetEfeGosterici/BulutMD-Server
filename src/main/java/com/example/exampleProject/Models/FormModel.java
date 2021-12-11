package com.example.exampleProject.Models;



import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="applicant")
@Data
public class FormModel {

    @Id
    Long id;

    String name;
    String IdentityNum;
    String email;
    String phone;
    String address;
    Date dob;
    String Q1;
    String Q2;
    String Q3;
    String Q4;
    String Q5;
}
    /*
    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-jdbc</artifactId>
		</dependency>
    * */