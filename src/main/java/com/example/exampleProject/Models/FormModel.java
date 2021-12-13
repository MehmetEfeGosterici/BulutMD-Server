package com.example.exampleProject.Models;



import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="applicant")
@Data
public class FormModel {

    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String IdentityNum;
    private String email;
    private String phone;
    private String address;
    private Date dob;
    private String q1;
    private String q2;
    private String q3;
    private String q4;
    private String q5;

    public FormModel(){

    }

    public FormModel(String name, String identityNum, String email, String phone, String address, Date dob, String q1, String q2, String q3, String q4, String q5) {
        this.name = name;
        IdentityNum = identityNum;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.dob = dob;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
    }
}