package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.QuestionDto;
import com.webapp.fdbkrestful.entity.Question;

public class QuestionMapper {
    public static QuestionDto mapToQuestionDto(Question question) {
        return new QuestionDto(question.getId(), question.getText());
    }

    public static Question mapToQuestion(QuestionDto questionDto) {
        return new Question(questionDto.getId(), questionDto.getText());
    }
}
