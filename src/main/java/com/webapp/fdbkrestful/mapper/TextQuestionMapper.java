package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.TextQuestionDto;
import com.webapp.fdbkrestful.entity.TextQuestion;

public class TextQuestionMapper {
    public static TextQuestionDto mapToTextQuestionDto(TextQuestion textQuestion) {
        return new TextQuestionDto(textQuestion.getId(), textQuestion.getText());
    }

    public static TextQuestion mapToTextQuestion(TextQuestionDto textQuestionDto) {
        return new TextQuestion(textQuestionDto.getId(), textQuestionDto.getText());
    }
}
