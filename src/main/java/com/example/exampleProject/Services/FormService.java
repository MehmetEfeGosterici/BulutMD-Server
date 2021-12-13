package com.example.exampleProject.Services;

import com.example.exampleProject.Models.FormModel;
import com.example.exampleProject.Models.JspModel;
import com.example.exampleProject.Repositories.FormRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class FormService {

    FormRepository formRepository;

    public FormService(FormRepository formRepository){
        this.formRepository = formRepository;
    }

    public List<FormModel> getAll() {
        return formRepository.findAll();
    }

    public FormModel getById(Long id) {
        return formRepository.findById(id).orElse(null);
    }

    public FormModel save(FormModel formModel) {
        return formRepository.save(formModel);
    }

    public FormModel delete(Long id) {
        FormModel model = formRepository.findById(id).orElse(null);
        formRepository.deleteById(id);
        return model;
    }

    public FormModel update(Long id, FormModel model) {
        FormModel oldModel = formRepository.findById(id).orElse(null);
        oldModel.setName(model.getName());
        oldModel.setIdentityNum(model.getIdentityNum());
        oldModel.setEmail(model.getEmail());
        oldModel.setAddress(model.getAddress());
        oldModel.setDob(model.getDob());
        oldModel.setPhone(model.getPhone());
        oldModel.setQ1(model.getQ1());
        oldModel.setQ2(model.getQ2());
        oldModel.setQ3(model.getQ3());
        oldModel.setQ4(model.getQ4());
        oldModel.setQ5(model.getQ5());
        formRepository.save(oldModel);
        return oldModel;
    }

    public void jspSave(JspModel jspModel) {
        FormModel formModel = new FormModel(jspModel.getName(),
                jspModel.getIdentityNum(),jspModel.getEmail(),
                jspModel.getPhone(),jspModel.getAddress(), Date.valueOf(jspModel.getDob()),
                jspModel.getQ1(),jspModel.getQ2(),jspModel.getQ3(),jspModel.getQ4(),jspModel.getQ5());
        formRepository.save(formModel);
    }
}
