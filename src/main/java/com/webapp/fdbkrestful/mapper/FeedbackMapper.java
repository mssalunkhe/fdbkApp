package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.FeedbackDto;
import com.webapp.fdbkrestful.entity.Feedback;

import java.util.stream.Collectors;

public class FeedbackMapper {
    public static FeedbackDto mapToFeedbackDto(Feedback feedback) {
        return new FeedbackDto(feedback.getId(), feedback.getTitle(), feedback.getStartDate(), feedback.getEndDate(),
                feedback.getAcademicYear(), feedback.getSemester(), feedback.getOnFacility(), feedback.getGivers().stream().map(UserMapper::mapToUserDto).collect(Collectors.toSet()), feedback.getTakers().stream().map(UserMapper::mapToUserDto).collect(Collectors.toSet()), QuestionnaireMapper.mapToQuestionnaireDto(feedback.getQuestionnaire())==null?null:QuestionnaireMapper.mapToQuestionnaireDto(feedback.getQuestionnaire()), feedback.getDescription(),
                feedback.getResponses().stream().map(ResponseMapper::mapToResponseDto).collect(Collectors.toSet()),feedback.getCreatedOn(),feedback.getUpdatedOn(),feedback.getDeletedOn());
    }

    public static Feedback mapToFeedback(FeedbackDto feedbackDto) {
        return new Feedback(feedbackDto.getId(), feedbackDto.getTitle(), feedbackDto.getStartDate(), feedbackDto.getEndDate(),
                feedbackDto.getAcademicYear(), feedbackDto.getSemester(), feedbackDto.getOnFacility(), feedbackDto.getGivers().stream().map(UserMapper::mapToUser).collect(Collectors.toSet()), feedbackDto.getTakers().stream().map(UserMapper::mapToUser).collect(Collectors.toSet()), QuestionnaireMapper.mapToQuestionnaire(feedbackDto.getQuestionnaireDto())==null?null:QuestionnaireMapper.mapToQuestionnaire(feedbackDto.getQuestionnaireDto()), feedbackDto.getDescription(),
                feedbackDto.getResponses().stream().map(ResponseMapper::mapToResponse).collect(Collectors.toSet()),feedbackDto.getCreatedOn(),feedbackDto.getUpdatedOn(),feedbackDto.getDeletedOn()) ;
    }
}
