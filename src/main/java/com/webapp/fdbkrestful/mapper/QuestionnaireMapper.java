package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.QuestionnaireDto;
import com.webapp.fdbkrestful.entity.Questionnaire;

import java.util.stream.Collectors;

public class QuestionnaireMapper {
    public static QuestionnaireDto mapToQuestionnaireDto(Questionnaire questionnaire) {
        return new QuestionnaireDto(questionnaire.getId(),  (questionnaire.getQuestions()).stream().map(TextQuestionMapper::mapToTextQuestionDto).collect(Collectors.toSet()).isEmpty()?null:
                questionnaire.getQuestions().stream().map(TextQuestionMapper::mapToTextQuestionDto).collect(Collectors.toSet()), questionnaire.getTitle(),questionnaire.getCreatedOn(),questionnaire.getUpdatedOn(),questionnaire.getDeletedOn());
    }

    public static Questionnaire mapToQuestionnaire(QuestionnaireDto questionnaireDto) {
        return new Questionnaire(questionnaireDto.getId(),  questionnaireDto.getQuestionsDto().stream().map(TextQuestionMapper::mapToTextQuestion).collect(Collectors.toSet()).isEmpty()?null:
                questionnaireDto.getQuestionsDto().stream().map(TextQuestionMapper::mapToTextQuestion).collect(Collectors.toSet()), questionnaireDto.getTitle(),questionnaireDto.getCreatedOn(),questionnaireDto.getUpdatedOn(),questionnaireDto.getDeletedOn());
    }
}
