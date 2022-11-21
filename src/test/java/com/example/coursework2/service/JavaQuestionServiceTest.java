package com.example.coursework2.service;

import com.example.coursework2.model.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {

    JavaQuestionService javaQuestionService = new JavaQuestionService();

    @BeforeEach
    void setup(){
        javaQuestionService.add("1","one");
        javaQuestionService.add("2","two");
        javaQuestionService.add("3","three");
        javaQuestionService.add("4","four");
        javaQuestionService.add("5","five");
    }

    @Test
    void add() {
        assertEquals("question=: 6'answer=: six'", javaQuestionService.add("6","six"));
    }

    @Test
    void remove() {
        assertEquals("question=: 6'answer=: six'", javaQuestionService.remove(new Question("6","six")));
    }

    @Test
    void getAll() {
        assertEquals("[question=: 4'answer=: four'," +
                " question=: 1'answer=: one'," +
                " question=: 2'answer=: two'," +
                " question=: 5'answer=: five'," +
                " question=: 3'answer=: three']",javaQuestionService.getAll());
    }
}