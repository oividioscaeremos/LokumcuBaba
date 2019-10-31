package com.bulutmd.lokumcubaba.controller;

import com.bulutmd.lokumcubaba.model.Applicant;
import com.bulutmd.lokumcubaba.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class HomeContoller {

    @Autowired
    private ApplicantRepository dao;

    @GetMapping(value = "")
    public ModelAndView getApplicationPage(){
        ModelAndView model = new ModelAndView();
        Applicant applicant = new Applicant();
        model.addObject("applicant", applicant);
        model.setViewName("index");

        return model;
    }


    @PostMapping("/save")
    public String saveApplicant(@Valid @ModelAttribute("applicant") Applicant applicant, BindingResult result){
        if (result.hasErrors()) {
            if (applicant.getYatirim_miktari() == 0){
                result.addError(new FieldError("applicant", "yatirim_miktari", "Yatırım Miktarı 0 Olamaz."));
            }
            return "index";
        }

        if (applicant.getYatirim_miktari() == 0){
            result.addError(new FieldError("applicant", "yatirim_miktari", "Yatırım Miktarı 0 Olamaz."));
            return "index";
        }

        if(dao.getIfDuplicate(applicant.getTckn()) != null){
            result.addError(new FieldError("applicant", "tckn", "Daha Önce Aynı Kimlik Numarasıyla Başvuru Yapılmış."));
            return "index";
        }
        dao.save(applicant);
        return "success";
    }
}
