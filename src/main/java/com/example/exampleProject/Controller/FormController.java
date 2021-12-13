package com.example.exampleProject.Controller;

import com.example.exampleProject.Models.FormModel;
import com.example.exampleProject.Models.JspModel;
import com.example.exampleProject.Repositories.FormRepository;
import com.example.exampleProject.Services.FormService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FormController {

    FormService formService;

    public FormController(FormService formService){
        this.formService = formService;
    }

    @GetMapping("/")
    public ModelAndView Jsp(){
        return new ModelAndView("index");
    }
    @RequestMapping(value = "/posted", method = RequestMethod.POST)
    public ModelAndView postJsp( JspModel jspModel){
        formService.jspSave(jspModel);
        return new ModelAndView("index");
    }

    @GetMapping("/api/v1")
    public List<FormModel> findAll(){
        return formService.getAll();
    }
    @GetMapping("/api/v1/{id}")
    public FormModel findbyId(@PathVariable Long id){
        return formService.getById(id);
    }
    @PostMapping("/api/v1")
    public FormModel post(@RequestBody FormModel formModel){
        return formService.save(formModel);
    }

    @DeleteMapping("/api/v1/{id}")
    public FormModel delete(@PathVariable Long id){
        return formService.delete(id);
    }

    @PutMapping("/api/v1/{id}")
    public FormModel update(@PathVariable Long id,@RequestBody FormModel newModel){
        return formService.update(id,newModel);
    }
}
