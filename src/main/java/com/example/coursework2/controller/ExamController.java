package com.example.coursework2.controller;

import com.example.coursework2.model.Question;
import com.example.coursework2.service.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequestMapping("/exam/get/")
@RestController
public class ExamController {

    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("")
    public Collection<Question> getQuestions(@RequestParam int amount){
        return examinerService.getQuestions(amount);
    }


}
