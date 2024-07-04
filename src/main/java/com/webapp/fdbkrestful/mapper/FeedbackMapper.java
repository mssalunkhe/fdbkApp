package com.webapp.fdbkrestful.mapper;

import com.webapp.fdbkrestful.dto.FeedbackDto;
import com.webapp.fdbkrestful.entity.Feedback;

public class FeedbackMapper {
    public static FeedbackDto mapToFeedbackDto(Feedback feedback) {
        return new FeedbackDto(feedback.getId(), feedback.getTitle(), feedback.getStartDate(), feedback.getEndDate(),
                feedback.getAcademicYear(), feedback.getSemester(), feedback.getOnFacility(), feedback.getGivers(), feedback.getTakers(), feedback.getQuestionnaire(), feedback.getDescription());
    }

    public static Feedback mapToFeedback(FeedbackDto feedbackDto) {
        return new Feedback(feedbackDto.getId(), feedbackDto.getTitle(), feedbackDto.getStartDate(), feedbackDto.getEndDate(),
                feedbackDto.getAcademicYear(), feedbackDto.getSemester(), feedbackDto.getOnFacility(), feedbackDto.getGivers(), feedbackDto.getTakers(), feedbackDto.getQuestionnaire(), feedbackDto.getDescription());
    }
}
