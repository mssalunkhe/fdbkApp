package com.webapp.fdbkrestful.dto;

import com.webapp.fdbkrestful.entity.Feedback;
import com.webapp.fdbkrestful.entity.Question;
import com.webapp.fdbkrestful.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionnaireDto {
    private int id;

    Set<QuestionDto> questionsDto;

    @Column
    private String title;
}
