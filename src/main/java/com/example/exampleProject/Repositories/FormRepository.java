package com.example.exampleProject.Repositories;

import com.example.exampleProject.Models.FormModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<FormModel,Long> {
}
