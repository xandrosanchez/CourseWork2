package com.example.coursework2.service;

import com.example.coursework2.exceptions.FewerQuestionsException;
import com.example.coursework2.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) throws FewerQuestionsException {
        Set<Question> forReturn = new HashSet<>();
        if (questionService.getAll().size() < amount){
            throw new FewerQuestionsException("need <= " + questionService.getAll().size() + " questions");
        }else {
            while (forReturn.size() != amount){
                forReturn.add(questionService.getRandomQuestion());
            }
        }
        return forReturn;
    }
}
