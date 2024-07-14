package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.QuestionnaireDto;
import com.webapp.fdbkrestful.entity.Questionnaire;

public class QuestionnaireMapper {
    public static QuestionnaireDto mapToQuestionnaireDto(Questionnaire questionnaire) {
        return new QuestionnaireDto(questionnaire.getId(),  questionnaire.getQuestions(), questionnaire.getTitle());
    }

    public static Questionnaire mapToQuestionnaire(QuestionnaireDto questionnaireDto) {
        return new Questionnaire(questionnaireDto.getId(),  questionnaireDto.getQuestions(), questionnaireDto.getTitle());
    }
}
