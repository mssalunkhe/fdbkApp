package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.AnswerDto;
import com.webapp.fdbkrestful.entity.Answer;

public class AnswerMapper {
    public static AnswerDto mapToAnswerDto(Answer answer) {
        return new AnswerDto(answer.getId(), answer.getFeedback(), answer.getGiver(), answer.getTaker(), answer.getQuestion(), answer.getAnswer());
    }

    public static Answer mapToAnswer(AnswerDto answerDto) {
        return new Answer(answerDto.getId(), answerDto.getFeedback(), answerDto.getGiver(), answerDto.getTaker(), answerDto.getQuestion(), answerDto.getAnswer());
    }
}
