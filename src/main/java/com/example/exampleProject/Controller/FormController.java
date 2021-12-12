package com.example.exampleProject.Controller;

import com.example.exampleProject.Models.FormModel;
import com.example.exampleProject.Repositories.FormRepository;
import com.example.exampleProject.Services.FormService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController

public class FormController {

    FormService formService;

    public FormController(FormService formService){
        this.formService = formService;
    }

    @GetMapping("/tomcat")
    public String tomcat(){
        return "tomcat";
    }

    @GetMapping("/")
    public List<FormModel> findAll(){
        return formService.getAll();
    }
    @GetMapping("/{id}")
    public FormModel findbyId(@PathVariable Long id){
        return formService.getById(id);
    }
    @PostMapping("/")
    public FormModel post(@RequestBody FormModel formModel){
        return formService.save(formModel);
    }

    @DeleteMapping("/{id}")
    public FormModel delete(@PathVariable Long id){
        return formService.delete(id);
    }

    @PutMapping("/{id}")
    public FormModel update(@PathVariable Long id,@RequestBody FormModel newModel){
        return formService.update(id,newModel);
    }
}
