package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.AnswerDto;

import java.util.List;

public interface AnswerService {
    public AnswerDto createAnswer(AnswerDto answerDto);

    public AnswerDto getAnswerByID(int id);

    public List<AnswerDto> getAllAnswers();

    public AnswerDto updateAnswer(int id, AnswerDto answerDto);

    public AnswerDto deleteAnswer(int id);
}
