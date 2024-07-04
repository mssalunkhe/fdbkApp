package com.webapp.fdbkrestful.service;

import com.webapp.fdbkrestful.dto.FeedbackDto;

import java.util.List;

public interface FeedbackService {
    public FeedbackDto createFeedback(FeedbackDto feedbackDto);

    public FeedbackDto getFeedbackByID(int id);

    public List<FeedbackDto> getAllFeedbacks();

    public FeedbackDto updateFeedback(int id, FeedbackDto feedbackDto);

    public FeedbackDto deleteFeedback(int id);
}
