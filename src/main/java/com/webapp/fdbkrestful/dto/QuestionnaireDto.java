package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.entity.Feedback;
import com.webapp.fdbkrestful.entity.TextQuestion;
import com.webapp.fdbkrestful.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionnaireDto {
    private int id;

    Set<TextQuestionDto> questionsDto;


    private String title;
    private LocalDateTime createdOn;

    private LocalDateTime updatedOn;

    private LocalDateTime deletedOn;
}
