package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.QuestionDto;

import java.util.List;

public interface QuestionService {
    public QuestionDto createQuestion(QuestionDto questionDto);

    public QuestionDto getQuestionByID(int id);

    public List<QuestionDto> getAllQuestions();

    public QuestionDto updateQuestion(int id, QuestionDto questionDto);

    public QuestionDto deleteQuestion(int id);
}
