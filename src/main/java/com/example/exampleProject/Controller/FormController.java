package com.example.exampleProject.Controller;

import com.example.exampleProject.Models.FormModel;
import com.example.exampleProject.Repositories.FormRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FormController {

    FormRepository formRepository;

    public FormController(FormRepository formRepository){
        this.formRepository = formRepository;
    }


    @GetMapping("/exampleProject")
    public String home(){
        return "jdbc:mysql://localhost:3306/?user=root";
    }

    @GetMapping("/")
    public List<FormModel> findAll(){
        return formRepository.findAll();
    }

    @PostMapping("/")
    public FormModel post(@RequestBody FormModel formModel){
        return formRepository.save(formModel);
    }
}
