package com.example.coursework2.service;

import com.example.coursework2.model.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    Set<Question> questions = new HashSet<>();

    @BeforeEach
    void setup(){
        questions.add(new Question("1","one"));
        questions.add(new Question("2","two"));
        questions.add(new Question("3","three"));
        questions.add(new Question("4","four"));
        questions.add(new Question("5","five"));
    }

    @Mock
    private JavaQuestionService javaQuestionService;

    @InjectMocks
    private ExaminerServiceImpl examinerService;

    @Test
    void getQuestions() {
        when(javaQuestionService.getAll()).thenReturn(questions);
        when(javaQuestionService.getRandomQuestion()).thenReturn(new Question("3","three"));
        assertEquals(new Question("3","three"),examinerService.getQuestions(1));
    }
}