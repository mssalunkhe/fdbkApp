package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.TextQuestionDto;

import java.util.List;

public interface TextQuestionService {
    public TextQuestionDto createTextQuestion(TextQuestionDto textQuestionDto);

    public TextQuestionDto getTextQuestionByID(int id);

    public List<TextQuestionDto> getAllTextQuestions();

    public TextQuestionDto updateTextQuestion(int id, TextQuestionDto textQuestionDto);

    public TextQuestionDto deleteTextQuestion(int id);
}
