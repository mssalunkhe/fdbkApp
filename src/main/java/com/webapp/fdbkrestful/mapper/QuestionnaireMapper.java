package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.QuestionnaireDto;
import com.webapp.fdbkrestful.entity.Questionnaire;

import java.util.stream.Collectors;

public class QuestionnaireMapper {
    public static QuestionnaireDto mapToQuestionnaireDto(Questionnaire questionnaire) {
        return new QuestionnaireDto(questionnaire.getId(),  (questionnaire.getQuestions()).stream().map(QuestionMapper::mapToQuestionDto).collect(Collectors.toSet()), questionnaire.getTitle());
    }

    public static Questionnaire mapToQuestionnaire(QuestionnaireDto questionnaireDto) {
        return new Questionnaire(questionnaireDto.getId(),  questionnaireDto.getQuestionsDto().stream().map(QuestionMapper::mapToQuestion).collect(Collectors.toSet()), questionnaireDto.getTitle());
    }
}
